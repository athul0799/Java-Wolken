class Detail {
public static void main(String[] args){
	Hospital hp  = new Hospital();
    hp.admission();
	hp.food();
    
	String name = hp.name;
	System.out.println("Welcome to the hostel");
	
	hp.website = "Website reference = hostel@wolken.com";
	String website = hp.website;
	System.out.println(website);
	
	hp.address = "Address: Banashankari, 3rd stage, Bangalore";
	String address = hp.address;
	System.out.println(address);
	
	hp.email_id = "email: athul@wolkensoftware.com";
	String email_id = hp.email_id;
	System.out.println(email_id);
	}
}
