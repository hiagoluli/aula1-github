package entities;

public class Student {
	public String name;
	public Double grade1;
	public Double grade2;
	public Double grade3;
	
	public double FinalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public double MissingPoint() {
		if(FinalGrade() < 60.0) {
			return 60.0 - FinalGrade();
		}else {
			return 0.0;
		}
	}
	
	public boolean PassOrFailed() {
		if(grade1 + grade2 + grade3 > 60) {
			return true;
		}else {
			return false;
		}
		
	}
}
