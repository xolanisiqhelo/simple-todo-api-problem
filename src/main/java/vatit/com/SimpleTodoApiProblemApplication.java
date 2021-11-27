package vatit.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition(info = @io.swagger.v3.oas.annotations.info.Info(title = "Todo API", version = "2.0", description = "An API specification for a simple Todo api."))

public class SimpleTodoApiProblemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleTodoApiProblemApplication.class, args);
	}

}
