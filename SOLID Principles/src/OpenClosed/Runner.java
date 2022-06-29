package OpenClosed;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			FormalGreeting fg = new FormalGreeting();
			CasualGreeting cg = new CasualGreeting();
			Greeter formalGreet = new Greeter(fg);
			Greeter casualGreet = new Greeter(cg);
			
			System.out.println(formalGreet.greet());
			casualGreet.greet();
	}

}
