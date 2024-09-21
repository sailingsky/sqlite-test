package com.example.sqlitetest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.sqlitetest.mapper")
public class SqliteTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqliteTestApplication.class, args);
    }

}
