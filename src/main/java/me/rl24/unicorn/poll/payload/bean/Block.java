package me.rl24.unicorn.poll.payload.bean;

import com.google.gson.annotations.SerializedName;
public class Block {

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

    public Block setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public Block setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public Block setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getTriggerId() {
        return triggerId;
    }

    public Block setTriggerId(String triggerId) {
        this.triggerId = triggerId;
        return this;
    }

    public String getTeamDomain() {
        return teamDomain;
    }

    public Block setTeamDomain(String teamDomain) {
        this.teamDomain = teamDomain;
        return this;
    }

    public String getTeamId() {
        return teamId;
    }

    public Block setTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    public boolean isText() {
        return text;
    }

    public Block setText(boolean text) {
        this.text = text;
        return this;
    }

    public String getChannelId() {
        return channelId;
    }

    public Block setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    public String getCommand() {
        return command;
    }

    public Block setCommand(String command) {
        this.command = command;
        return this;
    }

    public String getToken() {
        return token;
    }

    public Block setToken(String token) {
        this.token = token;
        return this;
    }

    public String getResponseUrl() {
        return responseUrl;
    }

    public Block setResponseUrl(String responseUrl) {
        this.responseUrl = responseUrl;
        return this;
    }

}
