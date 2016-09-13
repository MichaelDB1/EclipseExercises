package exercise12.michaelbarr;

import java.io.IOException;

public class HarmSumController extends Controller{
		protected HarmSum myModel;
		public HarmSumController( View theView, HarmSum theModel){
			super(theView);
			myModel = theModel;
		}
		public void go() {
			myView.start();
			myModel.setMax(5000);
			myModel.calcLeft2Right();
			myModel.calcRight2Left();
			myView.say ("The left to right Harmonic is " + myModel.getLeft2Right());
			myView.say ("The right to left Harmonic is " + myModel.getRight2Left());
			myView.say ("The difference between to two is " +  myModel.getDifference());
			
			try {
				myView.stop();
			} catch (IOException e){
				e.printStackTrace();
			}
		}
}
