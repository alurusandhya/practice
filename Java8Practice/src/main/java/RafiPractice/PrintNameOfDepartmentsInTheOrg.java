package RafiPractice;

import java.util.List;

public class PrintNameOfDepartmentsInTheOrg {

	public static void main(String[] args) {
		
		List<Employee> empList = EmployeeListOfData.getEmployeeData();
		//empList.stream().forEach(System.out::println);
		
		empList.stream().map(emp ->emp.getDepartment()).forEach(System.out::println);
	}

}
