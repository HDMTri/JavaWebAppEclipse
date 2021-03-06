package SpringBootCrud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringBootCrud.Model.Employee;
import SpringBootCrud.Reposive.EmployeeRespository;

@Service
public class EmployeeServiceTmpl implements EmployeeService{

	@Autowired
	private EmployeeRespository employeeReoonsitory;
	@Override
	public List<Employee> getAllEmployees() {
		return employeeReoonsitory.findAll();
	}
	@Override
	public void saveEmloyee(Employee employee) {
		// TODO Auto-generated method stub
		this.employeeReoonsitory.save(employee);
	}

}
