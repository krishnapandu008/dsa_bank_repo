package com.example.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product") // optional
public class ProductController {
	@GetMapping("/all") // or we can give with out path also default it will take path as /
	public ResponseEntity<String> getAllProducts()
	{
		ResponseEntity<String> responseEntity = new ResponseEntity<String>("From All", HttpStatus.OK);// 200-OK success
		
		return responseEntity;
	}

	@PostMapping("/save")
	public ResponseEntity<String> saveProducts()
	{
		ResponseEntity<String> responseEntity = new ResponseEntity<String>("From Save", HttpStatus.CREATED);// 201-created (success+something created)
		return responseEntity;
	}
	
	@RequestMapping(value = "modify", method = RequestMethod.PUT)
	//@PutMapping("/modify")
	public ResponseEntity<String> modifyProducts()
	{
		ResponseEntity<String> responseEntity = 
				//new ResponseEntity<String>("From Modify", HttpStatus.RESET_CONTENT);// 201-created (success+something created)  // here response will be record number
		        new ResponseEntity<String>("From Modify", HttpStatus.OK);// 200-created (something created)  // here response will be From Modify
		return responseEntity;
	}
	
	@DeleteMapping("/remove")
	public ResponseEntity<String> removeProducts()
	{
		ResponseEntity<String> responseEntity = new ResponseEntity<String>("From Remove", HttpStatus.OK);// 201-created (success+something created)
		return responseEntity;
	}
	@DeleteMapping("/removeAll")
	public ResponseEntity<String> removeProductsAll()
	{
		ResponseEntity<String> responseEntity = new ResponseEntity<String>("From Remove", HttpStatus.OK);// 201-created (success+something created)
		return responseEntity;
	}
}
