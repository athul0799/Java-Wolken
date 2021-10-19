package jdbc;


import com.wolken.jdbc.DAO.MarketDetailDAO;
import com.wolken.jdbc.DAO.MarketDetailDAOImpl;
import com.wolken.jdbc.DTO.MarketDetailsDTO;
import java.util.Scanner;
public class marketTest {
	public static void main(String[] args) {
		MarketDetailsDAO dao = new MarketDetailsDAOImpl();
		MarketDetailsDTO dto = new MarketDetailsDTO();
		static Scanner scanner = new Scanner(System.in);
		while(true) {
			
		int ch = scanner.nextInt();
			System.out.println("Enter choice between 1-5");
			System.out.println("1.insert);
			System.out.println("2.display");
			System.out.println("3.update");
			System.out.println("4.display all");
			System.out.println("5.delete");
			System.out.println("Click any othher number to terminate");
			

			if(ch == 1) {
				System.out.println("input id");
				int id = scanner.nextInt();
				sc.nextLine();
				System.out.println("input name");
				String name = scanner.nextLine();
				System.out.println("input location");
				String location = scanner.nextLine();
				System.out.println("input no of shops");
				int noOfShops = scanner.nextInt();
				dto.setId(id);
				dto.setName(name);
				dto.setLocation(location);
				dto.setNoOfShops(noOfShops);
				boolean index = dao.save(dto);
				if(index)
					System.out.println("data is saved");
				else
					System.out.println("data not saved");
			}
		
			else if(ch == 2) {
				sc.nextLine();
				System.out.println("enter location");
				String location = scanner.nextLine();
				dto.setLocation(location);
				dao.getByLocation(dto);
			}
	
			else if(ch == 3) {
				System.out.println("input id");
				int id = sc.nextInt();
				dto.setId(id);
				sc.nextLine();
				System.out.println("input the name");
				String name = sc.nextLine();
				System.out.println("input location");
				String location = sc.nextLine();
				System.out.println("input no of shops");
				int noOfShops = sc.nextInt();
				dto.setName(name);
				dto.setLocation(location);
				dto.setNoOfShops(noOfShops);
				boolean index = dao.updateById(dto);
				if(index)
					System.out.println("data saved");
				else
					System.out.println("failed to update");
			}
			
			else if(ch==4) {
				dao.getAll();
			}
			
			else if(ch==5) {
				System.out.println("enter id");
				int id = scanner.nextInt();
				dto.setId(id);
				boolean index = dao.delete(dto);
				if(index)
					System.out.println("data deleted");
				else
					System.out.println("Data not deleted");
			}
			
			else {
				    System.out.println("Invalid");
				    break;
			}
		}
		scanner.close();
	}
}


