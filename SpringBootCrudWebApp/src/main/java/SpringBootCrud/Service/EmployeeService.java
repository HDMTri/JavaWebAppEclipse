package SpringBootCrud.Service;

import java.util.List;

import SpringBootCrud.Model.Employee;
public interface EmployeeService {
	List<Employee> getAllEmployees();
	
	void saveEmloyee(Employee employee);

}
