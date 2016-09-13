package exercise8.michaelbarr;

public class OddSumAndAverage {

	private int lowerNumber;
	private int higherNumber;
	private int sum = 0;


	public void setRange(int theLower, int theHigher){
		lowerNumber = theLower;
		higherNumber = theHigher;
	}
	
	public void calculateOddSum(){
		for(int i = lowerNumber; i <= higherNumber; i++){
			if( i % 2 > 0){ 
			sum = sum + i;
			}
		}
	}
		
	public int getOddSum(){
		return sum;
	}
	
	public double getAverage(){
		double average = (double)sum*2 / (higherNumber - lowerNumber);
		return average;
	}
	
	}
