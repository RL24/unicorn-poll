package me.rl24.unicorn.poll.util;

public interface EnvironmentHelper {

    default String getSlackToken() {
        return System.getenv().get("SLACK_TOKEN");
    }

}
