package michaelbarr.exercise7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller c = new SumAverageCountController (new ConsoleView(), new SumAverageCount());
		c.go();
	}

}
