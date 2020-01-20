package me.rl24.unicorn.poll.util;

public interface EnvironmentHelper {

    default int getPort() {
        try {
            return Integer.parseInt(System.getenv().get("PORT"));
        } catch (Exception e) {
            return 3000;
        }
    }

    default String getSlackToken() {
        return System.getenv().get("SLACK_TOKEN");
    }

}
