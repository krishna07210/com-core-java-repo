package core.java.Interview.Questions.main;

public class StrinBuilderExample {

	
	public static void main (String [] args) {
		
		StringBuilder str = new StringBuilder();
		
		str.append("Hari");
		str.append(",");
		
		System.out.println(str.substring(0,str.length()-1));
		
	}
}
