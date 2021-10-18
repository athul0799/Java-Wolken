package mywork;

import java.util.HashMap;

public class Tester {
	
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(23, "majestic");
		map.put("athul", "majestic");
		map.put(27,"jayanagar");
		
		System.out.println(map.get("athul"));
		map.remove("athul");
		
		
		String s = (String) map.get(23);
		System.out.println(s);
	}

}
