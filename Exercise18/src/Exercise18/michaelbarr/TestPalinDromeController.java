package Exercise18.michaelbarr;

import java.io.IOException;

public class TestPalinDromeController extends Controller{
	protected TestPalinDrome myModel;
	public TestPalinDromeController( View theView, TestPalinDrome theModel){
		super(theView);
		myModel = theModel;
	}
	
	public void go(){
		
		
		myView.start();
		String theString = myView.get();
		//String secoundString = myView.get();
		myModel.getMyString(theString);
		myView.say("Checking if " + theString + " Is a Palindrome");
		myView.say( theString + " " + myModel.testPalin());
		
		try {
			myView.stop();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
