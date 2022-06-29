package DependencyInversion;

public class FrontendDeveloper implements Developer {

	@Override
	public void writeMessage(String developer) {
		System.out.println("JavaScript is used everywhere anyway");		
	}

}
