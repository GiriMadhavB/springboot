package com.product.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.demo.model.Product;
import com.product.demo.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository pro_repository;
	
	
	public Product addNewProduct(Product product) {
		
		return pro_repository.create(product);
	}
	
	public Product searchEmployee(Long productId) {
		
		return pro_repository.find(productId);
	}
	
	public List<Product> listallProducts(){
		
		return pro_repository.list();
	}
	
	public Product updateProduct(Product product) {
		
		return pro_repository.update(product);
	}
	
	public void deleteProduct(Long productId) {
		
		pro_repository.delete(productId);
	}
}
