package Exercise17.michaelbarr;

public class PhoneKeyPad {
	String myString;
	int myStringLength;
	StringBuilder sb = new StringBuilder();
	
	
	public void getMyString(String theString){
		myString = theString;
		myString = myString.toLowerCase();
		myStringLength = myString.length();
	}
	
	public void calcDigits(){
		for (int i = myStringLength - 1 ; i >= 0 ; i-- ){
			char myChar = myString.charAt(i);
			if (myChar == 'a' || myChar == 'b' || myChar == 'c'){
				sb.append(2);
			}
			if (myChar == 'd' || myChar == 'e' || myChar == 'f'){
				sb.append(3);
			}
			if (myChar == 'h' || myChar == 'i' || myChar == 'j'){
				sb.append(4);
			}
			if (myChar == 'k' || myChar == 'l' || myChar == 'm'){
				sb.append(5);
			}
			if (myChar == 'n' || myChar == 'o' || myChar == 'p'){
				sb.append(6);
			}
			if (myChar == 'q' || myChar == 'r' || myChar == 's'){
				sb.append(7);
			}
			if (myChar == 't' || myChar == 'u' || myChar == 'v'){
				sb.append(8);
			}
			if (myChar == 'w' || myChar == 'x' || myChar == 'y' || myChar == 'z'){
				sb.append(9);
			}
		}
	}
	
	public StringBuilder getDigits(){
		return sb;
	}
	
}
