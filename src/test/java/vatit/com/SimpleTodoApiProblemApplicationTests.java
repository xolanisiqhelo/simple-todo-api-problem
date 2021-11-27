package vatit.com;

import java.util.List;
import java.util.Objects;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import vatit.com.model.Todo;
import vatit.com.service.TodoService;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest(classes = SimpleTodoApiProblemApplication.class)
class SimpleTodoApiProblemApplicationTests {

	 @Autowired
		private TodoService todoService;
	    
		@Test
		@Transactional
		@Order(1)
		public void test_create_resource() throws Exception {
			Todo resource =  todoService.create(buildRequest());
			
			Assert.assertEquals(Objects.nonNull(resource), true);
		}

		@Test
		@Transactional
		@Order(2)
		public void test_fetch_all_resource() throws Exception {
			List<Todo> resources = todoService.list();

			Assert.assertEquals(Objects.nonNull(resources), true);

//			Assert.assertEquals(resources.getStatusCode(), false);
		}

		@Test
		@Transactional
		@Order(3)
		public void test_put_resource() throws Exception {
		
			 todoService.update("abc123", buildRequest());


		}

		@Test
		@Transactional
		@Order(4)
		public void test_delete_resource() throws Exception {
			 todoService.delete("abc123");


		}

		public Todo buildRequest() {
			Todo todo = new Todo();
			todo.setId("abc123");
			todo.setName("Do some work");
			todo.setCompleted(false);

			return todo;

		}

}
