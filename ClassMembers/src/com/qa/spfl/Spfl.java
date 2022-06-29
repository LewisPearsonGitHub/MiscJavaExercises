package com.qa.spfl;

public class Spfl {

	private String manager;
	private String stadium ;
	private int leaguePosition;
	private int dateFounded;
	
	public Spfl() {
		
	}
	
	public Spfl(String manager, String stadium, int leaguePosition, int dateFounded){
		this.manager = manager;
		this.stadium = stadium;
		this.leaguePosition = leaguePosition;
		this.dateFounded = dateFounded;
	}
	
	public Spfl(String manager, String stadium, int dateFounded) {
		this.manager = manager;
		this.stadium = stadium;
		this.dateFounded = dateFounded;
	
	}
	
	public Spfl(String stadium, int dateFounded) {
		this.stadium = stadium;
		this.dateFounded = dateFounded;
	}

	@Override
	public String toString() {
		return "Spfl [manager=" + manager + ", stadium=" + stadium + ", leaguePosition=" + leaguePosition
				+ ", dateFounded=" + dateFounded + "]";
	}

	
	





}
