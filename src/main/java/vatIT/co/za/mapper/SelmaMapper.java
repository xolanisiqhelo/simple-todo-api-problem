package vatIT.co.za.mapper;

import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.Mapper;
import vatIT.co.za.model.Todo;
import vatIT.co.za.model.Todos;

@Mapper(withIgnoreMissing = IgnoreMissing.ALL, withIgnoreNullValue = true)
public interface SelmaMapper {

	Todo updateTodo(Todos in, Todo out);
	

}
