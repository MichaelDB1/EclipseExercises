package cpit.michael;

public class Checker {
	public String checkMark ( int mark ){
		String result = "FAIL";
		if (mark >= 50) {
			result = "PASS";
		}
		return result;
	}

}
