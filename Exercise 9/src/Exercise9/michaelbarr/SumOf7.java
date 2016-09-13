package Exercise9.michaelbarr;

public class SumOf7 {
	private int lowerNumber;
	private int higherNumber;
	private int sum = 0;
	
	public void setRange(int theLower, int theHigher){
		lowerNumber = theLower;
		higherNumber = theHigher;		
	}
	
	public void calculate7Sum(){
		for(int i = lowerNumber; i <= higherNumber; i++){
			if( i % 7 <= 0){
				sum = sum + i;
			}
				
			}
		}
	public int get7Sum(){
		return sum;
	}
	
	public double getAverage(){
		double average =(double)sum*7 / (higherNumber - lowerNumber);
		return average;
	}
	}

