package com.wolken.linkedin;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import com.wolken.linkedin.dto.UserDTO;
import com.wolken.linkedin.services.RegistrationService;
import com.wolken.linkedin.services.RegistrationServiceImpl;
public class Tester {
	 public static void main(String[] args)
	    {
	    	UserDTO dto = new UserDTO();
	    	
	    	Scanner scanner = new Scanner(System.in);
	    	while(true) {
				System.out.println("enter your choice");
				System.out.println("1.insert");
				System.out.println("input any other number to exit");
				int ch = scanner.nextInt();
				
				if(ch == 1) {
					System.out.println("enter id");
					int id = scanner.nextInt();
					scanner.nextLine();
					System.out.println("enter name");
					String name = scanner.nextLine();
					System.out.println("enter email");
					String email = scanner.nextLine();
					System.out.println("enter password");
					String password = scanner.nextLine();
					System.out.println("enter designation");
					String designation = scanner.nextLine();
					System.out.println("enter date of birth");
					String dob=scanner.nextLine();
					Date dobb=new SimpleDateFormat("dd/MM/yyyy").parse(dob);
					dto.setId(id);
					dto.setName(name);
					dto.setEmail(email);
					dto.setPassword(password);
					dto.setDesignation(designation);
					dto.setDob(dob);
					RegistrationService service=new RegistrationServiceImpl();
					service.validateAndSave(dto);
				}
				else {
					break;
				}
	    	}
	    }
}
