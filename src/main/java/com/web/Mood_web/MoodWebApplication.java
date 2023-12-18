package com.web.Mood_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MoodWebApplication {


	public static void main(String[] args) {
		SpringApplication.run(MoodWebApplication.class, args);
	}

}
