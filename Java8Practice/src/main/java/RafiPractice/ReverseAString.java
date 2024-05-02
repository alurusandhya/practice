package RafiPractice;

import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseAString {

	public static void main(String[] args) {
	
		String str = "Sandhya";
		
		IntStream charStream = str.chars();
		
		System.out.println(charStream);
		
		Stream<String> strStream = charStream.mapToObj(ch ->String.valueOf((char)ch));
		System.out.println(strStream);
		
		BinaryOperator<String> accumulator = (first,second) -> {
			System.out.println("acc=> "+first+", second=> "+second);
			return second+first;
		};
		
		String reverseString = strStream.reduce(accumulator).orElse("");
		
		System.out.println(reverseString);
		
		
		System.out.println(Stream.of(str)
	    .map(word->new StringBuilder(word).reverse())
	    .collect(Collectors.joining(" ")));
		
		
		

	}

}
