package michaelbarr.exercise10;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller c = new SquareSumController(new ConsoleView(), new SquareSum());
		c.go();
	}

}
