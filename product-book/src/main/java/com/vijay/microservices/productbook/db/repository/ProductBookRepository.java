package com.vijay.microservices.productbook.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vijay.microservices.productbook.pojo.ProductBook;

//@Repository
public interface ProductBookRepository extends CrudRepository <ProductBook, Long>{

	ProductBook findByProductid(Long productid);
}
