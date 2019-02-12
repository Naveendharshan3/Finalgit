package com.demo.docker.demodocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemodockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemodockerApplication.class, args);
	}

}

@RestController
class Microservice
{
	
	@GetMapping("/")
	public String run()
	{
		return "Hello-String";
	}
	
}

