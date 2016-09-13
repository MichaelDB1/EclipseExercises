package cpit.michaelex3;

import java.io.IOException;

public class PrintWordController extends Controller {
	protected PrintWord printWord;
	public PrintWordController(View theView, PrintWord thePrintWord){
		super(theView);
		this.printWord = thePrintWord;
	}
	public void go(){
		myView.start();
		for (int i =1; i<= 12; i++){
			myView.say(i + " = " + printWord.wordCheck(i));
			myView.say(i + " = " + printWord.secondWordCheck(i));
		}
		
		try {
			this.myView.stop();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
