package me.rl24.unicorn.poll.util.request;

import com.google.gson.reflect.TypeToken;
import me.rl24.unicorn.poll.util.GsonHelper;
import me.rl24.unicorn.poll.util.PayloadHelper;
import org.apache.logging.log4j.util.Strings;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.*;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class HttpRequest implements GsonHelper {

    private static final Logger LOGGER = Logger.getLogger(HttpRequest.class.getSimpleName());

    private String url;
    private RequestMethod requestMethod;
    private Set<HeaderPair<RequestHeader, String>> headers = new HashSet<>();
    private String payload;
    private boolean payloadAsParameters;

    public HttpRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public HttpRequest setMethod(RequestMethod requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }

    public HttpRequest setHeader(RequestHeader key, String value) {
        headers.add(new HeaderPair<>(key, value));
        return this;
    }

    public HttpRequest setPayload(String payload) {
        this.payload = payload;
        return this;
    }

    public HttpRequest setPayload(Object payload) {
        this.payload = GSON.toJson(payload);
        return this;
    }

    public HttpRequest setPayloadAsParameters(boolean payloadAsParameters) {
        this.payloadAsParameters = payloadAsParameters;
        return this;
    }

    public <T> T sendRequest(Class<T> retType) throws IOException, URISyntaxException {
        Map<String, Object> map = GSON.fromJson(payload, new TypeToken<Map<String, Object>>(){}.getType());
        String payloadQuery = map.entrySet().stream().map((entry) -> String.format("%s=%s", entry.getKey(), entry.getValue())).collect(Collectors.joining("&"));
        URI uri = new URI(url);
        if (payloadAsParameters) {
            uri = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), uri.getQuery() == null ? payloadQuery : String.format("%s&%s", uri.getQuery(), payloadQuery), uri.getFragment());
            payload = "";
        }

        LOGGER.info(String.format("Sending '%s' request to '%s', with payload '%s'", requestMethod, uri, payload));
        HttpURLConnection connection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        if (payload != null) {
            connection.setDoOutput(true);

            sendResponse(connection.getOutputStream());
        }

        T obj = PayloadHelper.readPayload(connection.getInputStream(), retType);
        LOGGER.info(String.format("Reading response from request: %s", GSON.toJson(obj)));
        return obj;
    }

    public void sendResponse(OutputStream output) throws IOException {
        output.write(payload == null ? new byte[0] : payload.getBytes());
        output.flush();
        output.close();
    }

}
