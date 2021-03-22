package com.book.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.Book;
import com.book.repository.BookRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.var;

@RestController
@RequestMapping("/api/v1")
public class BookController {
	
	@Autowired
	 BookRepository bookRepository;
	
	@ApiOperation("Insert a new book in Stack")
	@PostMapping("/addBook")
    public Book addBook(@RequestBody Book book) {
		
		bookRepository.save(book);
		return book;
    }
	
	//Pop Operation 
	@ApiOperation(value = "Delete the last added book from Stack")
	@DeleteMapping("/popBook")
	public ResponseEntity popBook()
	{
		Book index=bookRepository.findAll()
				.get(bookRepository.findAll()
						.size()-1);
		bookRepository.delete(index);
		return new ResponseEntity("Element popped out successfully",HttpStatus.OK);		
	}
}
