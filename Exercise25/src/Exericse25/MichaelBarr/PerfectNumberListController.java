package Exericse25.MichaelBarr;

import java.io.IOException;

public class PerfectNumberListController extends Controller{
	protected PerfectNumberList myModel;
	public PerfectNumberListController( View theView,  PerfectNumberList theModel){
		super(theView);
		myModel = theModel;
	}
	
	public void go(){
		
		
		try {
			myView.stop();
				}catch (IOException e){
					e.printStackTrace();
				}
			
		}
	}


