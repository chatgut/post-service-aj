package org.example.postserviceaj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class PostServiceAjApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostServiceAjApplication.class, args);
    }

}
