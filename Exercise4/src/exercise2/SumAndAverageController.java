package exercise2;

import java.io.IOException;

public class SumAndAverageController extends Controller{
	
	protected SumAndAverage myModel;
	public SumAndAverageController( View theView, SumAndAverage theModel){
		super(theView);
		myModel = theModel;
	}
	public void go() {
		
		
		myView.start();
		myModel.setRange(0, 100);
		myModel.calculateSum();
		myView.say ("Sum is equal to " + myModel.getSum());
		myView.say ("Average is equal to " + myModel.getAverage());
		
		
		
		try {
			myView.stop();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
