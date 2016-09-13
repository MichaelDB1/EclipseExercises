package Exericse24.MichaelBarr;

import java.io.IOException;

public class DayOfWeekController extends Controller{
	protected DayOfWeek myModel;
	public DayOfWeekController (View theView, DayOfWeek theModel){
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
