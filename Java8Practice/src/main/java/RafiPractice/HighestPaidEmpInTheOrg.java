package RafiPractice;

import java.util.Comparator;
import java.util.List;

public class HighestPaidEmpInTheOrg {

	public static void main(String[] args) {
		
		List<Employee> empList = EmployeeListOfData.getEmployeeData();

		System.out.println(empList.stream().max(Comparator.comparing(Employee::getSalary)));
	}

}
