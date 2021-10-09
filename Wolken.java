class Wolken {
		
	int id;                                                                      // instance variables
	String name;                                                                  
	String email_id;
	String contact;

	Wolken(){
		System.out.println("Calling default constructor");                       // default constructor
	}
	
	Wolken(String name){                                                         // parameterized cnstructor with one parameter
		this.name = name;
	}
	Wolken(String name, int id,String email_id,String contact){                  // parameterized constructor with multiple parameters
		this();
		
		
		this.id = id;
		this.email_id = email_id;
		this.contact = contact;
		System.out.println("Initializing variables");
	}
	
	void details(){
		System.out.println(name + id + email_id + contact);
	}
	public static void main(String[] args){
		Wolken obj = new Wolken();
		obj.details();
}

}
