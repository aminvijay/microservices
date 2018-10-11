package com.vijay.microservices.productbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.microservices.productbook.pojo.ProductBook;
import com.vijay.microservices.productbook.services.ProductBookService;

@RestController
@RequestMapping("/microservice")
public class ProductBookController {
	
	//http://websystique.com/spring-security/spring-security-4-method-security-using-preauthorize-postauthorize-secured-el/
	
	@Autowired()
	@Qualifier("ProductBookService")
	private ProductBookService productBookService;
	
	@GetMapping(path = "/productsbook", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getAllProducts() {
		return new ResponseEntity<> ("Here are all products book", HttpStatus.OK);
	}
	
	

	@RequestMapping(value="/productbook/{productid}", method=RequestMethod.GET)
	@PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
	public ResponseEntity<ProductBook> getMessage(@PathVariable("productid") Long productid) {
		return new ResponseEntity<> (productBookService.findByProductid(productid), HttpStatus.OK);
	}

}
