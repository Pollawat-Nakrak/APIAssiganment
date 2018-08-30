package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Todo;
import service.TodoService;

@RestController
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	//View All list
	@RequestMapping("/todos")
	public List<Todo>getAllTodo() {
		return todoService.getAllTodos();
	}
	
	//View single task
	@RequestMapping("/todos/{id}")
	public Todo getTodo(@PathVariable String id) {
		return todoService.getTodo(id);
	}
	
	//Add
	@RequestMapping(method=RequestMethod.POST,value="/todos")
	public void addTodo(@RequestBody Todo todo) {
		todoService.addTodo(todo);
	}
	
	//Edit , Set
	@RequestMapping(method=RequestMethod.PUT,value="/todos/{id}")
	public void updateTodo(@RequestBody Todo todo , @PathVariable String id) {
		todoService.updateTodo(id , todo);
	}
	
	//Delete
	@RequestMapping(method=RequestMethod.DELETE,value="/todos/{id}")
	public void deleteTodo(@PathVariable String id) {
		todoService.deleteTodo(id);
	}
}
