package vatit.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

/**
 * Application start.
 */
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Todo API", version = "2.0", description = "An API specification for a simple Todo api."))
public class Application {

	public static void main(final String[] args) {
		SpringApplication.run(Application.class, args);
	}

}


