package Exericse23.MichaelBarr;

import java.io.IOException;

public class WordGuessController extends Controller {
	protected WordGuess myModel;
	public WordGuessController ( View theView, WordGuess theModel){
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
