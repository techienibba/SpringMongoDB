package com.springmongo.MongoDB.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmongo.MongoDB.Entity.Employee;
import com.springmongo.MongoDB.Repo.MongoRepo;
import com.springmongo.MongoDB.Service.MongoServ;


@Service
public class MongoImpl implements MongoServ{

	@Autowired
	private MongoRepo mongorepo;
	
	
	@Override
	public Employee savempl(Employee employee) {
		// TODO Auto-generated method stub
		return mongorepo.save(employee);
		
	}

	@Override
	public List<Employee> getallemp() {
		// TODO Auto-generated method stub
		return mongorepo.findAll();
	}

}
