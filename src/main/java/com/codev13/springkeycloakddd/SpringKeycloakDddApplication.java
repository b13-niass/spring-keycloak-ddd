package com.codev13.springkeycloakddd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringKeycloakDddApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringKeycloakDddApplication.class, args);
    }

}
