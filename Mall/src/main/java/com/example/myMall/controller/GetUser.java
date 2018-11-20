package com.example.myMall.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GetUser {

	@RequestMapping("/list")
	public void handle() {
		System.out.println("Hello world,time"+System.currentTimeMillis()/1000);//controller
	}
	
}
