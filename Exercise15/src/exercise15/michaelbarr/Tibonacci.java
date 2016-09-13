package exercise15.michaelbarr;

public class Tibonacci {
	
	private int myMax;
	private int num1 = 1;
	private int num2;
	private int num3;
	private double Total;
	StringBuilder sb = new StringBuilder();
	
	public void setMax(int theMax){
		myMax = theMax;
	}
	
	public void calculateMyFib(){
		for(int i =0; i < myMax; i += 2){
			num1 = num1 + num2 +num3;
			Total += num1;
			sb.append(num1);
			sb.append(' ');
			num2 = num2 + num1 +num3;
			Total += num2;			
			sb.append(num2);
			sb.append(' ');
			num3 = num3 + num2 + num1;
			sb.append(num3);
			sb.append(' ');
			Total += num3;			
		}
	}
	
	public StringBuilder getTribs(){
		return sb;
	}
	
	public double getAverage(){
		return Total/myMax;
	}

}