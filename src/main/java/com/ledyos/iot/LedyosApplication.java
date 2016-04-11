package com.ledyos.iot;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LedyosApplication {

	public static void main(String[] args) {
		SpringApplication.run(LedyosApplication.class, args);
	}
	
	@RequestMapping("")
    public String hello(){
        return "Hello! Docker!";
    }
	
}
