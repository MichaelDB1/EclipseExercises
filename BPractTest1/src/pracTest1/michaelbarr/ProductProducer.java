package pracTest1.michaelbarr;

public class ProductProducer {
	
	private int lowNumber;
	private int highNumber;
	private int sum;
	
	
	public void getNumbers(int firstNumber, int secoundNumber){
		lowNumber = firstNumber;
		highNumber = secoundNumber;			
	}
	
	
	public void CalculattProducts(){
		int min = lowNumber;
		int max = highNumber;
		sum = min;
		while (min < max){
			min += 1;
			sum = (sum * min);
			
			}
		}
		
		
	public int getSum(){
		return sum;
	
	}
	

}
