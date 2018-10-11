package com.vijay.microservices.productsearch.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vijay.microservices.productsearch.pojo.Product;

//@Repository
public interface ProductRepository extends CrudRepository <Product, Long>{

	Product findByProductname(String productname);
}
