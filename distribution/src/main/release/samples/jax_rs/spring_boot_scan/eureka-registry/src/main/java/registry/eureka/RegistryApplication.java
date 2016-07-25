package registry.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public final class RegistryApplication {
    private RegistryApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(RegistryApplication.class, args);
    }
}