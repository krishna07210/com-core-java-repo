package core.java.Interview.Questions.subclasses;

public class Balloon {

	private String color;

	public Balloon() {
	}

	public Balloon(String c) {
		this.color = c;
//		System.out.println("color HashCode -"+color.hashCode());
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

}
