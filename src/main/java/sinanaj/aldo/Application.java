package sinanaj.aldo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// We use direct @Import instead of @ComponentScan to speed up cold starts
// @ComponentScan(basePackages = "sinanaj.aldo.controller")
//@EnableDynamoDBRepositories(basePackageClasses = UserRepository.class)
//@Import({PingController.class, UserRepository.class, DynamoDBConfig.class})
//@Import(DynamoDBConfig.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
