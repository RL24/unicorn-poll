package me.rl24.unicorn.poll.payload.bean;

import com.google.gson.annotations.SerializedName;

public class View {

    private String id, type, hash;
    private Block[] blocks;
    private State state;
    private Text title, close, submit;

    @SerializedName("team_id")
    private String teamId;
    @SerializedName("private_metadata")
    private String privateMetadata;
    @SerializedName("callback_id")
    private String callbackId;
    @SerializedName("previous_view_id")
    private Object previousViewId;
    @SerializedName("root_view_id")
    private Object rootViewId;
    @SerializedName("app_id")
    private String appId;
    @SerializedName("external_id")
    private String externalId;
    @SerializedName("app_installed_team_id")
    private String appInstalledTeamId;
    @SerializedName("bot_id")
    private String botId;

    public String getId() {
        return id;
    }

    public View setId(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public View setType(String type) {
        this.type = type;
        return this;
    }

    public String getHash() {
        return hash;
    }

    public View setHash(String hash) {
        this.hash = hash;
        return this;
    }

    public Block[] getBlocks() {
        return blocks;
    }

    public View setBlocks(Block[] blocks) {
        this.blocks = blocks;
        return this;
    }

    public State getState() {
        return state;
    }

    public View setState(State state) {
        this.state = state;
        return this;
    }

    public Text getTitle() {
        return title;
    }

    public View setTitle(Text title) {
        this.title = title;
        return this;
    }

    public Text getClose() {
        return close;
    }

    public View setClose(Text close) {
        this.close = close;
        return this;
    }

    public Text getSubmit() {
        return submit;
    }

    public View setSubmit(Text submit) {
        this.submit = submit;
        return this;
    }

    public String getTeamId() {
        return teamId;
    }

    public View setTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    public String getPrivateMetadata() {
        return privateMetadata;
    }

    public View setPrivateMetadata(String privateMetadata) {
        this.privateMetadata = privateMetadata;
        return this;
    }

    public String getCallbackId() {
        return callbackId;
    }

    public View setCallbackId(String callbackId) {
        this.callbackId = callbackId;
        return this;
    }

    public Object getPreviousViewId() {
        return previousViewId;
    }

    public View setPreviousViewId(Object previousViewId) {
        this.previousViewId = previousViewId;
        return this;
    }

    public Object getRootViewId() {
        return rootViewId;
    }

    public View setRootViewId(Object rootViewId) {
        this.rootViewId = rootViewId;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public View setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }

    public View setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getAppInstalledTeamId() {
        return appInstalledTeamId;
    }

    public View setAppInstalledTeamId(String appInstalledTeamId) {
        this.appInstalledTeamId = appInstalledTeamId;
        return this;
    }

    public String getBotId() {
        return botId;
    }

    public View setBotId(String botId) {
        this.botId = botId;
        return this;
    }
}
