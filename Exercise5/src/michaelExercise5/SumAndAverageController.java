package michaelExercise5;

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
		myModel.CalculateSum();
		myView.say ("Sum is equal to " + myModel.getSum());
		myView.say ("Average is equal to " +myModel.getAverage());
		
		try {
			myView.stop();
		} catch (IOException e) {
			e.printStackTrace();
			}
		}

}
