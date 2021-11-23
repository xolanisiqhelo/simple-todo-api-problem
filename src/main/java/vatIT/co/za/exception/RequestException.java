package vatIT.co.za.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RequestException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9191891992029693790L;
	
	public RequestException(String message){
        super(message);
    }
}
