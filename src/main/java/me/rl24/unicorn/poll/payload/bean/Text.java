package me.rl24.unicorn.poll.payload.bean;

public class Text {

    private String type;
    private String text;
    private String emoji;

    public String getType() {
        return type;
    }

    public Text setType(String type) {
        this.type = type;
        return this;
    }

    public String getText() {
        return text;
    }

    public Text setText(String text) {
        this.text = text;
        return this;
    }

    public String getEmoji() {
        return emoji;
    }

    public Text setEmoji(String emoji) {
        this.emoji = emoji;
        return this;
    }

}
