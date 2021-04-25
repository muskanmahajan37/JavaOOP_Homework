
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

		return ("\n" + "Kursun Adý :\t\t" + this.courseName + "\n" + "Eðitmenin Adý :\t\t" + this.tutorName + "\n"
				+ "Kurs Süresi :\t\t" + this.courseProgram + "\n" + "Tamamlanma Yüzdesi :\t"+this.completionRate);
	}

	public void SelectCourse (Courses course) {
		
		System.out.println("\n"+course.courseName+" Kursuna Baþlanýldý...");
		
	}
	
}
