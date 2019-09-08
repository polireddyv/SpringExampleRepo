package com.example.rest.webservices.restfulwebservices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoServiceHardCoded {

	private static List<TodoBean> allTodoList;

	static {
		allTodoList = new ArrayList<>();
		allTodoList.add(new TodoBean(1, "Learn React", "reddy", new Date(), true));
		allTodoList.add(new TodoBean(2, "Note all pending concepts", "reddy", new Date(), false));
		allTodoList.add(new TodoBean(3, "Understand Spring boot config", "reddy", new Date(), true));
		allTodoList.add(new TodoBean(4, "Dig into JVM internals", "reddy", new Date(), false));
	}

	public List<TodoBean> getAllTodoList() {
		return allTodoList;
	}

	public TodoBean findById(int id) {
		for (TodoBean todo : allTodoList) {
			if (todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}

	public TodoBean deleteById(int id) {
//		return TodoListHardCoded.getAllTodoList().stream().map(e -> e.getId()).filter(e -> e == id).count();
		TodoBean todo = findById(id);
		System.out.println(todo);
		if (allTodoList.remove(todo)) {
			return todo;
		}
		return null;
	}

}
