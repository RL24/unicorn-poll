package me.rl24.unicorn.poll;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import me.rl24.unicorn.poll.router.Router;
import me.rl24.unicorn.poll.util.EnvironmentHelper;
import org.reflections.Reflections;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

@SpringBootApplication
public class Server implements EnvironmentHelper {

    private static final Logger LOG = Logger.getLogger(Server.class.getName());
    private static final ExecutorService EXECUTOR = Executors.newFixedThreadPool(4);

    public Server() throws IOException {
        LOG.info("Starting server...");
        HttpServer server = HttpServer.create(new InetSocketAddress("localhost", getPort()), 0);
        server.setExecutor(EXECUTOR);

        LOG.info("Creating routers...");
        new Reflections(Server.class.getPackage().getName()).getSubTypesOf(HttpHandler.class).forEach((cls) -> {
            try {
                Router router = cls.getAnnotation(Router.class);
                if (router != null) {
                    HttpHandler instance = (HttpHandler) cls.getConstructors()[0].newInstance();
                    server.createContext(router.value(), instance);
                    LOG.info(String.format("Created route for '%s'", router.value()));
                }
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                LOG.severe(e.getMessage());
                e.printStackTrace();
                System.exit(0);
            }
        });

        server.start();
        LOG.info("Listening on port " + getPort());
    }

}
