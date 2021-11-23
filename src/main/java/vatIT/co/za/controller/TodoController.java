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

import vatIT.co.za.exception.BadRequestException;
import vatIT.co.za.model.Todos;
import vatIT.co.za.service.TodoService;

@RestController
@RequestMapping("/todos")
public class TodoController {

	@Autowired
	private TodoService service;

	@RequestMapping(method = RequestMethod.POST, produces = "application/json")
//	@ApiOperation(value = "Add a new todo")
	public ResponseEntity<Object> create(@RequestBody(required = true) Todos dto) throws Exception {
		return new ResponseEntity<>(service.create(dto), HttpStatus.CREATED);

	}

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
//	@ApiOperation(value = "Returns a list of all todos")
	public ResponseEntity<Object> list() throws Exception {

		return new ResponseEntity<>(service.list(), HttpStatus.ACCEPTED);

	}

	@PutMapping(value = "/{id}", produces = "application/json")
//	@ApiOperation(value = "Update a todo")
	public ResponseEntity<Object> update(@PathVariable(required = true) Long id,
			@RequestBody(required = true) Todos dto) throws Exception {

		return new ResponseEntity<>(service.update(id, dto), HttpStatus.OK);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
//	@ApiOperation(value =  "Delete a todo")
	public ResponseEntity<Object> deleteById(@PathVariable(value = "id") Long id) throws BadRequestException {

		return new ResponseEntity<>(service.deleteById(id), HttpStatus.OK);

	}

}
