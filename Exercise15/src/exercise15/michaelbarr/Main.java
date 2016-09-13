package exercise15.michaelbarr;


	public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Controller c = new TibonacciController(new ConsoleView(), new Tibonacci());
			c.go();
		}

	}
