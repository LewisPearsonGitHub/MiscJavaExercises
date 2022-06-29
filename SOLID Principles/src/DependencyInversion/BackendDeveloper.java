package DependencyInversion;

public class BackendDeveloper implements Developer {

	@Override
	public void writeMessage(String developer) {
		System.out.println("C# is just Microsoft Java anyway");		
		
	}
 
}
