package michaelbarr.exercise7;

public class SumAverageCount {

	private int lowerNumber;
	private int higherNumber;
	private int sum = 0;
	
	public void setRange( int theLower, int theHigher){
		lowerNumber = theLower;
		higherNumber = theHigher;
	}
	
	public void calculateSum(){
		for(int i = lowerNumber; i <= higherNumber; i++){
			sum = sum + i;
		}
	}
	
	public int getCount(){
		int count = higherNumber -= lowerNumber;
		return count;
	}
	
	public int getSum(){
		return sum;
	}
	
	public double getAverage(){
		double average = (double)sum / (higherNumber - lowerNumber);
		return average;
	}
}
