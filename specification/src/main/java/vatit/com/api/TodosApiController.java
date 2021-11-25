package vatit.com.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-25T20:30:58.672458+02:00[Africa/Johannesburg]")

@Controller
@RequestMapping("${openapi.todo.base-path:}")
public class TodosApiController implements TodosApi {

    private final TodosApiDelegate delegate;

    public TodosApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) TodosApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new TodosApiDelegate() {});
    }

    @Override
    public TodosApiDelegate getDelegate() {
        return delegate;
    }

}
