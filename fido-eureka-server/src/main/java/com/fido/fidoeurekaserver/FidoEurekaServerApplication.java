package com.fido.fidoeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FidoEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FidoEurekaServerApplication.class, args);
	}

}
