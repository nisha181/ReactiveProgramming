package com.react.ReactiveProgramming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.react.ReactiveProgramming.model.EmployeeModel;
import com.react.ReactiveProgramming.repository.EmployeeRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	EmployeeRepository repo;
	
	
	@GetMapping("/{id}")
	private Mono<EmployeeModel> getEmployeeById(@PathVariable int id) {
	     Mono<EmployeeModel> l=repo.findById(id).log();
	     l.subscribe(System.out::println);
	     return l;
	}
	
	
	@GetMapping
	private Flux<EmployeeModel> getAllEmployees() {
		 Flux<EmployeeModel> l=repo.findAll().log();
	     l.subscribe(System.out::println);
	    return l;
	}
}
