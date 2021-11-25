package vatit.com;

import java.util.ArrayList;
import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import vatit.com.api.TodosApiDelegate;
import vatit.com.exceptions.ResourceNotFoundException;
import vatit.com.model.*;

@Service
public class TodoApiDelegate implements TodosApiDelegate {
	List<Todo> todolist = new ArrayList<Todo>();

	@Override
	public ResponseEntity<Todos> todosGet() {

		Todos todos = new Todos();

		Todo todo = new Todo();
		todo.setId("abc123");
		todo.setName("Do some work");
		todo.setCompleted(true);

		todolist.add(todo);

		todos.setTodos(todolist);

		return ResponseEntity.ok(todos);
	}

	@Override
	public ResponseEntity<Todo> todosPost(Todo todo)

	{

		if (todo.getName().equals("I'm lazy")) {

			InlineResponse500 message = new InlineResponse500();
			message.setMessage("Oops something went wrong");

			throw new ResourceNotFoundException(message.toString());

		}

		return ResponseEntity.ok(todo);

	}

	@Override
	public ResponseEntity<Void> todosIdDelete(String id) {

		for (Todo todo : todolist) {
			if (!todo.getId().equals(id)) {

				InlineResponse500 message = new InlineResponse500();
				message.setMessage("Oops something went wrong");

				throw new ResourceNotFoundException(message.toString());

			}
			todolist.remove(todo);

		}
		return null;

	}
	@Override
	public ResponseEntity<Todo> todosIdPut(String id, Todo todo) {
		

		System.out.println("tst-->-------------------------"+todolist);
		for (Todo _todo : todolist) {
			if (!todo.getId().equals(id)) {

				
				InlineResponse500 message = new InlineResponse500();
				message.setMessage("Oops something went wrong");

				throw new ResourceNotFoundException(message.toString());

			}
			
			todolist.remove(_todo);
			
	
		}
		return ResponseEntity.ok(todo);

	}

}
