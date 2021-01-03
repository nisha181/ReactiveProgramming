package com.react.ReactiveProgramming.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table(value="Employee")
public class EmployeeModel {

	@Id
	@Column(value="ID")
	private int id;
	@Column(value="NAME")
	private String name;
}
