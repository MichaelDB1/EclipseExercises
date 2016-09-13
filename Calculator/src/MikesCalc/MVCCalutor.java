package MikesCalc;

public class MVCCalutor {

	public static void main(String[] args) {
		
		CalculatorView theView = new CalculatorView();
		
		CalculatorModel theModel  = new CalculatorModel();
		
		
		CalculatorController theController = new CalculatorController(theView, theModel);
		
		theView.setVisible(true);
		// TODO Auto-generated method stub

	}

}
