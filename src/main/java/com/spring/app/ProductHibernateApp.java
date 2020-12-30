package com.spring.app;

import java.util.List;

import com.spring.entity.Product;
import com.spring.service.ProductService;
import com.spring.service.ProductServiceImpl;

public class ProductHibernateApp {

	private static ProductService productService = new ProductServiceImpl();
	
	public static void main(String[] args) {
		Product p1 = new Product("Television", "Electronics", 10000);
		Product p2 = new Product("Oven", "Electronics", 1000);
		
		productService.saveProduct(p1);
		productService.saveProduct(p2);
		
		p1.setPrice(15000);
		if(productService.updateProduct(p1)) {
			System.out.println("Product Update successfully");
		} else {
			System.out.println("Product not updated");
		}
		
		List<Product> allProducts = productService.getAllProducts();
		allProducts.stream().forEach(System.out::println);
		System.out.println("-----------------------------------------");
		System.out.println("Product Details - " + productService.getProductByNo(1));
	}

}
