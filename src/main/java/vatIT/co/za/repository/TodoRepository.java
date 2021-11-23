package vatIT.co.za.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vatIT.co.za.model.Todo;

@Repository
public interface TodoRepository  extends JpaRepository<Todo, Long>{

}
