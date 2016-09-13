package MikesCalc;

public class CalculatorModel {

		private int calculationValue;
		
		public void addTwoNumbers( int firstNumber, int secoundNumber){
			calculationValue = firstNumber + secoundNumber;
		}
		
		public int getCalculationValue(){
			return calculationValue;
		}
}
