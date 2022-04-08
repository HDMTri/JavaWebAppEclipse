package SpringBootCrud.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import SpringBootCrud.Service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	//display list of emplyees
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listEmployees",employeeService.getAllEmployees());
		return "index";
	}
}
