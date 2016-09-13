package exercise14.michaelbarr;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller c = new FibonacciController(new ConsoleView(), new Fibonacci());
		c.go();
	}

}
