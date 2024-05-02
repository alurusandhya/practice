package SandhyaJava8Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemoJava8 {
	
	//Optional java8 link in detail
	// https://javarevisited.blogspot.com/2017/04/10-examples-of-optional-in-java-8.html#axzz8YFUP29uN

	public static void main(String[] args) {
		Address johnaddress = new Address("52/A, 22nd Street", "Mumbai", "India", 400001); 
		Person john = new Person("John",Optional.of(johnaddress), 874731232); 
		Person mac = new Person("Mac", Optional.empty(), 333299911); 
		Person gautam = new Person("Gautam", Optional.empty(), 533299911);
		
		List<Person> people = new ArrayList<>();
		people.add(john); 
		people.add(mac); 
		people.add(gautam); 
		people.stream().forEach((p) -> { 
			System.out.printf("%s from %s %n", p.name(), p.address().orElse(Address.EMPTY_ADDRESS)); 
			
		}); 

	}

}
