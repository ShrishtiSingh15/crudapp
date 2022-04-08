package com.example.crudapp;

import com.example.crudapp.model.Employee;
import com.example.crudapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudappApplication.class, args);
	}
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Shrishti");
		employee.setLastName("Singh");
		employee.setEmailId("shrishti@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("John");
		employee1.setLastName("Cargo");
		employee1.setEmailId("john@gmail.com");
		employeeRepository.save(employee1);
	}
}
