
public class Courses {

	String courseName;
	String tutorName;
	String courseProgram;
	String completionRate;

	public Courses() {
		
	}

	public Courses(String CourseName, String TutorName, String CourseProgram, String CompletionRate) {
		System.out.println("\nKurs bilgileri getiriliyor...");
		courseName = CourseName;
		tutorName = TutorName;
		courseProgram = CourseProgram;
		completionRate = CompletionRate;
	}

	public String GetterCourses() {

		return ("\n" + "Kursun Ad� :\t\t" + this.courseName + "\n" + "E�itmenin Ad� :\t\t" + this.tutorName + "\n"
				+ "Kurs S�resi :\t\t" + this.courseProgram + "\n" + "Tamamlanma Y�zdesi :\t"+this.completionRate);
	}

	public void SelectCourse (Courses course) {
		
		System.out.println("\n"+course.courseName+" Kursuna Ba�lan�ld�...");
		
	}
	
}
