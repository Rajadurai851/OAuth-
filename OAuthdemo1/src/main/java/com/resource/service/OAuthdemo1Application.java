package com.resource.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;


@EnableResourceServer
@SpringBootApplication
public class OAuthdemo1Application{

	public static void main(String[] args) {
		SpringApplication.run(OAuthdemo1Application.class, args);
	}

}
