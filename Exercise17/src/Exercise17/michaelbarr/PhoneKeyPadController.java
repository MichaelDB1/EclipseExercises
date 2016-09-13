package Exercise17.michaelbarr;

import java.io.IOException;

public class PhoneKeyPadController extends Controller{
	protected PhoneKeyPad myModel;
	public PhoneKeyPadController( View theView, PhoneKeyPad theModel){
		super(theView);
		myModel = theModel;
	}
	
	public void go(){
		
		myView.start();
		String theString = myView.get();
		
		myModel.getMyString(theString);
		myModel.calcDigits();
		myView.say("The Digits for those characters entered are " + myModel.getDigits());
		
		try {
			myView.stop();
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}

}
