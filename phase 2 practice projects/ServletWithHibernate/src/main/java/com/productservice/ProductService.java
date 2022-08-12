package com.productservice;

import java.util.Iterator;
import java.util.List;


import com.bean.Products;
import com.dao.ProductsDao;

public class ProductService {
ProductsDao pd = new ProductsDao();
	
	public String storeProduct(Products product) {	
		
 			if(pd.storeProduct(product)>0) {

			return "Product stored successfully";
			
		}else {
			return "Product didn't store id must be unique";
		}
	}


}
