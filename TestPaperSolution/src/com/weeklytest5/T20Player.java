package com.weeklytest5;

public class T20Player {

	private int playerId;
    private String name;
    private String country;
    private String team;

    public T20Player(int playerId, String name, String country, String team) {
        this.playerId = playerId;
        this.name = name;
        this.country = country;
        this.team = team;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getTeam() {
        return team;
    }
}


