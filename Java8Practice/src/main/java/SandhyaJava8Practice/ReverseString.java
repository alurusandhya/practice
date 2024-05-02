package SandhyaJava8Practice;

public class ReverseString {
	
	public static void main(String args[]) {
		

		ReverseFunctionalInterface rfi = str -> {
			
			String result = "";
			
			for(int i = str.length()-1; i>=0; i--) {
				
				result+= str.charAt(i);
				
			}
			return result;
			
			
		};
		
		System.out.println(rfi.reverseString("Sandhya"));
	}

}
