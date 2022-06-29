package com.qa.ducks;

public class Ducks {
	
	private boolean fly = true;
	private String habitat = "water";
	private String lifespan = "5-10 years";
	private String species = "Duck";
	private String predator = "Snapping Turtle";
	private int howMany = 345235;

	public Ducks() {

	}

	public Ducks(String habitat, String lifespan, String species, String predator, int howMany) {
		this.habitat = habitat;
		this.lifespan = lifespan;
		this.species = species;
		this.predator = predator;
		this.howMany = howMany;
	}

	public Ducks(String habitat, String lifespan) {
		this.habitat = habitat;
		this.lifespan = lifespan;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getLifespan() {
		return lifespan;
	}

	public void setLifespan(String lifespan) {
		this.lifespan = lifespan;
	}

	public String getPredator() {
		return predator;
	}

	public void setPredator(String predator) {
		this.predator = predator;
	}

	public int getHowMany() {
		return howMany;
	}

	public void setHowMany(int howMany) {
		this.howMany = howMany;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	@Override
	public String toString() {
		return "Ducks [habitat=" + habitat + ", lifespan=" + lifespan + ", species=" + species + ", predator="
				+ predator + ", howMany=" + howMany + "]";
	}

	

}
