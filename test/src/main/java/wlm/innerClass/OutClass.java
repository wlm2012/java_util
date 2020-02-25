package wlm.innerClass;

import java.sql.SQLOutput;

/**
 * @author lenovo2
 */
public class OutClass {

	public static void main(String[] args) {

	}


	// Only inner classes can be private.
	// Regular classes always have either package or public access
	private class InnerClass{
		public InnerClass(){
			System.out.println("init inner construct");
		}
	}

	public class Inner{
		public Inner(){
			System.out.println("init inner construct");
		}
	}
}
