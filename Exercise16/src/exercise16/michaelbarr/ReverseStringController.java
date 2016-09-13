package exercise16.michaelbarr;

import java.io.IOException;

public class ReverseStringController extends Controller{
	protected ReverseString myModel;
	public ReverseStringController( View theView, ReverseString theModel){
		super(theView);
		myModel = theModel;
	}
	
	public void go(){
		
		

		myView.start();
	
		
		String theString = myView.getString();
		
		myModel.getMyString(theString);
		myModel.reverseMyString();
		
		myView.say("The Reverse of that string is " + myModel.getTheReverse());
		

		try {
			
			myView.stop();
		} catch (IOException e){
			e.printStackTrace(System.out);
		}
	}
}
