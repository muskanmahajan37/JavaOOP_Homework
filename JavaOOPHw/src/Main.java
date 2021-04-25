
public class Main {

	public static void main(String[] args) {

		KodlamaIO title = new KodlamaIO("Kodlama.ÝO", "Kurslarým", "Tüm Kurslar", "Kampa Hazýrlýk",
				"Sýk Sorulan Sorular");
		System.out.println(title.GetterTitle());

		MyAccount myAccount = new MyAccount("Profili Düzenle", "Üyelikleri Yönet", "Kart bilgisi ekle veya deðiþtir",
				"Adress", "Ýletiþim", "Çýkýþ");
		System.out.println(myAccount.GetterMyAccount());

		Courses course1 = new Courses("Yazýlým Geliþtirici Yetiþtirme Kampý (C#+ANGULAR)", "Engin DEMÝROÐ", "2 AY",
				"%20");
		System.out.println(course1.GetterCourses());
		course1.SelectCourse(course1);
		

		Courses course2 = new Courses("Yazýlým Geliþtirici Yetiþtirme Kampý", "Engin DEMÝROÐ", "2 AY", "%15");
		System.out.println(course2.GetterCourses());
		course2.SelectCourse(course2);
		
		Courses course3 = new Courses("Programlamaya Giriþ Ýçin Temel Kurs", "Engin DEMÝROÐ", "1 Hafta", "%100");
		System.out.println(course3.GetterCourses());
		course3.SelectCourse(course3);
		
	}

}
