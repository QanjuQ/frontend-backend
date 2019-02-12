package com.docker.assignment;

import com.docker.assignment.database.Database;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {

        SpringApplication.run(App.class, args);
        Database database =
            new Database("jdbc:postgresql://todo_db:5432/postgres","postgres","root");
        database.connect();
    }
}
