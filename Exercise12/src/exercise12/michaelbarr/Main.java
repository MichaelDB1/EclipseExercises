package exercise12.michaelbarr;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller c = new HarmSumController(new ConsoleView(), new HarmSum());
		c.go();
	}

}
