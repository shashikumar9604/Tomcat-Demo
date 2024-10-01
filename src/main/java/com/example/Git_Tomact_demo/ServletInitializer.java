package com.example.Git_Tomact_demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		System.out.println("shashikumar");
		return application.sources(GitTomactDemoApplication.class);
	}
@RequestMapping(value = "/hello")
	public  String hello(){
		return  "hello this created by shashi to deploye the tomact application ";
	}
}
