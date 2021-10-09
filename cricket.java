class cricket {
	
	public static void main(String[] args){
	Teams team = new Teams();
    team.strength();

	String colour = team.jerseyColour;
	System.out.println("colour");
	
	team.name = "RCB";
	String teamName = team.name;
	
	System.out.println(teamName);
	}
}
