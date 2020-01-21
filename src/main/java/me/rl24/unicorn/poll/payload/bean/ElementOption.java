package me.rl24.unicorn.poll.payload.bean;

public class ElementOption {

    private Text text;
    private String value;

    public Text getText() {
        return text;
    }

    public ElementOption setText(Text text) {
        this.text = text;
        return this;
    }

    public String getValue() {
        return value;
    }

    public ElementOption setValue(String value) {
        this.value = value;
        return this;
    }
}
