package mywork;

import java.util.TreeMap;
import java.util.Map;

public class Tmap {
	public static void main(String[] args) {
	
	TreeMap<Integer,String> map = new TreeMap();
	map.put(20, "majestic");
	map.put(21, "banashankari");
	map.put(22,"jayanagar");
	map.put(23,"rajajinagar");
	map.put(22,"kr road");
	
	System.out.println(map.get(21));
	System.out.println(map);
		
	
	String s = (String) map.get(23);
	System.out.println(s);
}
}
