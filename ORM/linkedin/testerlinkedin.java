package linkedin;


	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.Scanner;
	import com.wolken.linkedin.dto.UserDTO;
	import com.wolken.linkedin.service.RegistrationService;
	import com.wolken.linkedin.service.ServiceImpl;
	public class testerlinkedin {
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
						//RegistrationService service=new RegistrationServiceImpl();
						RegistrationService service = (Service) new ClassPathXmlApplicationContext(
	                            "linkedin.xml").getBean("service");
						service.validateAndSave(dto);
					}
				
				else if(ch == 2) {
					sc.nextLine();
					LoginDTO dto = new LoginDTO();
					System.out.println("enter email");
					String email = sc.nextLine();
					System.out.println("enter password");
					String password = sc.nextLine();
					dto.setEmail(email);
					dto.setPassword(password);
					//RegistrationService service=new RegistrationServiceImpl();
					RegistrationService service = (Service) new ClassPathXmlApplicationContext(
                            "linkedin.xml").getBean("service");
					String login = service.loginValidation(dto);
					if(login.contains("login successful"))
						System.out.println(login);
					else
						System.err.println(login);
				}
				else if(ch == 3) {
					sc.nextLine();
					UserDTO dto = new UserDTO();
					System.out.println("enter email");
					String email = sc.nextLine();
					System.out.println("enter new password");
					String password = sc.nextLine();
					System.out.println("confirm password");
					String cnfPassword = sc.nextLine();
					dto.setEmail(email);
					dto.setPassword(password);
					dto.setCnfPassword(cnfPassword);
					//RegistrationService service=new RegistrationServiceImpl();
					RegistrationService service = (Service) new ClassPathXmlApplicationContext(
                            "linkedin.xml").getBean("service");
					String update = service.UpdatePassword(dto);
					if(update.contains("Successful"))
						System.out.println(update);
					else
						System.err.println(update);
				}
				else {
					break;
				}
			}
			sc.close();
	    }
	}

