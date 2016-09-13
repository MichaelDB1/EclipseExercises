package Exericse21.MichaelBarr;

import java.io.IOException;

public class ReverseArrayController extends Controller{
	protected ReverseArray myModel;
	public ReverseArrayController( View theView, ReverseArray theModel){
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
