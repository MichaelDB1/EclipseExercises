package Exericse27.MichaelBarr;

import java.io.IOException;

public class PerfectPrimeFactorListController extends Controller {
	protected PerfectPrimeFactorList myModel;
	public PerfectPrimeFactorListController( View theView, PerfectPrimeFactorList theModel){
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
