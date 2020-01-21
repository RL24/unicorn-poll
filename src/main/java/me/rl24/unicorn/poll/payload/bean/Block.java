package me.rl24.unicorn.poll.payload.bean;

public class Block {

    private String type;
    private Text text, label;
    private Element element;
    private boolean optional;

    public String getType() {
        return type;
    }

    public Block setType(String type) {
        this.type = type;
        return this;
    }

    public Text getText() {
        return text;
    }

    public Block setText(Text text) {
        this.text = text;
        return this;
    }

    public Text getLabel() {
        return label;
    }

    public Block setLabel(Text label) {
        this.label = label;
        return this;
    }

    public Element getElement() {
        return element;
    }

    public Block setElement(Element element) {
        this.element = element;
        return this;
    }

    public boolean isOptional() {
        return optional;
    }

    public Block setOptional(boolean optional) {
        this.optional = optional;
        return this;
    }
}
