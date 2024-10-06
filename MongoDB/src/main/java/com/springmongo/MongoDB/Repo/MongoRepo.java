package com.springmongo.MongoDB.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springmongo.MongoDB.Entity.Employee;

public interface MongoRepo extends MongoRepository<Employee,Long> {

}
