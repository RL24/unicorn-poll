package me.rl24.unicorn.poll.payload.bean;

import com.google.gson.annotations.SerializedName;

public class User {

    private String id, name, color, tz;
    private boolean deleted;
    private Profile profile;
    private long updated;

    @SerializedName("team_id")
    private String teamId;
    @SerializedName("real_name")
    private String realName;
    @SerializedName("tz_label")
    private String tzLabel;
    @SerializedName("tz_offset")
    private String tzOffset;
    @SerializedName("is_admin")
    private boolean isAdmin;
    @SerializedName("is_owner")
    private boolean isOwner;
    @SerializedName("is_primary_owner")
    private boolean isPrimaryOwner;
    @SerializedName("is_restricted")
    private boolean isRestricted;
    @SerializedName("is_ultra_restricted")
    private boolean isUltraRestricted;
    @SerializedName("is_bot")
    private boolean isBot;
    @SerializedName("is_app_user")
    private boolean isAppUser;
    @SerializedName("has_2fa")
    private boolean has2FA;

    public String getId() {
        return id;
    }

    public User setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getColor() {
        return color;
    }

    public User setColor(String color) {
        this.color = color;
        return this;
    }

    public String getTz() {
        return tz;
    }

    public User setTz(String tz) {
        this.tz = tz;
        return this;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public User setDeleted(boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    public Profile getProfile() {
        return profile;
    }

    public User setProfile(Profile profile) {
        this.profile = profile;
        return this;
    }

    public long getUpdated() {
        return updated;
    }

    public User setUpdated(long updated) {
        this.updated = updated;
        return this;
    }

    public String getTeamId() {
        return teamId;
    }

    public User setTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    public String getRealName() {
        return realName;
    }

    public User setRealName(String realName) {
        this.realName = realName;
        return this;
    }

    public String getTzLabel() {
        return tzLabel;
    }

    public User setTzLabel(String tzLabel) {
        this.tzLabel = tzLabel;
        return this;
    }

    public String getTzOffset() {
        return tzOffset;
    }

    public User setTzOffset(String tzOffset) {
        this.tzOffset = tzOffset;
        return this;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public User setAdmin(boolean admin) {
        isAdmin = admin;
        return this;
    }

    public boolean isOwner() {
        return isOwner;
    }

    public User setOwner(boolean owner) {
        isOwner = owner;
        return this;
    }

    public boolean isPrimaryOwner() {
        return isPrimaryOwner;
    }

    public User setPrimaryOwner(boolean primaryOwner) {
        isPrimaryOwner = primaryOwner;
        return this;
    }

    public boolean isRestricted() {
        return isRestricted;
    }

    public User setRestricted(boolean restricted) {
        isRestricted = restricted;
        return this;
    }

    public boolean isUltraRestricted() {
        return isUltraRestricted;
    }

    public User setUltraRestricted(boolean ultraRestricted) {
        isUltraRestricted = ultraRestricted;
        return this;
    }

    public boolean isBot() {
        return isBot;
    }

    public User setBot(boolean bot) {
        isBot = bot;
        return this;
    }

    public boolean isAppUser() {
        return isAppUser;
    }

    public User setAppUser(boolean appUser) {
        isAppUser = appUser;
        return this;
    }

    public boolean isHas2FA() {
        return has2FA;
    }

    public User setHas2FA(boolean has2FA) {
        this.has2FA = has2FA;
        return this;
    }
}
