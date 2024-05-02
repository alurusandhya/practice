package RafiPractice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AvgAgeOfMaleAndFemales {

	public static void main(String[] args) {
		
		List<Employee> empList = EmployeeListOfData.getEmployeeData();
		
		Map<String, Double> avgAgeOfMaleAndFemaleEmployees=empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));

		System.out.println(avgAgeOfMaleAndFemaleEmployees);
	}

}
