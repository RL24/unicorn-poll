package me.rl24.unicorn.poll.router;

import me.rl24.unicorn.poll.payload.CommandPollCreatePayload;
import me.rl24.unicorn.poll.payload.CreatePollOpenRequestPayload;
import me.rl24.unicorn.poll.payload.CreatePollOpenResponsePayload;
import me.rl24.unicorn.poll.payload.bean.Block;
import me.rl24.unicorn.poll.payload.bean.Text;
import me.rl24.unicorn.poll.payload.bean.View;
import me.rl24.unicorn.poll.util.EnvironmentHelper;
import me.rl24.unicorn.poll.util.GsonHelper;
import me.rl24.unicorn.poll.util.request.HttpRequest;
import me.rl24.unicorn.poll.util.request.RequestHeader;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;
import java.util.logging.Logger;

@RestController
public class CommandPollCreateRouter implements GsonHelper, EnvironmentHelper {

    private static final Logger LOGGER = Logger.getLogger(CommandPollCreateRouter.class.getSimpleName());

    @RequestMapping(value = "/upoll/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @ResponseBody
    public String handle(MultiValueMap requestPayload) {
        LOGGER.info("Received request at /upoll/create");
        LOGGER.info(String.format("Request payload: %s", GSON.toJson(requestPayload)));
//        try {
//            View view = new View()
//                    .setType("modal")
//                    .setCallbackId("test-callback-id")
//                    .setTitle(new Text().setType("plain_text").setText("This is my modals title"))
//                    .setBlocks(new Block[0]);
//
//            CreatePollOpenRequestPayload payload = new CreatePollOpenRequestPayload()
//                    .setTriggerId(requestPayload.getTriggerId())
//                    .setView(view);
//
//            HttpRequest request = new HttpRequest()
//                    .setUrl("https://slack.com/api/views.open")
//                    .setMethod(RequestMethod.POST)
//                    .setHeader(RequestHeader.CONTENT_TYPE, "application/json; charset=utf-8")
//                    .setHeader(RequestHeader.AUTHORIZATION, String.format("Bearer %s", getSlackToken()))
//                    .setPayload(payload);
//            CreatePollOpenResponsePayload openResponsePayload = request.sendRequest(CreatePollOpenResponsePayload.class);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return "";
    }
}
