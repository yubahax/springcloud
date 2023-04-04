package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;


@SpringBootApplication
public class Oauth2Service {
    public static void main(String[] args) {
        SpringApplication.run(Oauth2Service.class,args);
    }
}