package me.rl24.unicorn.poll.payload;

import com.google.gson.annotations.SerializedName;

public class CommandPollCreatePayload {

    @SerializedName("channel_name") private String channelName;
    @SerializedName("user_id") private String userId;
    @SerializedName("user_name") private String userName;
    @SerializedName("trigger_id") private String triggerId;
    @SerializedName("team_domain") private String teamDomain;
    @SerializedName("team_id") private String teamId;
    private boolean text;
    @SerializedName("channel_id") private String channelId;
    private String command;
    private String token;
    @SerializedName("response_url") private String responseUrl;

    public String getChannelName() {
        return channelName;
    }

    public CommandPollCreatePayload setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public CommandPollCreatePayload setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public CommandPollCreatePayload setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getTriggerId() {
        return triggerId;
    }

    public CommandPollCreatePayload setTriggerId(String triggerId) {
        this.triggerId = triggerId;
        return this;
    }

    public String getTeamDomain() {
        return teamDomain;
    }

    public CommandPollCreatePayload setTeamDomain(String teamDomain) {
        this.teamDomain = teamDomain;
        return this;
    }

    public String getTeamId() {
        return teamId;
    }

    public CommandPollCreatePayload setTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    public boolean isText() {
        return text;
    }

    public CommandPollCreatePayload setText(boolean text) {
        this.text = text;
        return this;
    }

    public String getChannelId() {
        return channelId;
    }

    public CommandPollCreatePayload setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    public String getCommand() {
        return command;
    }

    public CommandPollCreatePayload setCommand(String command) {
        this.command = command;
        return this;
    }

    public String getToken() {
        return token;
    }

    public CommandPollCreatePayload setToken(String token) {
        this.token = token;
        return this;
    }

    public String getResponseUrl() {
        return responseUrl;
    }

    public CommandPollCreatePayload setResponseUrl(String responseUrl) {
        this.responseUrl = responseUrl;
        return this;
    }
}
