package RafiPractice;

import java.util.List;

public class NameOfEmpJoinedAfter2015 {

	public static void main(String[] args) {
		
		List<Employee> empList = EmployeeListOfData.getEmployeeData();
		
		empList.stream().filter(emp->emp.getYearOfJoining()>2015).map(emp->emp.getName()+", joing year = "+emp.getYearOfJoining()).forEach(System.out::println);
		

	}

}
