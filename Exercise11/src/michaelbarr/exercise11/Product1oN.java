package michaelbarr.exercise11;

public class Product1oN {
	
	private int lowerNumber;
	private int higherNumber;
	private long sum=1;
	
	public void setRange(int theLower, int theHigher){
		lowerNumber = theLower;
		higherNumber = theHigher;
	}
	
	public void calcSum(){
		int min = lowerNumber;
		int max = higherNumber;
		while (min <= max){		
			sum *= min;
			min++;
		}
		}
	
	public long getSum(){
		return sum;
	}
}

// By Using Long instead of INT we can do math with bigger numbers outside the range of INT
