package mdb264Test3;

import java.io.IOException;

public class ReverseArrayController extends Controller {
	
	protected ReverseArray myModel;
	public ReverseArrayController( View theView, ReverseArray theModel){
		super(theView);
		myModel = theModel;
	}
	public void go() {
		
		
		myView.start();
		myModel.setArray int[] {12, 56, 34, 79, 26};
		myModel.reverse();
		myView.say ("The Array Reversed is " + myModel.getArray());
	}
				
		try {
			myView.stop();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
