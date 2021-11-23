package vatIT.co.za.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import vatIT.co.za.model.Todo;
import vatIT.co.za.model.Todos;
import vatIT.co.za.service.TodoService;

@RestController
@RequestMapping("/todos")
public class TodoController {

	@Autowired
	private TodoService service;

	@RequestMapping(method = RequestMethod.POST, produces = "application/json")
	@Operation(summary = "Add a new todo",
	description = "Creates a new todo based on the given structure with a unique generated id.")
	 @ApiResponses(value = {
	            @ApiResponse(responseCode = "200",
	            description = "Ok",
	            content = {@Content(mediaType = "application/json",schema = @Schema(implementation = Todos.class))}),
	            @ApiResponse(responseCode = "500",
	            description = " General Error",
	            content = {@Content(mediaType = "application/json")})    })
	public ResponseEntity<Object> create(@RequestBody(required = true) Todos dto) throws Exception {
		return new ResponseEntity<>(service.create(dto), HttpStatus.CREATED);

	}

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	@Operation(summary = "Returns a list of all todos",
	description = "Returns all todos currently stored with the service.")
	 @ApiResponses(value = {
	            @ApiResponse(responseCode = "200",
	            description = "Ok",
	            content = {@Content(mediaType = "application/json",schema = @Schema(implementation = Todo.class))}),
	            @ApiResponse(responseCode = "500",
	            description = " General Error",
	            content = {@Content(mediaType = "application/json")})    })
	public ResponseEntity<Object> list() throws Exception {

		return new ResponseEntity<>(service.list(), HttpStatus.ACCEPTED);

	}

	@PutMapping(value = "/{id}", produces = "application/json")
	@Operation(summary = "Update a todo",
	description = "Updates the entire todo object matching the given id, with the exception of the id.")
	 @ApiResponses(value = {
	            @ApiResponse(responseCode = "200",
	            description = "Ok",
	            content = {@Content(mediaType = "application/json",schema = @Schema(implementation = Todos.class))}),
	            @ApiResponse(responseCode = "500",
	            description = " General Error",
	            content = {@Content(mediaType = "application/json")})    })
	public ResponseEntity<Object> update(@PathVariable(required = true) Long id,
			@RequestBody(required = true) Todos dto) throws Exception {

		return new ResponseEntity<>(service.update(id, dto), HttpStatus.OK);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
	@Operation(summary = "Delete a todo",
	description = "Removes the todo matching the given id.")
	 @ApiResponses(value = {
	            @ApiResponse(responseCode = "200",
	            description = "Ok",
	            content = {@Content(mediaType = "application/json",schema = @Schema(implementation = Todos.class))}),
	            @ApiResponse(responseCode = "500",
	            description = " General Error",
	            content = {@Content(mediaType = "application/json")})    })
	public ResponseEntity<Object> deleteById(@PathVariable(value = "id") Long id) throws Exception {

		return new ResponseEntity<>(service.deleteById(id), HttpStatus.OK);

	}

}
