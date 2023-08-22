package com.example.demo.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;

public class Movie {
	
	@Value(value="1001")
	private String movieId;
	
	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieActorName() {
		return movieActorName;
	}

	public void setMovieActorName(String movieActorName) {
		this.movieActorName = movieActorName;
	}

	@Value(value = "Saalaar")
	private String MovieName;
	
	@Value(value="Maddy")
	private String movieActorName;
	

	public String getMovieName() {
		return MovieName;
	}

	public void setMovieName(String movieName) {
		MovieName = movieName;
	}
	
	
	
	
	
	  @PostConstruct 
	  public void init() {
	  System.out.println("Movie bean initialized at: " +
	  java.time.LocalDateTime.now()); }
	  
	  @PreDestroy 
	  public void destroy() {
	  System.out.println("Movie bean destroyed at: " +
	  java.time.LocalDateTime.now()); }

}
