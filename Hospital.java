class Hospital {
	int id;
	String name;
	long contact;
	long number;
	String address;
	String email_id;
	String website;
	int numberOfPerson;
	char type;
	
	
	
	static boolean admission(){
	 System.out.println("Admitted");
	 return true;
		
	}
	
	
	static void food(){
		System.out.println("Dosa for breakfast");
		System.out.println("Upma for lunch");
		System.out.println("Roti for dinner");
		
	}
	
	
	 boolean vacancy(int numberOfPerson){
		        this.numberOfPerson = numberOfPerson;
          		System.out.println("5 rooms remaining");
				return false;
	}
	}
	
