package mywork;

public class Exam extends Exception {

	String[] names = {"Athul","Hrishikesh","Abhinand","Ashwini","Anoop","Rakshith"};
	public void ID() { 
	
	for(int i=0;i<names.length;i++) {
		try {
			if(!names[i].equals("Anoop")) {
				System.out.println("Names of students with id card:" + names[i]);
			}
			else {
				throw new IDNotFoundException("Names of students with no ID card:" + names[i]);
			}
		}
		catch(IDNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}
}
	
	
	public void Marks() { 
	
	for(int i=0;i<names.length;i++) {
		try {
			if(!names[i].equals("Rakshith")) {
				System.out.println("Names of students who have passed exam:" + names[i]);
			}
			else {
				throw new IDNotFoundException("Names of students who have not passed exam:" + names[i]);
			}
		}
		catch(IDNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}
}
	
	
	
	public void HallTicket() { 
		
	for(int i=0;i<names.length;i++) {
		try {
			if(!names[i].equals("Athul")) {
				System.out.println("Names of students who have hall ticket:" + names[i]);
			}
			else {
				throw new IDNotFoundException("Names of students who do not have hall ticket:" + names[i]);
			}
		}
		catch(IDNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}
}
	
	
	
	public void Eligible() { 
		
	for(int i=0;i<names.length;i++) {
		try {
			if(!names[i].equals("Ashwini")) {
				System.out.println("Names of students who are eligible for exam:" + names[i]);
			}
			else {
				throw new IDNotFoundException("Names of students who are not eligible for exam:" + names[i]);
			}
		}
		catch(IDNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}
}
	
	
	

	
	public static void main(String[] args) {
	
		Exam exam = new Exam();
		exam.ID();
		exam.Marks();
		exam.HallTicket();
		exam.Eligible();
	}
	
}
