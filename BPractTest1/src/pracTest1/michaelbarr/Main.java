package pracTest1.michaelbarr;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller c = new ProductProducerController( new ConsoleView(), new ProductProducer());
		c.go();
	}

}
