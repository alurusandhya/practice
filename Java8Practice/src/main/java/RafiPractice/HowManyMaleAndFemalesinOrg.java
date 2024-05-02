package RafiPractice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HowManyMaleAndFemalesinOrg {
	
	public static void main(String[] args) {
		
		List<Employee> empList = EmployeeListOfData.getEmployeeData();
		
	    Map<String, Long> noOfMaleAndFemaleEmployees= empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		
	    System.out.println(noOfMaleAndFemaleEmployees);
	}

}
