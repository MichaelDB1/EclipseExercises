package Exercise9.michaelbarr;

import java.io.IOException;

public class SumOf7Controller extends Controller {
	protected SumOf7 myModel;
	public SumOf7Controller(View theView, SumOf7 theModel){
		super(theView);
		myModel = theModel;
	}

	public void go(){
		myView.start();
		myModel.setRange(1, 100);
		myModel.calculate7Sum();
		myView.say("Sum of 7s Is Equal to " +myModel.get7Sum());
		myView.say("Average of 7s is Eqqual to " +myModel.getAverage());
		
		try{
			myView.stop();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
