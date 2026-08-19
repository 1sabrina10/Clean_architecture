package com.sabrina.clean_archi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {
        "Adapter",
        "Business"
})
@EnableJpaRepositories(
        basePackages = "Adapter.port.out.jpa"
)
@EntityScan(
        basePackages = "Adapter.port.out.jpa"
)
public class CleanArchiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CleanArchiApplication.class, args);
    }

}
