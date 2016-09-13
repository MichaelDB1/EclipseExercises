package cpit.michael;
import java.io.IOException;


public class CheckerController extends Controller {
	protected Checker checker;
	public CheckerController(View theView, Checker theChecker){
		super(theView);
		this.checker = theChecker;
	}
	public void go(){
		myView.start();
		for (int i =0; i<=100; i++){
			myView.say(i + " = " + checker.checkMark(i));
		}
		try {
			myView.stop();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
