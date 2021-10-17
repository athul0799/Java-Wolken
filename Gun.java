package mywork;

public class Gun {
	private String name;
	private float cost;
	private String model;
	private int license;
	private String type;
	
	
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	
	void setCost(float cost) {
		this.cost = cost;
	}
	float getCost() {
		return cost;
	}
	void setModel(String model) {
		this.model = model;
	}
	String getModel() {
		return model;
	}
	
	void setType(String type) {
		this.type = type;
	}
	String getType() {
		return type;
	}
	
	void setLicense(int license) {
		this.license = license;
	}
	int getLicense() {
		return license;
	}
	
	
}


