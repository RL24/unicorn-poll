package me.rl24.unicorn.poll.router;

import me.rl24.unicorn.poll.payload.UsersInfoRequestPayload;
import me.rl24.unicorn.poll.payload.UsersInfoResponsePayload;
import me.rl24.unicorn.poll.payload.ViewsOpenRequestPayload;
import me.rl24.unicorn.poll.payload.ViewsOpenResponsePayload;
import me.rl24.unicorn.poll.payload.bean.Block;
import me.rl24.unicorn.poll.payload.bean.Element;
import me.rl24.unicorn.poll.payload.bean.Text;
import me.rl24.unicorn.poll.payload.bean.View;
import me.rl24.unicorn.poll.util.EnvironmentHelper;
import me.rl24.unicorn.poll.util.GsonHelper;
import me.rl24.unicorn.poll.util.request.HttpRequest;
import me.rl24.unicorn.poll.util.request.RequestHeader;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Logger;

@RestController
public class CommandPollCreateRouter implements GsonHelper, EnvironmentHelper {

    private static final Logger LOGGER = Logger.getLogger(CommandPollCreateRouter.class.getSimpleName());

    @PostMapping(value = "/upoll/create", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String onCreate(@RequestBody MultiValueMap<String, String> paramMap) {
        LOGGER.info("Received request at /upoll/create");
        LOGGER.info(String.format("Request payload: %s", GSON.toJson(paramMap)));
        try {
            UsersInfoRequestPayload usersInfoRequestPayload = new UsersInfoRequestPayload()
                    .setToken(getSlackToken())
                    .setUser(paramMap.getFirst("user_id"));

            HttpRequest usersInfoRequest = new HttpRequest()
                    .setUrl("https://slack.com/api/users.info")
                    .setMethod(RequestMethod.POST)
                    .setHeader(RequestHeader.CONTENT_TYPE, "application/x-www-form-urlencoded")
                    .setPayload(usersInfoRequestPayload)
                    .setPayloadAsParameters(true);

            UsersInfoResponsePayload usersInfoResponsePayload = usersInfoRequest.sendRequest(UsersInfoResponsePayload.class);
            LOGGER.info(String.format("User creating poll: %s", GSON.toJson(usersInfoResponsePayload)));

            View view = new View()
                    .setType("modal")
                    .setTitle(new Text()
                            .setType("plain_text")
                            .setText("Create a Poll")
                            .setEmoji(true))
                    .setSubmit(new Text()
                            .setType("plain_text")
                            .setText("Submit")
                            .setEmoji(true))
                    .setClose(new Text()
                            .setType("plain_text")
                            .setText("Close")
                            .setEmoji(true))
                    .setBlocks(new Block[]{
                            new Block()
                                    .setType("section")
                                    .setText(new Text()
                                            .setType("plain_text")
                                            .setText(String.format(":wave: Hey %s!\n\nFill out the following form to create a Poll", usersInfoResponsePayload.getUser().getProfile().getRealNameNormalized()))
                                            .setEmoji(true)),
                            new Block().setType("divider"),
                            new Block()
                                    .setType("input")
                                    .setLabel(new Text()
                                            .setType("plain_text")
                                            .setText("Poll Question:")
                                            .setEmoji(true))
                                    .setElement(new Element()
                                            .setType("plain_text_input")
                                            .setMultiline(false))
                    });

            ViewsOpenRequestPayload viewsOpenRequestPayload = new ViewsOpenRequestPayload()
                    .setTriggerId(paramMap.getFirst("trigger_id"))
                    .setView(view);

            HttpRequest viewsOpenRequest = new HttpRequest()
                    .setUrl("https://slack.com/api/views.open")
                    .setMethod(RequestMethod.POST)
                    .setHeader(RequestHeader.CONTENT_TYPE, "application/json; charset=utf-8")
                    .setHeader(RequestHeader.AUTHORIZATION, String.format("Bearer %s", getSlackToken()))
                    .setPayload(viewsOpenRequestPayload);
            ViewsOpenResponsePayload openResponsePayload = viewsOpenRequest.sendRequest(ViewsOpenResponsePayload.class);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        return "";
    }
}
