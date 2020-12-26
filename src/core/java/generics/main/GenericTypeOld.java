package core.java.generics.main;

public class GenericTypeOld {

	private Object t;

	public Object getT() {
		return t;
	}

	public void setT(Object t) {
		this.t = t;
	}

	public static void main(String[] args) {

		GenericTypeOld type = new GenericTypeOld();
		type.setT("Hari");
		type.setT(new Integer(1));

		String str = (String) type.getT(); // type casting, error prone and can cause ClassCastException

		System.out.println(type.getT());
	}
}

/*
 * Exception in thread "main" java.lang.ClassCastException: java.lang.Integer
 * cannot be cast to java.lang.String at
 * core.java.generics.main.GenericTypeOld.main(GenericTypeOld.java:21)
 */