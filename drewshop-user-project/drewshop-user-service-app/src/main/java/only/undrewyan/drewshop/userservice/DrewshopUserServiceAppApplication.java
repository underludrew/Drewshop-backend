package only.undrewyan.drewshop.userservice;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DrewshopUserServiceAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(DrewshopUserServiceAppApplication.class, args);
    }
}
