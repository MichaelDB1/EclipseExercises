package cpit.michaelex3;

public class PrintWord {
	public String wordCheck ( int numb ){
		String result;
		if (numb == 1){
			result ="ONE";
		}
		else if (numb == 2){
			result ="TWO";
		}
		else if (numb == 3){
			result ="THREE";
		}
		else if (numb == 4){
			result ="FOUR";
		}		
		else if (numb == 5){
			result ="FIVE";
		}
		else if (numb == 6){
			result ="SIX";
		}
		else if (numb == 7){
			result ="SEVEN";
		}
		else if (numb == 8){
			result ="EIGHT";
		}
		else if (numb == 9){
			result ="NINE";
		}
		else {
			result ="OTHER";
		}
		return result;
	}
	public String secondWordCheck ( int numb ){		
		String result;
		switch (numb){
		case 1: result = "ONE";
			break;
		case 2: result = "TWO";
		break;
		case 3: result = "THREE";
		break;
		case 4: result = "FOUR";
		break;
		case 5: result = "FIVE";
		break;
		case 6: result = "SIX";
		break;
		case 7: result = "SEVEN";
		break;
		case 8: result = "EIGHT";
		break;
		case 9: result = "NINE";
		break;
		default: result ="OTHER";
		}
		return result;
	}
}
