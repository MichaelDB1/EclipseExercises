package michaelbarr.exercise11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller c = new Product1oNController(new ConsoleView(), new Product1oN());
		c.go();
	}

}
