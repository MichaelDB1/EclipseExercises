package exercise14.michaelbarr;

import java.io.IOException;


public class FibonacciController extends Controller{
	protected Fibonacci myModel;
	public FibonacciController( View theView, Fibonacci theModel){
		super(theView);
		myModel = theModel;
	}
	
	public void go(){		
		myView.start();
		myModel.setMax(20);
		myModel.calculateMyFib();
		myView.say ("The first 20 Fibs are " + myModel.getFibs());
		myView.say ("The average of these is " + myModel.getAverage());
	
		try {
			myView.stop();
		} catch (IOException e){
			e.printStackTrace();
	}
}
}