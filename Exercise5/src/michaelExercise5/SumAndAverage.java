package michaelExercise5;

public class SumAndAverage {
	
	private int lowerNumber;
	private int higherNumber;
	private int sum = 0;

	public void setRange(int theLower, int theHigher){
		lowerNumber = theLower;
		higherNumber = theHigher;
	}
	
	public void CalculateSum(){
		int min = lowerNumber;
		int max = higherNumber;
		while (min <= max){		
			sum = sum + min;
			min++;
		}
		}
		
	public int getSum(){
		return sum;
	}
	
	public double getAverage(){
		double average = (double)sum / (higherNumber - lowerNumber);
		return average;
	}

}

