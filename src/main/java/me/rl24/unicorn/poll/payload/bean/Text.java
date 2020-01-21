package me.rl24.unicorn.poll.payload.bean;

public class Text {

    private String type, text;
    private boolean emoji;

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

    public boolean getEmoji() {
        return emoji;
    }

    public Text setEmoji(boolean emoji) {
        this.emoji = emoji;
        return this;
    }

}
