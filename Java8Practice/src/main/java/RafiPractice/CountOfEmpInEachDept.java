package RafiPractice;

import java.util.List;
import java.util.stream.Collectors;

public class CountOfEmpInEachDept {

	public static void main(String[] args) {
		
		List<Employee> empList = EmployeeListOfData.getEmployeeData();
		
		System.out.println(empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting())));

	}

}
