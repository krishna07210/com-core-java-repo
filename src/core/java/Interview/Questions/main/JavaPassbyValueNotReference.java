package core.java.Interview.Questions.main;

import core.java.Interview.Questions.subclasses.Balloon;

/*Java is Pass by Value and Not Pass by Reference
 * One of the biggest confusion in Java programming language is whether java
 * is Pass by Value or Pass by Reference. I ask this question a lot in interviews and still see interviewee confused with it. 
 *  */

public class JavaPassbyValueNotReference {

	public static void main(String[] args) {

		System.out.println("Before swapping");

		Balloon red = new Balloon("Red"); // memory reference 50
		System.out.println("red Value - " + red.getColor());
		System.out.println("red Reference - " + red.hashCode());

		Balloon blue = new Balloon("Blue");// memory reference 100
		System.out.println("blue Value - " + blue.getColor());
		System.out.println("blue Reference - " + blue.hashCode());

		swap(red, blue);

		System.out.println("After Swapping");
		System.out.println("red Value - " + red.getColor());
		System.out.println("red Reference - " + red.hashCode());
		System.out.println("blue Value - " + blue.getColor());
		System.out.println("blue Reference - " + blue.hashCode());

		foo(blue);

		System.out.println("blue color=" + blue.getColor());
	}

	private static void swap(Object o1, Object o2) {
		Object temp = o1; // temp=50, o1=50, o2=100
		o1 = o2; // temp=50, o1=100, o2=100
		o2 = temp; // temp=50, o1=100, o2=50
	}

	private static void foo(Balloon balloon) { // baloon=100
		System.out.println(balloon.getColor());
		balloon.setColor("Red"); // baloon=100
		System.out.println(balloon.getColor());
		balloon = new Balloon("Green"); // baloon=200
		System.out.println(balloon.getColor());
		balloon.setColor("Blue"); // baloon = 200
		System.out.println(balloon.getColor());
		
		/*In the next line, ballon reference is changed to 200 and any further methods 
		 * executed are happening on the object at memory location 200 and not having any 
		 * effect on the object at memory location 100. This explains the third line of our 
		 * program output printing blue color=Red.
		 * 
		 */
	}
}
