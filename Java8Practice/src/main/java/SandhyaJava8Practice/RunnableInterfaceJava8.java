package SandhyaJava8Practice;

public class RunnableInterfaceJava8 {

	public static void main(String args[]) {
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("new Runnable Thread started");				
			}
			
		}).start();
	}

}
