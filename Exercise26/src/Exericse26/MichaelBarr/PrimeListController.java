package Exericse26.MichaelBarr;

import java.io.IOException;

public class PrimeListController extends Controller{
	protected PrimeList myModel;
	public PrimeListController( View theView, PrimeList theModel){
		super(theView);
		myModel = theModel;
	}
	
	public void go(){
		
		
		
		
		try{
			myView.stop();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
