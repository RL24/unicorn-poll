package me.rl24.unicorn.poll.payload.bean;

import com.google.gson.annotations.SerializedName;

public class Profile {

    private String email, team;

    @SerializedName("avatar_hash")
    private String avatarHash;
    @SerializedName("status_text")
    private String statusText;
    @SerializedName("status_emoji")
    private String statusEmoji;
    @SerializedName("real_name")
    private String realName;
    @SerializedName("display_name")
    private String displayName;
    @SerializedName("real_name_normalized")
    private String realNameNormalized;
    @SerializedName("display_name_normalized")
    private String displayNameNormalized;
    @SerializedName("image_original")
    private String imageOriginal;
    @SerializedName("image_24")
    private String image24;
    @SerializedName("image_32")
    private String image32;
    @SerializedName("image_48")
    private String image48;
    @SerializedName("image_72")
    private String image72;
    @SerializedName("image_192")
    private String image192;
    @SerializedName("image_512")
    private String image512;

    public String getEmail() {
        return email;
    }

    public Profile setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getTeam() {
        return team;
    }

    public Profile setTeam(String team) {
        this.team = team;
        return this;
    }

    public String getAvatarHash() {
        return avatarHash;
    }

    public Profile setAvatarHash(String avatarHash) {
        this.avatarHash = avatarHash;
        return this;
    }

    public String getStatusText() {
        return statusText;
    }

    public Profile setStatusText(String statusText) {
        this.statusText = statusText;
        return this;
    }

    public String getStatusEmoji() {
        return statusEmoji;
    }

    public Profile setStatusEmoji(String statusEmoji) {
        this.statusEmoji = statusEmoji;
        return this;
    }

    public String getRealName() {
        return realName;
    }

    public Profile setRealName(String realName) {
        this.realName = realName;
        return this;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Profile setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public String getRealNameNormalized() {
        return realNameNormalized;
    }

    public Profile setRealNameNormalized(String realNameNormalized) {
        this.realNameNormalized = realNameNormalized;
        return this;
    }

    public String getDisplayNameNormalized() {
        return displayNameNormalized;
    }

    public Profile setDisplayNameNormalized(String displayNameNormalized) {
        this.displayNameNormalized = displayNameNormalized;
        return this;
    }

    public String getImageOriginal() {
        return imageOriginal;
    }

    public Profile setImageOriginal(String imageOriginal) {
        this.imageOriginal = imageOriginal;
        return this;
    }

    public String getImage24() {
        return image24;
    }

    public Profile setImage24(String image24) {
        this.image24 = image24;
        return this;
    }

    public String getImage32() {
        return image32;
    }

    public Profile setImage32(String image32) {
        this.image32 = image32;
        return this;
    }

    public String getImage48() {
        return image48;
    }

    public Profile setImage48(String image48) {
        this.image48 = image48;
        return this;
    }

    public String getImage72() {
        return image72;
    }

    public Profile setImage72(String image72) {
        this.image72 = image72;
        return this;
    }

    public String getImage192() {
        return image192;
    }

    public Profile setImage192(String image192) {
        this.image192 = image192;
        return this;
    }

    public String getImage512() {
        return image512;
    }

    public Profile setImage512(String image512) {
        this.image512 = image512;
        return this;
    }
}
