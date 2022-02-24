package com.product.demo.repository;

import java.util.List;

import com.product.demo.model.Product;

public interface ProductRepository {

	public Product create(Product product);
	public Product find(Long id);
	public List<Product>list();
	public Product update(Product product);
	public void delete(Long productId);
	
}
