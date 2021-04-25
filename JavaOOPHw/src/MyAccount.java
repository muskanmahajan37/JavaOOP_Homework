
public class MyAccount {

	String editProfile;
	String manageSubscription;
	String card›nfo;
	String adress;
	String contact;
	String exit;

	public MyAccount(String editProfile, String manageSubscription, String card›nfo, String adress, String contact,
			String exit) {
		super();
		this.editProfile = editProfile;
		this.manageSubscription = manageSubscription;
		this.card›nfo = card›nfo;
		this.adress = adress;
		this.contact = contact;
		this.exit = exit;
	}
	
	public String GetterMyAccount ()	{
		
		return ("\n"+this.editProfile+"\n"+this.manageSubscription+ "\n"+this.card›nfo+"\n"+this.adress+"\n"+this.contact+"\n"+this.exit);
		
		
	}
	
	
	

}
