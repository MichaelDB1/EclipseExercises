package exercise13.michaelbarr;

import java.io.IOException;

public class ComputePIController extends Controller{
		protected ComputePI myModel;
		public ComputePIController( View theView, ComputePI theModel){
			super(theView);
			myModel = theModel;
		}
		
		public void go(){		
			myView.start();
			myModel.setMax(100000);
			myModel.calcPie();
			myView.say ("The Value of Pie calculated on Compute PI is " + myModel.getSum());
			myView.say ("The Calculated value of Compute PI minus MathPI is " + myModel.comparePi());
		
			try {
				myView.stop();
			} catch (IOException e){
				e.printStackTrace();
		}
	}
}
