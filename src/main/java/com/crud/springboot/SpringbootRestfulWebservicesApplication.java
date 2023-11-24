package com.crud.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.crud.springboot")
@SpringBootApplication
public class SpringbootRestfulWebservicesApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(SpringbootRestfulWebservicesApplication.class, args);
    }
}