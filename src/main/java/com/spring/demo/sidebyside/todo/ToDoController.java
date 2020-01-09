package com.spring.demo.sidebyside.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.sidebyside.repository.ToDoRepository;

@RestController
public class ToDoController {

	@Autowired
	private ToDoRepository todoRepository;	
	

	@GetMapping("/todos")
	public List<ToDo> getAllToDos() {
		return todoRepository.findAll();
	}

	@PutMapping("/todos")
	public List<ToDo> addToDo(@RequestBody ToDo todo) {

		todoRepository.save(todo);
		return todoRepository.findAll();
	}
	
//Using CrudRepository	
//	@GetMapping("/todos")
//	public List<ToDo> getAllToDos() {
//		List<ToDo> todos = new ArrayList<ToDo>();
//		todoRepository.findAll().forEach(todos::add);
//		return todos;
//	}

}
