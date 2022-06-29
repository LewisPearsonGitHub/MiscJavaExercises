package Bird;

public class Dodo implements EggLayingCreature, ExtinctCreature{
	private String currentLocation;
    private int numberOfEggs;
	
	public void goExtinct() {
		// TODO Auto-generated method stub
		
	}

	
	public void layEggs() {
		// TODO Auto-generated method stub
		
	}


	public String getCurrentLocation() {
		return currentLocation;
	}


	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}


	public int getNumberOfEggs() {
		return numberOfEggs;
	}


	public void setNumberOfEggs(int numberOfEggs) {
		this.numberOfEggs = numberOfEggs;
	}
	
}
