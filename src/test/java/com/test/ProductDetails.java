package com.test;

import org.testng.annotations.Test;


import com.pages.ProductsPage;

public class ProductDetails {

	@Test
    public void testProductDetails() {
	 
	 ProductsPage pp =new ProductsPage();
	  pp.getProductPrice();
	  pp.getProductColor();
 }
	
}
