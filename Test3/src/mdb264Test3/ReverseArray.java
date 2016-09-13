package mdb264Test3;

public class ReverseArray {	
	
	
	private int myArray[];
	
	

	
	public void int setArray(int[] theArray){
		return myArray[] = theArray[];			
	}
		
	public void reverse(int[] myArray){ 
		for (int i = 0; i < myArray.length / 2; i++) {
			int temp = myArray[i]; // swap numbers 
			myArray[i] = myArray[myArray.length - 1 - i]; 
			myArray[myArray.length - 1 - i] = temp; }
		
	}

	
	public int[] getArray(){
		return myArray;						
	}
	
}
