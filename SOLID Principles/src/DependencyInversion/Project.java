package DependencyInversion;

public class Project {
	private String devName;
	
	public Project(String dev) {
		this.devName = dev;
	}
	
	public void Developer(Developer developer) {
		developer.writeMessage(devName);
	}
	
	public String getDevName() {
		return devName;
	}
	
	
}
