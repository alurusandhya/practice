package RafiPractice;

import java.util.Comparator;
import java.util.List;

public class YoungestMaleEmpInADept {

	public static void main(String[] args) {


		List<Employee> empList = EmployeeListOfData.getEmployeeData();
		
		System.out.println(empList.stream()
				.filter(emp->emp.getGender().equals("Male") && emp.getDepartment().equals("Product Development"))
				.min(Comparator.comparing(Employee::getAge)));
	}

}
