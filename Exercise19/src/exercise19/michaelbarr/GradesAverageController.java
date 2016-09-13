package exercise19.michaelbarr;

public class GradesAverageController extends Controller{
	protected GradesAverage myModel;
	public GradesAverageController( View theView, GradesAverage theModel){
		super(theView);
		myModel = theModel;
	}
	
	public void go(){
		
		MyView.start();
		int gradeCount = myView.getInt();
		
	}
	

}
