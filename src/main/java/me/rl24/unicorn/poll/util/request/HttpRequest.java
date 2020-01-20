package me.rl24.unicorn.poll.util.request;

import me.rl24.unicorn.poll.util.GsonHelper;
import me.rl24.unicorn.poll.util.PayloadHelper;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

public class HttpRequest implements GsonHelper {

    private HttpURLConnection connection;
    private RequestMethod requestMethod;
    private String payload;

    public HttpRequest setUrl(String url) throws IOException {
        connection = (HttpURLConnection) new URL(url).openConnection();
        return this;
    }

    public HttpRequest setMethod(RequestMethod requestMethod) throws ProtocolException {
        this.requestMethod = requestMethod;
        if (connection != null) connection.setRequestMethod(requestMethod.name());
        return this;
    }

    public HttpRequest setHeader(RequestHeader key, String value) {
        if (connection != null) connection.setRequestProperty(key.toString(), value);
        return this;
    }

    public HttpRequest setPayload(String payload) {
        this.payload = payload;
        return this;
    }

    public HttpRequest setPayload(Object obj) {
        this.payload = GSON.toJson(obj);
        return this;
    }

    public <T> T sendRequest(Class<T> retType) throws IOException {
        if (requestMethod.isDoOutput() && payload != null) {
            connection.setDoOutput(true);

            sendResponse(connection.getOutputStream());
        }

        return PayloadHelper.readPayload(connection.getInputStream(), retType);
    }

    public void sendResponse(OutputStream output) throws IOException {
        output.write(payload == null ? new byte[0] : payload.getBytes());
        output.flush();
        output.close();
    }

}
