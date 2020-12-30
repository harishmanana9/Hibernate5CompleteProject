package com.spring.service;

import java.util.List;

import com.spring.dao.ProductDao;
import com.spring.dao.ProductDaoImpl;
import com.spring.entity.Product;

public class ProductServiceImpl implements ProductService{

	private static ProductDao productDao = new ProductDaoImpl();
	
	@Override
	public boolean saveProduct(Product product) {
		return productDao.saveProduct(product);
	}

	@Override
	public boolean updateProduct(Product product) {
		return productDao.updateProduct(product);
	}

	@Override
	public boolean deleteProduct(Integer productNo) {
		return productDao.deleteProduct(productNo);
	}

	@Override
	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}

	@Override
	public Product getProductByNo(Integer productNo) {
		return productDao.getProductByNo(productNo);
	}
}
