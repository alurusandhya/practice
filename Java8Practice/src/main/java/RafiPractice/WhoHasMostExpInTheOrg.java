package RafiPractice;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WhoHasMostExpInTheOrg {

	public static void main(String[] args) {
		
		List<Employee> empList = EmployeeListOfData.getEmployeeData();
		
		System.out.println(empList.stream().min(Comparator.comparing(Employee::getYearOfJoining)).get());

	}

}
