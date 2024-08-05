package com.techlabs.model;

public class CricketPlayer {
	
	private int playerId;
	private String name;
	private int numberOfMatches;
	private int runs;
	private int wicket;
	
	public CricketPlayer(int playerId, String name, int numberOfMatches, int runs, int wicket) {
		
		this.playerId = playerId;
		this.name = name;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.wicket = wicket;
	}
	
	
	public CricketPlayer() {
		super();
	}


	public int getPlayerId() {
		return playerId;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumberOfMatches() {
		return numberOfMatches;
	}
	
	public int getRuns() {
		return runs;
	}
	
	public int getWickets() {
		return wicket;
	}
	
	public void setPlayerId() {
		this.playerId = playerId;
	}
	
	public void setName() {
		this.name = name;
	}
	
	public void setNumberOfMatches() {
		this.numberOfMatches = numberOfMatches;
	}
	
	public void setWickets() {
		this.wicket = wicket;
	}
	
	public void setRuns() {
		this.runs = runs;
	}
	
	public void display() {
		System.out.println("The Name of player : " +name);
		System.out.println("Player ID : " +playerId);
		System.out.println("Number of matches played : " +numberOfMatches);
		System.out.println("Runs : " +runs);
		System.out.println("Wickets : " +wicket);
		System.out.println("The average of " +name+ " is : " +(runs/numberOfMatches));
	}
	
	
	

}
