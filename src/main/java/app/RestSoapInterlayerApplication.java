package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RestSoapInterlayerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestSoapInterlayerApplication.class, args);
    }

}
