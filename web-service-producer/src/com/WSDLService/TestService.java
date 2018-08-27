package com.WSDLService;

import javax.xml.ws.Endpoint;

public class TestService {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1234/Product", new Product());
	}
}
