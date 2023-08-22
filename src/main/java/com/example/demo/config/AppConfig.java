package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Movie;


@Configuration
public class AppConfig {
	@Bean
	public Movie getMovie() {
		return new Movie();
	}
}
