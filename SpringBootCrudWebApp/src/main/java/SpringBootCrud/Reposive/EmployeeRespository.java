package SpringBootCrud.Reposive;

import org.springframework.data.jpa.repository.JpaRepository;
import SpringBootCrud.Model.Employee;

public interface EmployeeRespository extends JpaRepository<Employee, Long> {

}
