package exercise12.michaelbarr;

public class HarmSum {
	private int maxNumber;
	private double left2Right = 0.0;
	private double right2Left = 0.0;
	
	public void setMax(int theMax){
		maxNumber = theMax;
	}
	
	public void calcLeft2Right(){
		for(int i= 1; i<= maxNumber; i++){
			left2Right = left2Right + 1.0/i;
		}
	}
	public void calcRight2Left(){
		for(int i= maxNumber; i>= 1; i--){
			right2Left = right2Left + 1.0/i;
		}
	}
	
	public double getLeft2Right(){
		return left2Right;
	}
	
	public double getRight2Left(){
		return right2Left;
	}
	
	public double getDifference(){
		double difference =  right2Left - left2Right;
		return difference;
	}
}
