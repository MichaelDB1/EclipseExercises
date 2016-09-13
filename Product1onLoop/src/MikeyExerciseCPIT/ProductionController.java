package MikeyExerciseCPIT;

import java.io.IOException;

public class ProductionController extends Controller {
	
	protected Production myModel;
	public ProductionController(View theView, Production theModel){
		super(theView);
		MyModel = theModel;		
	}
	
	
	public void (go) {
		myView start();
		myView.start();
		myModel.setRange(1, 10);
		myModel.calculateProduct();
		myView.say ("Product is equal to " + myModel.getSum());
		myView.say ("Average is equal to " + myModel.getAverage());
		
		
		
		try {
			myView.stop();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
