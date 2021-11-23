package vatIT.co.za.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import fr.xebia.extras.selma.Selma;
import vatIT.co.za.exception.RequestException;
import vatIT.co.za.mapper.SelmaMapper;
import vatIT.co.za.model.Todo;
import vatIT.co.za.model.Todos;
import vatIT.co.za.repository.TodoRepository;

@Service
public class TodoService {

	@Autowired
	private TodoRepository repo;

	private SelmaMapper mapper = Selma.builder(SelmaMapper.class).build();

	public Todo create(Todos dto) throws Exception {
		try {
			Todo todo = new Todo();
			
			List<Todos> todoslist = new ArrayList<Todos>();
			
			todoslist.add(dto);
			
			todo.setTodos(todoslist);
			
			System.out.println("data------->"+ new Gson().toJson(dto.getName()));
			if(dto.getName().equals("I'm lazy"))
			{
				throw new RequestException("Oops something went wrong");
			}else
			{
			
        	return 	repo.save(todo);
			}

		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public List<Todo> list() throws Exception {

		try {
			List<Todo> todo = repo.findAll();
			if (!todo.isEmpty()) {
				return todo;
			} else {
				throw new RequestException("todo not found");
			}

		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public Todo update(Long id, Todos dto) throws Exception {
		try {
			
			System.out.println("data------->"+ new Gson().toJson((dto)));
			Optional<Todo> todo = repo.findById(id);
			if (todo.isPresent()) {
				Todo updateTodo = mapper.updateTodo(dto, todo.get());
				System.out.println("data------->"+ new Gson().toJson((updateTodo)));
				Todo updatedTodo = repo.save(updateTodo);
				return updatedTodo;

			} 
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return null;
	}

	public boolean deleteById(Long id) throws Exception {

		try {
			Optional<Todo> todo = repo.findById(id);
			if (todo.isPresent()) {
				repo.deleteById(id);

				if (repo.findById(id).isPresent())
					return false;
				else
					return true;

			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return false;
	}

}
