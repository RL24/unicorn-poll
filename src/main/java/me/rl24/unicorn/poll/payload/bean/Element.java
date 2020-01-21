package me.rl24.unicorn.poll.payload.bean;

public class Element {

    private String type;
    private Text placeholder;
    private ElementOption[] options;
    private boolean multiline;

    public String getType() {
        return type;
    }

    public Element setType(String type) {
        this.type = type;
        return this;
    }

    public Text getPlaceholder() {
        return placeholder;
    }

    public Element setPlaceholder(Text placeholder) {
        this.placeholder = placeholder;
        return this;
    }

    public ElementOption[] getOptions() {
        return options;
    }

    public Element setOptions(ElementOption[] options) {
        this.options = options;
        return this;
    }

    public boolean isMultiline() {
        return multiline;
    }

    public Element setMultiline(boolean multiline) {
        this.multiline = multiline;
        return this;
    }
}
