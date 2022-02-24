package com.product.demo.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.product.demo.model.Product;

@Repository
public class InMemoryProductRepository implements ProductRepository {

	HashMap<Long,Product>products=new HashMap();
	private long currentId=1;
	
	
	
	@Override
	public Product create(Product product) {
		// TODO Auto-generated method stub
		long id=currentId++;
		product.setProductId(id);
		products.put(id, product);
		
		return product;
	}

	@Override
	public Product find(Long productId) {
		// TODO Auto-generated method stub
		return products.get(productId);
	}

	@Override
	public List<Product> list() {
		// TODO Auto-generated method stub
		return new ArrayList<Product>(products.values());
	}

	@Override
	public Product update(Product product) {
		// TODO Auto-generated method stub
		Product updatedProduct=new Product();
		updatedProduct.setProductId(product.getProductId());
		updatedProduct.setProductName(product.getProductName());
		updatedProduct.setProductBrand(product.getProductBrand());
		
		products.replace(product.getProductId(), updatedProduct);
		return updatedProduct;
	}

	@Override
	public void delete(Long productId) {
	     
		products.remove(productId);
		
	}
	
}
