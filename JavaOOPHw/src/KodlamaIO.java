
public class KodlamaIO {

	String title;
	String myCourses;
	String allCourses;
	String preperationCamp;
	String questions;

	public KodlamaIO() {

	}

	    public KodlamaIO(String title, String myCourses, String allCourses, String preperationCamp, String questions) {
		this.title = title;
		this.myCourses = myCourses;
		this.allCourses = allCourses;
		this.preperationCamp = preperationCamp;
		this.questions = questions;
	}
	    
	    public String GetterTitle() {
	    	
	    	return (this.title+"\t "+this.myCourses+"\t"+ this.allCourses+"\t"+this.preperationCamp+"\t"+this.questions);
	    };
	    
	    

}
