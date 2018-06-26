package com.ud.euraka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurakaServerApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurakaServerApplication.class).web(true).run(args);
	}
}
