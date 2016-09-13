package exercise16.michaelbarr;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Controller c = new ReverseStringController(new ConsoleView(), new ReverseString());
		c.go();
	}

}