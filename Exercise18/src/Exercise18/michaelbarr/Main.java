package Exercise18.michaelbarr;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller c = new TestPalinDromeController(new ConsoleView(), new TestPalinDrome());
		c.go();
	}


}
