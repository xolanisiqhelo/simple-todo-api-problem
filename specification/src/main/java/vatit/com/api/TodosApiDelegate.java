package vatit.com.api;

import vatit.com.model.InlineResponse500;
import vatit.com.model.Todo;
import vatit.com.model.Todos;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link TodosApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-25T20:30:58.672458+02:00[Africa/Johannesburg]")

public interface TodosApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /todos : Returns a list of all todos
     * Returns all todos currently stored with the service. 
     *
     * @return OK (status code 200)
     *         or General Error (status code 500)
     * @see TodosApi#todosGet
     */
    default ResponseEntity<Todos> todosGet() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"todos\" : [ { \"name\" : \"Do some work\", \"id\" : \"abc123\", \"completed\" : true }, { \"name\" : \"Do some work\", \"id\" : \"abc123\", \"completed\" : true } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /todos/{id} : Delete a todo
     * Removes the todo matching the given id. 
     *
     * @param id  (required)
     * @return OK (status code 200)
     *         or General Error (status code 500)
     * @see TodosApi#todosIdDelete
     */
    default ResponseEntity<Void> todosIdDelete(String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /todos/{id} : Update a todo
     * Updates the entire todo object matching the given id, with the exception of the id. 
     *
     * @param id  (required)
     * @param todo  (required)
     * @return OK (status code 200)
     *         or General Error (status code 500)
     * @see TodosApi#todosIdPut
     */
    default ResponseEntity<Todo> todosIdPut(String id,
        Todo todo) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"Do some work\", \"id\" : \"abc123\", \"completed\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /todos : Add a new todo
     * Creates a new todo based on the given structure with a unique generated id. 
     *
     * @param todo  (required)
     * @return OK (status code 200)
     *         or General Error (status code 500)
     * @see TodosApi#todosPost
     */
    default ResponseEntity<Todo> todosPost(Todo todo) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"Do some work\", \"id\" : \"abc123\", \"completed\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
