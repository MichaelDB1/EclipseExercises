package michaelbarr.exercise7;

import java.io.IOException;

public class SumAverageCountController extends Controller{
	
	protected SumAverageCount myModel;
	public SumAverageCountController( View theView, SumAverageCount theModel){
		super(theView);
		myModel = theModel;
	}
	public void go() {
		
		myView.start();
		myModel.setRange(111, 8989);
		myModel.calculateSum();
		myView.say ("Sum is equal to " + myModel.getSum());
		myView.say ("Average is equal to " + myModel.getAverage());
		myView.say ("Count is equal to " + myModel.getCount());
		
		try {
			myView.stop();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
