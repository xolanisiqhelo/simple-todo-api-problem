package vatIT.co.za.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vatIT.co.za.model.Todo;
import vatIT.co.za.model.Todos;

@Repository
public interface TodoRepository  extends JpaRepository<Todo, Long>{

	Optional<Todos> findById(String id);

	Todos save(Todos updateTodo);

}
