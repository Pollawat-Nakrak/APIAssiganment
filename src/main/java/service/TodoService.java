package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import model.Todo;

@Service
public class TodoService {
	
	//Data
	private List<Todo> todos = new ArrayList<> (Arrays.asList(
			new Todo("1", "Work1","Pending"),
			new Todo("2", "Work2","Done")
			));
	
	//GetAllList
	public List <Todo> getAllTodos(){
		return todos;
	}
	
	//GetListWithID
	public Todo getTodo(String id) {
		return todos.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	//AddList
	public void addTodo(Todo todo) {
	todos.add(todo);
	}
	
	//UpdateList
	public void updateTodo(String id, Todo todo) {
		for (int i = 0; i < todos.size(); i++) {
			Todo t = todos.get(i);
			if (t.getId().equals(id)) {
				todos.set(i , todo);
				return;
			}
		}
	}
	
	//DeleteListWithID
	public void deleteTodo(String id) {
		todos.removeIf(t -> t.getId().equals(id));
	}
	

	
}
