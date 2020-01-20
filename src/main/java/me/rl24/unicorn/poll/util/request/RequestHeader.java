package me.rl24.unicorn.poll.util.request;

public enum RequestHeader {
    AUTHORIZATION("Authorization"),
    CONTENT_TYPE("Content-Type");

    private String name;

    RequestHeader(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
