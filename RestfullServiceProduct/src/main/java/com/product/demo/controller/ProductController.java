package com.product.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.demo.model.Product;
import com.product.demo.service.ProductService;

@RestController
public class ProductController {

  @Autowired	
  ProductService pro_service;
	
  @PostMapping("/prouduct")
  public Product addProduct(@RequestBody Product product) {
	  
	  return pro_service.addNewProduct(product);
  }
  
  @GetMapping("/product")
  public List<Product> dispalyProdutcs(){
	  
	  return pro_service.listallProducts();
  }
  
  @GetMapping("product/{productId}")
  public Product seachProduct(@PathVariable Long productId) {
	  
	  return pro_service.searchEmployee(productId);
	  
  }
  
  @DeleteMapping("product/{productId}")
  public void deleteProduct(@PathVariable Long productId) {
	  
	  pro_service.deleteProduct(productId);
  }
  
  @PutMapping("/product")
  public Product updatedProduct(Product product) {
	  
	  return pro_service.updateProduct(product);
  }
  
}
