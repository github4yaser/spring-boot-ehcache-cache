package com.cloudstudio.spring.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.cloudstudio.spring.service.ProductService;


@Component
@EnableScheduling
public class TestJob {
	
	@Autowired
	private ProductService productService;
	
	@Scheduled(initialDelay = 6000,fixedDelay = 6000000)
	public void run() {
		
		productService.getProductInfo("laptop");
		productService.getProductInfo("laptop");
		productService.getProductInfo("mobile");
		
		System.out.println("Refreshing all products");
		productService.refreshAllProducts();

		System.out.println("Laptop [after refresh]->" + productService.getProductInfo("laptop"));
		System.out.println("Laptop [after refresh]->" + productService.getProductInfo("laptop"));
		System.out.println("Laptop [after refresh]->" + productService.getProductInfo("laptop"));
		
		System.out.println("Laptop [after refresh]->" + productService.getProductInfo("mobile"));
		
	}
}