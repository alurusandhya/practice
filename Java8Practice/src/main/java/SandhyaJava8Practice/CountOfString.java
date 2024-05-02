package SandhyaJava8Practice;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class CountOfString {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<String> listsvalues = List.of("one","two","three");
		System.out.println(listsvalues.stream().map(word -> word.length()+"="+word).collect(Collectors.toList()));

	}

}
