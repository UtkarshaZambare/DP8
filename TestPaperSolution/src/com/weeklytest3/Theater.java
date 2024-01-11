package com.weeklytest3;

public class Theater {
	
	private int theatreId;
    private String theatreName;
    private String location;
    private Movie movie;

    public Theater (int theatreId, String theatreName, String location, Movie movie) {
        this.theatreId = theatreId;
        this.theatreName = theatreName;
        this.location = location;
        this.movie = movie;
    }

	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public static void main(String[] args) {
		
	}

}
