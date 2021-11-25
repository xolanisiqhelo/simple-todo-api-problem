package vatit.com;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import vatit.com.model.Todo;
import vatit.com.model.Todos;



/**
 * Simple strategy test.
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTest {
    @Autowired
	private TodoApiDelegate todoApiDelegate;
    
	@Test
	@Transactional
	@Order(1)
	public void test_create_resource() throws Exception {
		ResponseEntity<Todo> resource =  todoApiDelegate.todosPost(buildRequest());
		
		Assert.assertEquals(Objects.nonNull(resource), true);
	}

	@Test
	@Transactional
	@Order(2)
	public void test_fetch_all_resource() throws Exception {
		ResponseEntity<Todos> resources = todoApiDelegate.todosGet();

		Assert.assertEquals(Objects.nonNull(resources), true);

//		Assert.assertEquals(resources.getStatusCode(), false);
	}

//	@Test
//	@Transactional
//	@Order(3)
	public void test_put_resource() throws Exception {
	
		ResponseEntity<Todo> resource = todoApiDelegate.todosIdPut("abc123", buildRequest());


	}

//	@Test
//	@Transactional
//	@Order(4)
	public void test_delete_resource() throws Exception {
		ResponseEntity<Void> resource = todoApiDelegate.todosIdDelete("abc123");


	}

	public Todo buildRequest() {
		Todo todo = new Todo();
		todo.setId("abc123");
		todo.setName("Do some work");
		todo.setCompleted(false);

		return todo;

	}
}
