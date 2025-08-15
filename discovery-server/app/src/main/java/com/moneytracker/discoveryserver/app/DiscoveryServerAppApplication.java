package com.moneytracker.discoveryserver.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryServerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerAppApplication.class, args);
	}

}
