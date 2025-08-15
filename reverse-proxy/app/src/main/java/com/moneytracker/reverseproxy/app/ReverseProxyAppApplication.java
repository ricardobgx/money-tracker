package com.moneytracker.reverseproxy.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ReverseProxyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReverseProxyAppApplication.class, args);
	}

}
