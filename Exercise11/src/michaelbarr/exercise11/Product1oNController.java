package michaelbarr.exercise11;

import java.io.IOException;

public class Product1oNController extends Controller{
	
	protected Product1oN myModel;
	public Product1oNController( View theView, Product1oN theModel){
		super(theView);
		myModel = theModel;
	}
	public void go(){
		
		
		myView.start();
		myModel.setRange(1, 14);
		myModel.calcSum();
		myView.say("Product of numbers is equal to " + myModel.getSum());
		
		try{
			myView.stop();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
