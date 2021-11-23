package VatIT.co.za;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import vatIT.co.za.SimpleTodoApiProblemApplication;
import vatIT.co.za.model.Todo;
import vatIT.co.za.model.Todos;
import vatIT.co.za.service.TodoService;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest(classes = SimpleTodoApiProblemApplication.class)
class SimpleTodoApiProblemApplicationTests {
	
    @Autowired
	private TodoService service;

	@Test
	@Transactional
	@Order(1)
	public void test_create_resource() throws Exception {
		Todo resource = service.create(buildRequest());

		Assert.assertEquals(Objects.nonNull(resource), true);
	}

	@Test
	@Transactional
	@Order(2)
	public void test_fetch_all_resource() throws Exception {
		List<Todo> resources = service.list();

		Assert.assertEquals(Objects.nonNull(resources), true);

		Assert.assertEquals(resources.isEmpty(), false);
	}

	@Test
	@Transactional
	@Order(3)
	public void test_put_resource() throws Exception {
		Todo resource = service.update((long) 1, buildRequest());

		Assert.assertEquals(Objects.nonNull(resource), true);

		Assert.assertEquals(resource.getTodos().size(), 1);
	}

	@Test
	@Transactional
	@Order(4)
	public void test_delete_resource() throws Exception {
		boolean resources = service.deleteById((long) 1);

		Assert.assertEquals(Objects.nonNull(resources), true);

	}

	public Todos buildRequest() {
		Todos todos = new Todos();
		todos.setId("1");
		todos.setName("testname");
		todos.setCompleted(false);

		return todos;

	}
}
