package mywork;
import java.util.Scanner;
import java.util.*;
public class TesterGuns {
	static Scanner scanner = new Scanner(System.in);
	static List guns = new LinkedList<>();
	
	public static void main(String args[]) {
		TesterGuns t = new TesterGuns();
		while(true) {
			System.out.println("Enter your choice: ");
			System.out.println("1. insert data");
			System.out.println("2. insert multiple data");
			System.out.println("3. display using license");
			System.out.println("4. display using model");
			System.out.println("5. display all");
			System.out.println("6. update name");
			System.out.println("7. update model");
			System.out.println("8. delete");
			System.out.println("type any number apart from 1-8 to exit");
			int choice = scanner.nextInt();
			
			if(choice==1) {
					Gun gun = new Gun();
					scanner.nextLine();
					System.out.println("enter the name");
					String name = scanner.nextLine();
					System.out.println("enter the cost: ");
					float cost = scanner.nextFloat();
					System.out.println("enter the model");
					String model = scanner.nextLine();
					System.out.println("enter the type");
					String type = scanner.nextLine();
					System.out.println("enter license no");
					int license = scanner.nextInt();
					gun.setName(name);
					gun.setCost(cost);
					gun.setModel(model);
					gun.setType(type);
					gun.setLicense(license);
		      		t.save(gun);
			}
			else if(choice == 2) {
				List<Gun> ll = new ArrayList<>();
				System.out.println("Enter number of elements:");
				int n = scanner.nextInt();
				for(int i=0;i<n;i++) {
					Gun gun = new Gun();
					scanner.nextLine();
					System.out.println("Enter Name: ");
					String name = scanner.nextLine();
					System.out.println("Enter Model: ");
					String model = scanner.nextLine();
					System.out.println("Enter Type: ");
					String type = scanner.nextLine();
					System.out.println("Enter License: ");
					int license = scanner.nextInt();
					System.out.println("Enter Price: ");
					float cost = scanner.nextFloat();
					gun.setName(name);
					gun.setModel(model);
					gun.setType(type);
					gun.setLicense(license);
					gun.setCost(cost);
					
				}
			}
				
			else if (choice == 3) {
				System.out.println("Enter License: ");
				int license = scanner.nextInt();
				t.getByLicense(license);
			}
			else if (choice == 4) {
				scanner.nextLine();
				System.out.println("Enter Model: ");
				String model = scanner.nextLine();
				t.getByModel(model);	
			}
			
			else if(choice == 5) {
				t.getAll();
			}
			else if (choice == 6) {
				scanner.nextLine();
				System.out.println("Enter Name: ");
				String name = scanner.nextLine();
				boolean flag = t.updateByName(name);
				if(flag)
					System.out.println("Updated Successfully");
				else
					System.out.println("Update Failed");
			}
			else if(choice == 7) {
				scanner.nextLine();
				System.out.println("Enter Model: ");
				String model = scanner.nextLine();
				boolean flag = t.updateByModel(model);
				if(flag)
					System.out.println("Updated Successfully");
				else
					System.out.println("Update Failed");
			}
			else if(choice == 8) {
				scanner.nextLine();
				System.out.println("Enter Name: ");
				String name = scanner.nextLine();
				boolean flag = t.delete(name);
				if(flag)
					System.out.println("Deleted Successfully");
				else
					System.out.println("Delete Failed");
			}
			else {
				break;
			}
		}
	}
	void save(Gun gun) {
		guns.add(gun);
	}
	
	void saveAll(List<Gun> al) {
		guns.addAll(al);
	}
	
	void getAll() {
		for(Gun gun : guns) {
			System.out.println("Name: "+gun.getName()+"\nCost: "+gun.getCost()+"\nModel: "+gun.getModel()+"\nType: "+gun.getType()+"\nLicense: "+gun.getLicense());
		}	
	}
	
	void getByLicense(int license) {
		for(Gun gun : guns) {
		if(gun.getLicense() == license) {
				System.out.println("Name: "+gun.getName()+"\nLicense: "+gun.getLicense()+"\nCost: "+gun.getCost()+"\nModel:"+gun.getModel()+"\nType: "+gun.getType());
				return;
			}
		}
		System.out.println("data entered is invalid");
	}
	
	void getByModel(String model) {
		for(Gun gun : guns) {
			if(gun.getModel().equalsIgnoreCase(model)) {
				System.out.println("Name: "+gun.getName()+"\nCost: "+gun.getCost()+"\nModel: "+gun.getModel()+"\nType: "+gun.getType()+"\nLicense: "+gun.getLicense());
				return;
			}
		}	
		System.out.println("Data not found");
	}
	
	boolean updateByName(String name) {
		for(Gun gun : guns) {
			if(gun.getName().equalsIgnoreCase(name)) {
				System.out.println("enter gun name");
				name = scanner.nextLine();
				System.out.println("enter gun model");
				String model = scanner.nextLine();
				System.out.println("enter the type of gun");
				String type = scanner.nextLine();
				System.out.println("enter license of gun");
				int license = scanner.nextInt();
				System.out.println("enter the cost of gun");
				float price = scanner.nextFloat();
				gun.setName(name);
				gun.setModel(model);
				gun.setType(type);
				gun.setLicense(license);
				gun.setPrice(price);
				guns.set(guns.indexOf(gun), gun);
				return true;
			}
		}
		return false;
	}
	
	boolean updateByModel(String model) {
		for(Gun gun : guns) {
			if(gun.getModel().equalsIgnoreCase(model)) {
				System.out.println("enter the name");
				String name = scanner.nextLine();
				System.out.println("enter the price");
				float cost = scanner.nextFloat();
				System.out.println("enter the model");
				model = scanner.nextLine();
				System.out.println("enter the type");
				String type = scanner.nextLine();
				System.out.println("enter the license");
				int license = scanner.nextInt();
				gun.setName(name);
				gun.setCost(cost);
				gun.setModel(model);
				gun.setType(type);
				gun.setLicense(license);
				guns.set(guns.indexOf(gun), gun);
				return true;
			}
		}
		return false;
	}
	boolean delete(String name) {
		for(Gun gun : guns) {
			if(gun.getName().equalsIgnoreCase(name)) {
				guns.remove(gun);
				return true;
			}
		}
		return false;
	}
	}

