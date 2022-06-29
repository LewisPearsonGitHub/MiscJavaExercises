package Bird;

public class Falcon implements EggLayingCreature, FlyingCreature{
	private String currentLocation;
    private int numberOfEggs;
	
	public void fly() {
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
