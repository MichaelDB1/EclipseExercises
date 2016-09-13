package exercise15.michaelbarr;

import java.io.IOException;


public class  TibonacciController extends Controller{
	protected  Tibonacci myModel;
	public  TibonacciController( View theView,  Tibonacci theModel){
		super(theView);
		myModel = theModel;
	}
	
	public void go(){		
		myView.start();
		myModel.setMax(20);
		myModel.calculateMyFib();
		myView.say ("The first 20 Tribs are " + myModel.getTribs());
		myView.say ("The average of these is " + myModel.getAverage());
	
		try {
			myView.stop();
		} catch (IOException e){
			e.printStackTrace();
	}
	}
}
