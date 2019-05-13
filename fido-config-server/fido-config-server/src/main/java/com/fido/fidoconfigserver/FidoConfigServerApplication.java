package com.fido.fidoconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class FidoConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FidoConfigServerApplication.class, args);
	}

}
