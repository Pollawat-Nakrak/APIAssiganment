package model;

public class Todo {
	String id;
	String task;
	

	public Todo() {
		
	}
	
	public Todo (String id,String task) {
		super();
		this.id = id;
		this.task = task;
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}

}
