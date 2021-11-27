package vatit.com.model;

import java.util.ArrayList;
import java.util.List;



public class Todos {

	private List<Todo> todos = new ArrayList<>();

	public Todos(List<Todo> todos) {
		super();
		this.todos = todos;
	}

	public Todos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Todo> getTodos() {
		return todos;
	}

	public void setTodos(List<Todo> todos) {
		this.todos = todos;
	}

}
