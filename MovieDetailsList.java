package com.rashmi.framework;

import java.util.*;

public class MovieDetailsList {
	
	public static void main(String[] args) {
		
		ArrayList<MovieDetails> movie = new ArrayList<>();
		
		MovieDetails m1 = new MovieDetails("Rebel", "Prabhas", "Tamanna","Action");
		MovieDetails m2 = new MovieDetails("Stree", "Rajkumar", "Shraddha","Horror");
		MovieDetails m3 = new MovieDetails("FRIENDS", "Mathew Perry", "Courtney Cox","Comedy");
		movie.add(m1);
		movie.add(m2);
		movie.add(m3);
		
		for(MovieDetails m:movie){
			System.out.println(m.toString());
		}
		
		
		System.out.println(" ");
		
		System.out.println("After Adding another movie detail :");
		System.out.println(" ");
		movie.add(new MovieDetails("Pokemon", "Ash", "Misty","Game"));
		for(MovieDetails m:movie){
			System.out.println(m.toString());
		}
		
		
		System.out.println(" ");
		System.out.println("After removing another movie detail :");
		System.out.println(" ");
		movie.remove(m2);
		for(MovieDetails m:movie){
			System.out.println(m.toString());
		}
	}

}
