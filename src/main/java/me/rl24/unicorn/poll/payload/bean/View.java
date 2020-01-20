package me.rl24.unicorn.poll.payload.bean;

import com.google.gson.annotations.SerializedName;
public class View {

    private String id;
    @SerializedName("team_id") private String teamId;
    private String type;
    private Block[] blocks;
    @SerializedName("private_metadata") private String privateMetadata;
    @SerializedName("callback_id") private String callbackId;
    private State state;
    private String hash;
    private Text title;
    @SerializedName("clear_on_close") private boolean clearOnClose;
    @SerializedName("notify_on_close") private boolean notifyOnClose;
    private Object close;
    private Object submit;
    @SerializedName("previous_view_id") private Object previousViewId;
    @SerializedName("root_view_id") private Object rootViewId;
    @SerializedName("app_id") private String appId;
    @SerializedName("external_id") private String externalId;
    @SerializedName("app_installed_team_id") private String appInstalledTeamId;
    @SerializedName("bot_id") private String botId;

    public String getId() {
        return id;
    }

    public View setId(String id) {
        this.id = id;
        return this;
    }

    public String getTeamId() {
        return teamId;
    }

    public View setTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    public String getType() {
        return type;
    }

    public View setType(String type) {
        this.type = type;
        return this;
    }

    public Block[] getBlocks() {
        return blocks;
    }

    public View setBlocks(Block[] blocks) {
        this.blocks = blocks;
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

    public State getState() {
        return state;
    }

    public View setState(State state) {
        this.state = state;
        return this;
    }

    public String getHash() {
        return hash;
    }

    public View setHash(String hash) {
        this.hash = hash;
        return this;
    }

    public Text getTitle() {
        return title;
    }

    public View setTitle(Text title) {
        this.title = title;
        return this;
    }

    public boolean isClearOnClose() {
        return clearOnClose;
    }

    public View setClearOnClose(boolean clearOnClose) {
        this.clearOnClose = clearOnClose;
        return this;
    }

    public boolean isNotifyOnClose() {
        return notifyOnClose;
    }

    public View setNotifyOnClose(boolean notifyOnClose) {
        this.notifyOnClose = notifyOnClose;
        return this;
    }

    public Object getClose() {
        return close;
    }

    public View setClose(Object close) {
        this.close = close;
        return this;
    }

    public Object getSubmit() {
        return submit;
    }

    public View setSubmit(Object submit) {
        this.submit = submit;
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
