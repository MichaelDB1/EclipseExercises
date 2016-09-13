package exercise13.michaelbarr;

public class ComputePI {
	private double sum = 0.0;
	private int maxNumber;
	
	public void setMax(int theMax){
		maxNumber = theMax;
	}
	
	public void calcPie(){
		for (int increaser =1; increaser <= maxNumber; increaser += 2){
			if (increaser % 4 == 1){
				sum += (double) 1 / increaser;
				}
			else if (increaser % 4 == 3){
				sum -= (double) 1 / increaser;
			}
			else {
				System.out.println("Program Failed if you see this");
				// Kept getting a PI value of 4 because I didn't include (double) in my calculation so java was doing 
				// math on me
			}
		}
	}
	
	public double getSum(){
		return sum*4;
	}
	
	public double comparePi(){
		return (sum*4)-Math.PI; }

}
