package com.example.rest.webservices.restfulwebservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins= {"http://localhost:4200"})
public class TodoController {

	@Autowired
	private TodoServiceHardCoded service;
	
	@GetMapping(path="/users/{username}/getTodoItems")
	public List<TodoBean> getTodoItems(@PathVariable String username) {
		System.out.println("User name: "+username);
		return service.getAllTodoList();
	}
	
	@DeleteMapping(path="/users/{username}/deleteTodoItem/{id}")
	public ResponseEntity<Void> deleteTodoItem(@PathVariable String username, @PathVariable int id) {
		System.out.println("Todo item id requested for delete: "+id);
		System.out.println("Before delete count: "+service.getAllTodoList().size());
		if(service.deleteById(id) != null) {
			System.out.println("After delete count: "+service.getAllTodoList().size());
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}
}
