package com.vijay.microservices.productsearch.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijay.microservices.productsearch.db.repository.ProductRepository;
import com.vijay.microservices.productsearch.pojo.Product;

@Service("ProductsService")
public class ProductsService {
	
	//@Autowired
	//private ProductRepository productsRepository;
	
	public Product findByProductname(String productname) {
		
		//Product product = productsRepository.findByProductname(productname);
	
		//return product;
		Product product = new Product();
		product.setId(new Long(1));
		product.setProductname("apple");
		product.setDescription("California Apple");
		return product;
	}

}
