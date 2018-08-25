package web_service.web_service_producer;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService
public class Product 
{
   public List<String> getProducts() {
	   List<String> result = new ArrayList<String>();
	   result.add("Demo");
	   result.add("test");
	   return result;
   }
}
