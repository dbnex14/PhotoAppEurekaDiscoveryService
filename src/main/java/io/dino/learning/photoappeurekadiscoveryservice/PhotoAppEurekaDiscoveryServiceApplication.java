package io.dino.learning.photoappeurekadiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PhotoAppEurekaDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoAppEurekaDiscoveryServiceApplication.class, args);
    }

}
