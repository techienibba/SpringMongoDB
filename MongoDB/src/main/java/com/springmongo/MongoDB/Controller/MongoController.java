package com.springmongo.MongoDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmongo.MongoDB.Entity.Employee;
import com.springmongo.MongoDB.Service.MongoServ;

@RestController
@RequestMapping("/")
public class MongoController {
	
	
	@Autowired
	private MongoServ mongoserv;
	
	
	@PostMapping("/create")
	ResponseEntity<Employee> addEmployee(@RequestBody Employee employee)
	{
		
		Employee emp= mongoserv.savempl(employee);
		
		return new ResponseEntity<Employee>(emp,HttpStatus.CREATED);
	}
	
	@GetMapping("/getall")
	ResponseEntity<List<Employee>> getall()
	{
		
		List<Employee> allemp= mongoserv.getallemp();
		
		return  ResponseEntity.ok(allemp);
	}
	

}
