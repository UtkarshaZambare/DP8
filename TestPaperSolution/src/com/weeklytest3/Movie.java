package com.weeklytest3;

public class Movie {
	 private int movieId;
	    private String movieName;
	    private double rating;

	    public Movie(int movieId, String movieName, double rating) {
	        this.movieId = movieId;
	        this.movieName = movieName;
	        this.rating = rating;
	    }


	public int getMovieId() {
			return movieId;
		}


		public void setMovieId(int movieId) {
			this.movieId = movieId;
		}


		public String getMovieName() {
			return movieName;
		}


		public void setMovieName(String movieName) {
			this.movieName = movieName;
		}


		public double getRating() {
			return rating;
		}


		public void setRating(double rating) {
			this.rating = rating;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
