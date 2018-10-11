package com.vijay.microservices.productsearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.microservices.productsearch.pojo.Product;
import com.vijay.microservices.productsearch.services.ProductsService;

@RestController
@RequestMapping("/microservice")
public class ProductSearchController {
	
	@Autowired()
	@Qualifier("ProductsService")
	private ProductsService productsService;
	
	@GetMapping(path = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getAllProducts() {
		return new ResponseEntity<> ("Here are all products", HttpStatus.OK);
	}
	
	

	@RequestMapping(value="/products/{productname}", method=RequestMethod.GET)
	//@PreAuthorize("hasAuthority('STANDARD_USER')")
	public ResponseEntity<Product> getMessage(@PathVariable("productname") String productname) {
		return new ResponseEntity<> (productsService.findByProductname(productname), HttpStatus.OK);
	}

}
