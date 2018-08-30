package model;

public class Todo {
	String id;
	String task;
	String status;

	public Todo() {
		
	}
	
	public Todo (String id,String task , String status) {
		super();
		this.id = id;
		this.task = task;
		this.status = status;	
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
