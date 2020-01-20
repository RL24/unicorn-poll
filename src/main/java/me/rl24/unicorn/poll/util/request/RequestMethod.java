package me.rl24.unicorn.poll.util.request;

public enum RequestMethod {
    GET(false),
    POST(true),
    HEAD(true),
    OPTIONS(true),
    PUT(true),
    DELETE(true),
    TRACE(true);

    private boolean doOutput;

    RequestMethod(boolean doOutput) {
        this.doOutput = doOutput;
    }

    public boolean isDoOutput() {
        return doOutput;
    }
}
