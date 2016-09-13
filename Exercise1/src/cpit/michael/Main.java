package cpit.michael;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller c = new CheckerController(new ConsoleView(), new Checker());
				c.go();

	}

}
