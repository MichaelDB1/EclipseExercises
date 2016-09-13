package exercise8.michaelbarr;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller c = new OddSumAndAverageController(new ConsoleView(), new OddSumAndAverage());
		c.go();
	}

}
