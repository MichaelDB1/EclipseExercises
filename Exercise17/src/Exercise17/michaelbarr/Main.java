package Exercise17.michaelbarr;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller c = new PhoneKeyPadController(new ConsoleView(), new PhoneKeyPad());
		c.go();
	}

}
