package Exercise18.michaelbarr;

public class TestPalinDrome {
	String myString;
	int myStringLength;
	
	public void getMyString(String theString){
		myString = theString;
		myString = myString.toLowerCase();
		myStringLength = myString.length();
	}
	
	public String testPalin(){
		int front =0;
		int back = myStringLength -1;
		while(front < back){
			char theFront = myString.charAt(front);
			char theBack = myString.charAt(back);			
			if (Character.isLetter(theFront) && Character.isLetter(theBack)){
				if (theFront != theBack){
					return " Is not a PalinDrome";
				}
			}
			if (Character.isLetter(theFront)){
				front += 1;
			}
			else {
				front =+ 2;
			}
			if (Character.isLetter(theBack)){
				back -= 1;
			}
			else {
				back -= 2;
			}							
		}
		return " Is a Palindrome";
		
	}
	
}
