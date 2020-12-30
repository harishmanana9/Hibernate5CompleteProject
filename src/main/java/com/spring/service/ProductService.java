package com.spring.service;

import java.util.List;

import com.spring.entity.Product;

public interface ProductService {
	public boolean saveProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(Integer productNo);
	public List<Product> getAllProducts();
	public Product getProductByNo(Integer productNo);

}
