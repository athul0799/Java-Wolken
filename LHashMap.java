package mywork;

import java.util.LinkedHashMap;

public class Lmap {
	public static void main(String[] args) {
		
	LinkedHashMap<Integer,String> map = new LinkedHashMap();
	map.put(10, "athul");
	map.put(11, "abhi");
	map.put(12,"ashu");
	map.put(13,"hrishi");
	map.put(14,"swarna");
	
	System.out.println(map.get(11));
	System.out.println(map);
		
	
	String s = (String) map.get(10);
	System.out.println(s);
}
}
