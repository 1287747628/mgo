package com.custom.mgo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

//@PropertySource(value = {"file:D:\\opt\\fonsview\\NE\\mgo\\etc\\application.properties"})
@SpringBootApplication
public class MgoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MgoApplication.class, args);
    }

}
