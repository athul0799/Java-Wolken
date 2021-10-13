package mywork;



public class ExceptionHandler {
	
	public static void main(String[] args) {
		
	
		    
		        try{
		            int a[] = new int[5];
		            System.out.print(a[7]);
		        }
		        catch(ArrayIndexOutOfBoundsException e){
		            System.out.println ("Array Index is Out Of Bounds");
		            
		        }
		        
		        
		        try {
		            String a = "My name is Athul "; 
		            char c = a.charAt(24); 
		            System.out.println(c);
		        }
		        catch(StringIndexOutOfBoundsException e) {
		            System.out.println("String IndexOutOfBounds Exception");
		        }
		        
		        try {
		            String a = null; 
		            System.out.println(a.charAt(0));
		        } catch(NullPointerException e) {
		            System.out.println("NullPointer Exception");
		        }
		        
		        
		       
		      
		    }
	}
		 
