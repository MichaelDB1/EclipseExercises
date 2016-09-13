package exercise14.michaelbarr;

public class Fibonacci {
	
	private int myMax;
	private int num1 = 1;
	private int num2;
	private double Total;
	StringBuilder sb = new StringBuilder();
	
	public void setMax(int theMax){
		myMax = theMax;
	}
	
	public void calculateMyFib(){
		for(int i =0; i < myMax; i += 2){
			num1 = num1 + num2;
			Total += num1;
			sb.append(num1);
			sb.append(' ');
			num2 = num2 + num1;
			Total += num2;			
			sb.append(num2);
			sb.append(' ');
		}
	}
	
	public StringBuilder getFibs(){
		return sb;
	}
	
	public double getAverage(){
		return Total/myMax;
	}

}
