package exercise13.michaelbarr;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller c = new ComputePIController(new ConsoleView(), new ComputePI());
		c.go();

	}

}
