package aicp.foundation.bank.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class ApplicationExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ResponseBody
	ExceptionResponse handleResourceNotFoundException(ResourceNotFoundException exception, HttpServletRequest request) {
		ExceptionResponse ex = new ExceptionResponse();
		ex.setMeassage(exception.getMessage());
		ex.setUrl(request.getRequestURI());
		return ex;
	}
}
