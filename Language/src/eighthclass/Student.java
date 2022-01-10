package eighthclass;

public class Student {
	
	int studentId;
	private String studentName;
	long studentMobileNumber;
	int studentDiv;
	final private String schoolName = "IIT";
	char studentSection;
	short studentClass;
	
	public String getSchoolName() {
		return schoolName;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public String setStudentName(String studentName) {
		
		//studentName = studentName; 
		//In this case the nearest value will get preference i.e local variable
		
		
		this.studentName = studentName; //use of this keyword is for calling global variable.
		
		//Global variable are in blue color can be seen easily.
		
		return studentName;
		
		
	}
	
	
	
}

	
