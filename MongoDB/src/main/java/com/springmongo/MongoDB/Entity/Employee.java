package com.springmongo.MongoDB.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
@Document(collection="employee")
public class Employee {
	
	//Works in conjecture with MongoDB_Compass
	
	private long empid;
	
	private String fullname;
	

}
