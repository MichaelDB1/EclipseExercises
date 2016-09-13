package exercise2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller c = new SumAndAverageController(new ConsoleView(), new SumAndAverage());
		c.go();
	}

}
