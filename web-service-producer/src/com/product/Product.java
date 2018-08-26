package com.product;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService
public class Product 
{
	// wsgen command to generate wsdl or eclipse
   public List<String> getProducts() {
	   List<String> result = new ArrayList<String>();
	   result.add("Demo");
	   result.add("test");
	   return result;
   }
}
