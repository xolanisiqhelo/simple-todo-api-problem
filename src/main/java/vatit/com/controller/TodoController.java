package vatit.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.annotations.Api;
import vatit.com.model.Todo;
import vatit.com.service.TodoService;

@RestController
@RequestMapping("todos")
@Api(value = "Employee Service", tags = {
		"Employee" }, produces = "application/json", consumes = "application/json")
public class TodoController {

	@Autowired
	private TodoService todoService;
	
	
	@RequestMapping( method = RequestMethod.GET, produces = "application/json")
	public List<Todo> doGet()
	{
		
		return todoService.list();
		
	}
	@RequestMapping( method = RequestMethod.POST, produces = "application/json")
	public void doPost(@RequestBody(required = true) Todo todo)
	{
		
		 todoService.create(todo);
		
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = "application/json")
	public void doPut(@PathVariable(name = "id", required = true) String id,@RequestBody(required = true) Todo todo)
	{
		
		 todoService.update(id,todo);
		
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public void doDelete(@PathVariable(name = "id", required = true) String id)
	{
		
		 todoService.delete(id);
		
	}
	
	
}
