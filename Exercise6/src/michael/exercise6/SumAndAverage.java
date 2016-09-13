package michael.exercise6;

public class SumAndAverage {

	private int lowerNumber;
	private int higherNumber;
	private int sum = 0;
	
	public void setRange(int theLower, int theHigher){
		lowerNumber = theLower;
		higherNumber = theHigher;
	}
	
	public void calculateSum(){
		int min = lowerNumber;
		int max = higherNumber;
		do{
			sum = sum + min;
			min++;
		}
		while (min <= max);		
	}
	

	public int getSum(){
		return sum;
		}
	
	public double getAverage(){
		double average = (double)sum / (higherNumber - lowerNumber);
		return average;				
	}
}
