package vatit.com.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import generated.vatit.com.model.InlineResponse500;
import vatit.com.exceptions.ResourceNotFoundException;
import vatit.com.model.Todo;

@Service
public class TodoService {

	private List<Todo> todos = new ArrayList<Todo>(Arrays.asList(

			new Todo("abc123", "Do some work", true)

	));

	public List<Todo> list() {

		return todos;
	}

	public Todo create(Todo todo) {

		if (todo.getName().equals("I'm lazy")) {

			InlineResponse500 message = new InlineResponse500();
			message.setMessage("Oops something went wrong");

			throw new ResourceNotFoundException(message.toString());

		}

		todos.add(todo);
		return todo;

	}

	public Todo update(String id, Todo todo) {

		for (int i = 0; i < todos.size(); i++) {
			Todo t = todos.get(i);
			if (t.getId().equals(id)) {
				todos.set(i, todo);

				return t;

			}

		}
		return todo;

	}

	public void delete(String id) {

		todos.removeIf(t -> t.getId().equals(id));

	}

}
