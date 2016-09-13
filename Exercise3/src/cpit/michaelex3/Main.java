package cpit.michaelex3;

public class Main {

	public static void main(String[] args) {
		
		Controller c = new PrintWordController(new ConsoleView(), new PrintWord());
			c.go();
		// TODO Auto-generated method stub

	}

}
