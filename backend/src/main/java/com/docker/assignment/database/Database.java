package com.docker.assignment.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    private final String url;
    private final String user;
    private final String password;

    public Database(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection successful.");
            return connection;
        } catch (Exception error) {
            System.out.println(error);
            return connection;
        }
    }
}
