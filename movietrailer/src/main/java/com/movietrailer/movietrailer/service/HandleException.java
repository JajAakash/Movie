package com.movietrailer.movietrailer.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandleException {
	@ExceptionHandler(value = MovieNotFoundException.class)
	   public ResponseEntity<Object> exception(MovieNotFoundException exception) {
	      return new ResponseEntity<>("SORRY !! Movie not found", HttpStatus.NOT_FOUND);
	   }
}
