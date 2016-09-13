package Exercise9.michaelbarr;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller c = new SumOf7Controller(new ConsoleView(), new SumOf7());
		c.go();
	}

}
