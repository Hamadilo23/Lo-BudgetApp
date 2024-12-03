package My.Budget.demo.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javafx.application.Application;
import javafx.stage.Stage;

@SpringBootApplication
public class Main extends Application {

    private static ConfigurableApplicationContext springContext;

    public static void main(String[] args) {
        // Launch Spring Boot in a background thread
        springContext = SpringApplication.run(Main.class, args);
        launch(args); // Start JavaFX application
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Initialize the JavaFX application
        primaryStage.setTitle("Lo's Budget App");
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        // Gracefully close Spring Boot application when JavaFX application stops
        springContext.close();
    }
}
