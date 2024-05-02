package RafiPractice;

import java.util.List;
import java.util.stream.Collectors;

public class SepEmpBelowAndAboveOf25Age {

	public static void main(String[] args) {
		
		List<Employee> empList = EmployeeListOfData.getEmployeeData();
		
		
		System.out.println(empList.stream().collect(Collectors.partitioningBy(emp->emp.getAge()>25)));
	}

}
