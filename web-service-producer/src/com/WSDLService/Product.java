package com.WSDLService;

import java.io.FileNotFoundException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
// We can overwrite the default names by defining @webservice properties.
// targetname space default one is reversing the package and shows as targetNameSpace URL.
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.naming.NoPermissionException;

import com.domain.Book;
import com.serviceImpl.ProductServiceImpl;
@WebService(endpointInterface = "com.WSDLService.ProductInterface", name="GlobalProduct", portName="GlobalProductPort", targetNamespace = "http://suresh.com/global")
public class Product implements ProductInterface 
{
	
	ProductServiceImpl productService = new ProductServiceImpl();
	// wsgen command to generate wsdl or eclipse
	// webmethod annotaiton is optional. every public method default taken as operation.
   /* (non-Javadoc)
 * @see com.WSDLService.ProductInterface#getProducts(com.domain.Book)
 */
@Override
   public List<String> getProducts(Book book) {
	   return productService.getProducts();
   }
   
   /* (non-Javadoc)
 * @see com.WSDLService.ProductInterface#getBooks(java.lang.String, java.lang.String)
 */
@Override
public List<Book> getBooks(String book1, String book2) throws Exception{
	List<Book> result = null;
	   try{
		   result = productService.getBooks();
		   if(result == null){
			   throw new FileNotFoundException();
		   }
		  }catch(Exception ex){
			  ex.printStackTrace();
		  }
	   return result;
		   
	   }
   
}
