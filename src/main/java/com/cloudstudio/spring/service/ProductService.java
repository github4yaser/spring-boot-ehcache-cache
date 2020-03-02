package com.cloudstudio.spring.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.cloudstudio.spring.dto.ProductInfo;

@Component
public class ProductService {

@Cacheable("products")
public ProductInfo getProductInfo(String name)	{
	
	System.out.println("inside getProductInfo method for "+name);
	
	ProductInfo product=new ProductInfo(100,"laptop");
	
	return product;
}


@CacheEvict(value = "products", allEntries = true)
public void refreshAllProducts()
{
	/*
	 * This method will remove all 'products' from cache, say as a result of flush API.
	 */
}






}
