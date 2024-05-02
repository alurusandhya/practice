package RafiPractice;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestSalaryOfEmployee {

	public static void main(String[] args) {
		
		List<Employee> empList = EmployeeListOfData.getEmployeeData();
		
		Optional<Employee> emp = empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
		
		System.out.println(emp.get());
	}

}
