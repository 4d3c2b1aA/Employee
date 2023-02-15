package com.element.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.element.entity.Employee;
import com.element.repository.employeeRepo;

@RestController
public class EmpController {
	
	@Autowired
	private employeeRepo empRepo;
	
	
@PostMapping(value= {"/addEmployee"},consumes = {"application/json","application/xml"})
	
	public ResponseEntity<String> addEmployee(@RequestBody Employee emp){
	
		String msg=null;
		 Employee save = empRepo.save(emp);
		if(save.getId()!=null) {
			msg="Employee Data Successfully Saved....!!";
		}
		else {
			msg="Failed to save...!!";
		}
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
       @GetMapping(value= "/getEmployee/{id}",produces  = {"application/json","application/xml"})
     public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id){
    	  Optional<Employee> findById = empRepo.findById(id);
    	 if(findById.isPresent()) {
    		 Employee employee = findById.get();
    		 return new ResponseEntity<>(employee,HttpStatus.OK);
    	 }
    	 else {
    		 return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
    	 }
     }
       
        @PutMapping("/updateEmployee/{id}")
       public ResponseEntity<String> updateEmployee(@RequestBody Employee emp){
    	   Employee save = empRepo.save(emp);
    	   String msg="Employee record update Successfully...!!!";
    	   return new ResponseEntity<String>(msg,HttpStatus.OK);
       }
        
        @DeleteMapping("/deleteEmployee/{id}")
        public ResponseEntity<String> DeleteEmployee(@PathVariable Integer id){
     	   empRepo.deleteById(id);
     	   String msg="Employee record deleted Successfully...!!!";
     	   return new ResponseEntity<String>(msg,HttpStatus.OK);
        }
	
	
}


