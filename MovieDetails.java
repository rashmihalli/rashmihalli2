package com.rashmi.framework;

public class MovieDetails {
	
	String movieName;
	String movieActor;
	String movieActress;
	String genre;
	
	
	public MovieDetails(String movieName, String movieActor, String movieActress, String genre) {
		super();
		this.movieName = movieName;
		this.movieActor = movieActor;
		this.movieActress = movieActress;
		this.genre = genre;
	}
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieActor() {
		return movieActor;
	}
	public void setMovieActor(String movieActor) {
		this.movieActor = movieActor;
	}
	public String getMovieActress() {
		return movieActress;
	}
	public void setMovieActress(String movieActress) {
		this.movieActress = movieActress;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "movieName=" + movieName + ", movieActor="
				+ movieActor + ", movieActress=" + movieActress + ", genre="
				+ genre;
	}
	
	

}
