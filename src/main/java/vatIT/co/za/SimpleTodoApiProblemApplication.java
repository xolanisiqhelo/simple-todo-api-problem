package vatIT.co.za;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import vatIT.co.za.model.Todos;
import vatIT.co.za.service.TodoService;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Todo API", version = "2.0", description = "An API specification for a simple Todo api."))
public class SimpleTodoApiProblemApplication {

	@Autowired private TodoService service;
	public static void main(String[] args) {
		SpringApplication.run(SimpleTodoApiProblemApplication.class, args);
	}
	
	@Bean
	public void create()
	{
		Todos todos= new Todos();
		todos.setId("abc123");
		todos.setName("Do some work");
		todos.setCompleted(true);
		
		try {
			service.create(todos);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
