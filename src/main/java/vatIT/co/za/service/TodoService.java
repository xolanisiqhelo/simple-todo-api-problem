package vatIT.co.za.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.xebia.extras.selma.Selma;
import vatIT.co.za.exception.BadRequestException;
import vatIT.co.za.mapper.SelmaMapper;
import vatIT.co.za.model.Todo;
import vatIT.co.za.model.Todos;
import vatIT.co.za.repository.TodoRepository;

@Service
public class TodoService {

	@Autowired
	private TodoRepository repo;

	private SelmaMapper mapper = Selma.builder(SelmaMapper.class).build();

	public Todo create(Todos dto) {
		try {
			Todo todo = new Todo();
			
			List<Todos> todoslist = new ArrayList<Todos>();
			
			todoslist.add(dto);
			
			todo.setTodos(todoslist);
			
			return repo.save(todo);

		} catch (Exception e) {
			throw new BadRequestException(e.getMessage());
		}
	}

	public List<Todo> list() throws Exception {

		try {
			List<Todo> todo = repo.findAll();
			if (!todo.isEmpty()) {
				return todo;
			} else {
				throw new BadRequestException("user not found");
			}

		} catch (Exception e) {
			throw new BadRequestException(e.getMessage());
		}
	}

	public Todos update(String id, Todos dto) {
		try {
			Optional<Todos> todo = repo.findById(id);
			if (todo.isPresent()) {
				Todos updateTodo = mapper.updateTodo(dto, todo.get());
				Todos updatedTodo = repo.save(updateTodo);
				return updatedTodo;

			} else {
				throw new BadRequestException("todo not found");
			}
		} catch (Exception e) {
			throw new BadRequestException(e.getMessage());
		}
	}

	public boolean deleteById(Long id) {

		try {
			Optional<Todo> todo = repo.findById(id);
			if (todo.isPresent()) {
				repo.deleteById(id);

				if (repo.findById(id).isPresent())
					return false;
				else
					return true;

			} else {
				throw new BadRequestException("todo not found");
			}
		} catch (Exception e) {
			throw new BadRequestException(e.getMessage());
		}
	}

}
