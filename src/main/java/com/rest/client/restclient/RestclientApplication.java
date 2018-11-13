package com.rest.client.restclient;

import com.travelport.MyClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestclientApplication.class, args);
		for(int i=0;i<20;i++){
		MyClient.clientGet();
		}
	}
}
