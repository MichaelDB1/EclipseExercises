package exercise16.michaelbarr;

public class ReverseString {	
	
	String myString;
	String reversedString = "";
	int myStringLength;
	
	public void getMyString(String theString){
		myString = theString;
		myStringLength = myString.length();
	}
	

	
	public void reverseMyString(){
	for (int i = myStringLength - 1 ; i >= 0 ; i-- ){
		reversedString = reversedString + myString.charAt(i);
		}
	}
	
	public String getTheReverse(){
		return reversedString;
	}
}
