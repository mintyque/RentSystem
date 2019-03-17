package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    private static String[] args;
    private static ConfigurableApplicationContext context;

    public static void main(String[] args) {
        Application.args = args;
        Application.context = SpringApplication.run(Application.class, args);
    }

    public static void restart() {
        // close previous context
        context.close();

        // and build new one
        Application.context = SpringApplication.run(Application.class, args);
    }

}
