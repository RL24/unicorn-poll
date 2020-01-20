package me.rl24.unicorn.poll;

import org.springframework.boot.SpringApplication;

import java.io.IOException;

public class Main {

    static {
        System.setProperty("java.util.logging.SimpleFormatter.format", "[%1$tF %1$tT] [%4$-1s] %5$s %n");
    }

    public static void main(String[] args) throws IOException {
        SpringApplication.run(Server.class, args);
    }

}
