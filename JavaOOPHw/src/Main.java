
public class Main {

	public static void main(String[] args) {

		KodlamaIO title = new KodlamaIO("Kodlama.�O", "Kurslar�m", "T�m Kurslar", "Kampa Haz�rl�k",
				"S�k Sorulan Sorular");
		System.out.println(title.GetterTitle());

		MyAccount myAccount = new MyAccount("Profili D�zenle", "�yelikleri Y�net", "Kart bilgisi ekle veya de�i�tir",
				"Adress", "�leti�im", "��k��");
		System.out.println(myAccount.GetterMyAccount());

		Courses course1 = new Courses("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C#+ANGULAR)", "Engin DEM�RO�", "2 AY",
				"%20");
		System.out.println(course1.GetterCourses());
		course1.SelectCourse(course1);
		

		Courses course2 = new Courses("Yaz�l�m Geli�tirici Yeti�tirme Kamp�", "Engin DEM�RO�", "2 AY", "%15");
		System.out.println(course2.GetterCourses());
		course2.SelectCourse(course2);
		
		Courses course3 = new Courses("Programlamaya Giri� ��in Temel Kurs", "Engin DEM�RO�", "1 Hafta", "%100");
		System.out.println(course3.GetterCourses());
		course3.SelectCourse(course3);
		
	}

}
