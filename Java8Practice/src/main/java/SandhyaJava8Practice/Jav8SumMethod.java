package SandhyaJava8Practice;

import java.util.Arrays;
import java.util.List;

public class Jav8SumMethod {
	public static void main(String args[]) {
		
		List<Integer> numbers = Arrays.asList(2,4,6,8,4,8);
		
		 int factor = 2;
		
	     System.out.println(numbers.stream().filter(number -> number % factor == 0).mapToInt(number -> number*2).sum());
	     factor = 3;
		
	}

}
