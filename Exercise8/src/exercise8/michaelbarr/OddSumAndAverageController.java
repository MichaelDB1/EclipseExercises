package exercise8.michaelbarr;

import java.io.IOException;

public class OddSumAndAverageController extends Controller{

	protected OddSumAndAverage myModel;
	public OddSumAndAverageController(View theView, OddSumAndAverage theModel) {
		super(theView);
		myModel = theModel;
		// TODO Auto-generated constructor stub
	}

	public void go() {
		
		myView.start();
		myModel.setRange(0, 10);
		myModel.calculateOddSum();
		myView.say ("Odd Sum is euqal to " + myModel.getOddSum());
		myView.say ("Average is equal to " + myModel.getAverage());
		
		try {
			myView.stop();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
