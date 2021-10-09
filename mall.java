class mall {
	
	public static void main(String[] args){
	shop shp = new shop();
    shp.open();

	String name = shp.name;
	System.out.println("Coffee Day");
	
	shp.floor = "Second";
	String floor = shp.floor;
	
	System.out.println(floor);
	}
}
