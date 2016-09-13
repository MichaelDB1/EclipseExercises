package Exericse24.MichaelBarr;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller c = new SomethingController(new ConsoleView(), new Something());
		c.go();
	}

}
