package Exericse22.MichaelBarr;

import java.io.IOException;

public class NumberGuessController extends Controller{
	protected NumberGuess myModel;
	public NumberGuessController( View theView, NumberGuess theModel){
		super(theView);
		myModel = theModel;
	}
	
	public void go(){
		
		
		
		
		try {
			myView.stop();
		} catch (IOException e){
			e.printStackTrace();
		}
	}

}
