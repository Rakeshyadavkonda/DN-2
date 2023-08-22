package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class WiproAssignmentApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = null;
		try {
			context = new AnnotationConfigApplicationContext(com.example.demo.config.AppConfig.class);
			com.example.demo.model.Movie movie = context.getBean("getMovie", com.example.demo.model.Movie.class);
			System.out.println(movie.getMovieId());
			System.out.println(movie.getMovieName());
			System.out.println(movie.getMovieActorName());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (context != null) {
				context.close();
			}
		}
	}

}
