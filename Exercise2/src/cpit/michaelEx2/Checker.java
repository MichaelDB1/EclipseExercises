package cpit.michaelEx2;

public class Checker {
	public String checkMark ( int mark) {
		String result = "Odd";
		if (mark % 2 <= 0) {
			result = "Even";
			
		}
		return result;
	}

}
