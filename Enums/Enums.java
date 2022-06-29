package Enums;

public class Enums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mars has a mass of " + Planet.MARS.getMass() + " Kilograms");
		System.out.println("and a radius of " + Planet.MARS.getRadius() + " Metres");
		System.out.println("which gives a surface gravity of " + Planet.MARS.surfaceGravity() + " m/s^2");
		double mass = (75/Planet.EARTH.surfaceGravity());
		
		System.out.println("and so with an earthweight of 75kg, you would have a weight of " + Planet.MARS.surfaceWeight(mass) + "Kg on Mars.");
		
		
		System.out.println("On other planets this is: ");
		
		for (Planet p : Planet.values()) {
			System.out.printf("Your weight on %s is %f%n", p, p.surfaceWeight(mass));
		}
	}

}
