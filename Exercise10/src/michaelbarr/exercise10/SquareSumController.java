package michaelbarr.exercise10;

import java.io.IOException;

public class SquareSumController extends Controller {

	protected SquareSum myModel;
	public SquareSumController( View theView, SquareSum theModel){
		super(theView);
		myModel = theModel;
	}
	
	public void go() {
		myView.start();
		myModel.setRange(0, 100);
		myModel.calculateSum();
		myView.say("Sum squared is equal to " + myModel.getSum());
		
		try {
			myView.stop();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
