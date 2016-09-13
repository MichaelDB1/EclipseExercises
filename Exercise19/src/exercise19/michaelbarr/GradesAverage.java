package exercise19.michaelbarr;

public class GradesAverage {

	int[] grades;
	int Sum;
	int Gradelength;
	double GradeAverage;
	
	public void getGrades(int [] myGrades){
		grades = myGrades;
		 Gradelength = grades.length;
	}
	
	public void calculateAverage(){
			for(int grade : grades){
			Sum += grade;
		}
	}
	
	public double getAverage(){
		return GradeAverage = (double)Sum/ Gradelength;
	}
}
