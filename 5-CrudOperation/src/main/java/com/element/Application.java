package com.element;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.element.entity.Employee;
import com.element.repository.employeeRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		/*employeeRepo repo = context.getBean(employeeRepo.class);
		
		Employee e = new Employee();
		e.setId(1);
		e.setFirstName("Raj");
		e.setLastName("Verma");
		e.setEmail("raj.verma@imagine.com");
		e.setAge("35");
		
		Employee e1 = new Employee();
		e1.setId(2);
		e1.setFirstName("Vaibhav");
		e1.setLastName("Telang");
		e1.setEmail("v.telang@futureready.com");
		e1.setAge("29");
		
		Employee e2 = new Employee();
		e2.setId(3);
		e2.setFirstName("Ketan");
		e2.setLastName("Bahadur");
		e2.setEmail(" k.bahadur@infonext.com");
		e2.setAge("32");
		
		Employee e3 = new Employee();
		e3.setId(4);
		e3.setFirstName("Abhishek");
		e3.setLastName("Raj");
		e3.setEmail(" abhi.raj@softsol.com");
		e3.setAge("30");
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		repo.saveAll(al);*/
	}

}
