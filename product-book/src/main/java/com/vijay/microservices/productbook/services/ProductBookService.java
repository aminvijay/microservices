package com.vijay.microservices.productbook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijay.microservices.productbook.db.repository.ProductBookRepository;
import com.vijay.microservices.productbook.pojo.ProductBook;

@Service("ProductBookService")
public class ProductBookService {
	
	//@Autowired
	//private ProductBookRepository productBookRepository;
	
	public ProductBook findByProductid(Long productid) {
		
		//ProductBook productBook = productBookRepository.findByProductid(productid);
	
		//return productBook;
		ProductBook productBook = new ProductBook();
		productBook.setBookingid(new Long(1));
		productBook.setProductid(new Long(1));		
		productBook.setDeliveryaddress("Peacock Ct");
		productBook.setCount(new Long(5));
		
		return productBook;
	}

}
