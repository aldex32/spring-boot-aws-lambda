package sinanaj.aldo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import sinanaj.aldo.config.DynamoDBConfig;
import sinanaj.aldo.controller.UserController;

@SpringBootApplication
// Use direct @Import instead of @ComponentScan to speed up cold starts
@Import({UserController.class, DynamoDBConfig.class})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
