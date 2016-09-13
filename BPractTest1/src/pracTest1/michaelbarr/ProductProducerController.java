package pracTest1.michaelbarr;

import java.io.IOException;

public class ProductProducerController extends Controller{
	protected ProductProducer myModel;
	public ProductProducerController ( View theView, ProductProducer theModel){
		super(theView);
		myModel = theModel;
	}
	
	public void go(){
		
		myView.start();
		String theString = myView.getOne();
		String secoundString = myView.getTwo();
		int firstNumber;
		int secoundNumber;
		firstNumber = Integer.parseInt(theString);
		secoundNumber = Integer.parseInt(secoundString);		
		myModel.getNumbers(firstNumber, secoundNumber);
		myModel.CalculattProducts();				
		myView.say(" the prodct of " + theString + " and " + secoundString + " equals " + myModel.getSum());
		
		for (secoundNumber =1; secoundNumber <= 10; secoundNumber++){
			firstNumber = 1;
			myModel.getNumbers(firstNumber, secoundNumber);
			myModel.CalculattProducts();
				myView.say(firstNumber + "  " + secoundNumber + " " + myModel.getSum() );
			
		}
		
		
	//	myView.say();
		
		
		
		try {
			myView.stop();
		} catch (IOException e){
			e.printStackTrace();
		}
	}

}
