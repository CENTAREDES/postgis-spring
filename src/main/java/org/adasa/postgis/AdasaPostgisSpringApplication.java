package org.adasa.postgis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

@SpringBootApplication
@JpaRepositoriesAutoConfiguration
public class AdasaPostgisSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdasaPostgisSpringApplication.class, args);
    }
}
