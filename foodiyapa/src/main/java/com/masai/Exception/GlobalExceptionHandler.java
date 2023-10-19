package com.masai.Exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(FoodiyapaException.class)
	public ResponseEntity<String> foodiyapaException(FoodiyapaException fe){
		return new ResponseEntity<String>(fe.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<String> noExceptionHandler(NoHandlerFoundException ne){
		return new ResponseEntity<String>("There is no such endpoint",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<String> NotValidExceptionHandler(MethodArgumentNotValidException ne){
		return new ResponseEntity<String>(ne.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> GeneralExceptionHandler(Exception ne){
		return new ResponseEntity<String>(ne.getMessage(),HttpStatus.BAD_REQUEST);
	}
}

