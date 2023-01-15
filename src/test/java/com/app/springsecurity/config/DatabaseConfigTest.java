package com.app.springsecurity.config;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConfigTest {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConnection() {
        try (Connection con =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/spring_security?serverTimezone=Asia/Seoul",
                            "root",
                            "5357")) {
            System.out.println("DB Connection => " + con);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
