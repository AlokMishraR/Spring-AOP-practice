package gupta.shanu.model;

public class Circle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("circle setName gets called");
	}
	
	public String setNameWithReturn(String name) {
		this.name = name;
		System.out.println("circle setNameWithReturn gets called");
		throw(new RuntimeException());
	}
}
