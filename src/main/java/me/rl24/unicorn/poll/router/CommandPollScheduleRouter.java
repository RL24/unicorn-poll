package me.rl24.unicorn.poll.router;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import me.rl24.unicorn.poll.payload.CommandPollCreatePayload;
import me.rl24.unicorn.poll.payload.CreatePollOpenRequestPayload;
import me.rl24.unicorn.poll.payload.CreatePollOpenResponsePayload;
import me.rl24.unicorn.poll.payload.bean.Block;
import me.rl24.unicorn.poll.payload.bean.Text;
import me.rl24.unicorn.poll.payload.bean.View;
import me.rl24.unicorn.poll.util.EnvironmentHelper;
import me.rl24.unicorn.poll.util.GsonHelper;
import me.rl24.unicorn.poll.util.PayloadHelper;
import me.rl24.unicorn.poll.util.request.HttpRequest;
import me.rl24.unicorn.poll.util.request.RequestHeader;
import me.rl24.unicorn.poll.util.request.RequestMethod;

import java.io.IOException;

@Router("/upoll/schedule")
public class CommandPollScheduleRouter implements HttpHandler, GsonHelper, EnvironmentHelper {

    @Override
    public void handle(HttpExchange httpExchange) {
        try {
            CommandPollCreatePayload requestPayload = PayloadHelper.readPayload(httpExchange.getRequestBody(), CommandPollCreatePayload.class);
            httpExchange.sendResponseHeaders(200, 0);
            new HttpRequest().sendResponse(httpExchange.getResponseBody());

            View view = new View()
                    .setType("modal")
                    .setCallbackId("test-callback-id")
                    .setTitle(new Text().setType("plain_text").setText("This is my modals title"))
                    .setBlocks(new Block[0]);

            CreatePollOpenRequestPayload payload = new CreatePollOpenRequestPayload()
                    .setTriggerId(requestPayload.getTriggerId())
                    .setView(view);

            HttpRequest request = new HttpRequest()
                    .setUrl("https://slack.com/api/views.open")
                    .setMethod(RequestMethod.POST)
                    .setHeader(RequestHeader.CONTENT_TYPE, "application/json; charset=utf-8")
                    .setHeader(RequestHeader.AUTHORIZATION, String.format("Bearer %s", getSlackToken()))
                    .setPayload(payload);
            CreatePollOpenResponsePayload openResponsePayload = request.sendRequest(CreatePollOpenResponsePayload.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
