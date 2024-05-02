package SandhyaJava8Practice;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyNumCount {

	public static void main(String[] args) {
		List<Integer> list1 = List.of(1,5,3,4);
	    List<Integer> list2 = List.of(1,6,6,4);
	    List<List<Integer>> multipleList = List.of(list1,list2); 
	    
	    System.out.println(multipleList.stream().flatMap(List::stream).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
	}

}
