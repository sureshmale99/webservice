package com.WSDLService;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.domain.Book;
@WebService//(name="GlobalProduct", portName="GlobalProductPort", targetNamespace = "http://suresh.com/global")
//@SOAPBinding(style=Style.RPC, use=Use.LITERAL)
public interface ProductInterface {

	// wsgen command to generate wsdl or eclipse
	// webmethod annotaiton is optional. every public method default taken as operation.
	@WebMethod//(action="fetchProducts", operationName="loadProducts")
	List<String> getProducts(Book book);

	//   @WebMethod(exclude = true)
	List<Book> getBooks(String book1, String book2);

}