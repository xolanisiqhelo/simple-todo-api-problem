package vatit.com.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class ResourceNotFoundException  extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9191891992029693790L;
	
	public ResourceNotFoundException(String message)
	{
		super(message);
	}
}
