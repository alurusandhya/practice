package SandhyaJava8Practice;

public class ThreadClass {
	
	public static void main(String args[]) {

	new Thread (() ->  { System.out.println("new Thread started");}).start();
	}

}
