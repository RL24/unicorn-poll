package me.rl24.unicorn.poll.util;

import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.logging.Logger;

public class PayloadHelper implements GsonHelper {

    private static final Logger LOGGER = Logger.getLogger(PayloadHelper.class.getSimpleName());

    public static <T> T readPayload(InputStream stream, Class<T> cls) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null)
            sb.append(line);
        String compiled = sb.toString();

        JsonObject job = new JsonObject();
        if (!compiled.isEmpty()) {
            String[] parameters = compiled.split("&");
            if (parameters.length > 0)
                for (String parameter : parameters) {
                    String[] split = parameter.split("=");
                    if (split.length == 1)
                        job.addProperty(split[0], true);
                    else if (split.length == 2)
                        job.addProperty(split[0], URLDecoder.decode(split[1], "utf-8"));
                }
            else return GSON.fromJson(compiled, cls);
        }
        return GSON.fromJson(job, cls);
    }

}
