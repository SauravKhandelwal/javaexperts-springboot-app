/**
 * 
 */
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Customer;
import com.example.demo.dto.CustomerResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Saurav_Khandelwal
 *
 */
@RestController
@RequestMapping("/register")
public class RegistrationController {
	
	@Value("${server.port}")
	private String portNumber;

	
	
	@GetMapping("/hello")
	public String hello()   
	{
		System.out.println("Hello() starts");
		System.out.println("Hello() Ends");
	return "Hello Every One morning batch";  
	}
	
	
	@PostMapping("/registercustomer")
	public CustomerResponse registration(@RequestBody Customer customer) {
		System.out.println("Customer data received:"+customer);
		CustomerResponse customerResponse=new CustomerResponse();
		customerResponse.setAddress(customer.getAddress());
		customerResponse.setAge(customer.getAge());
		customerResponse.setName(customer.getName());
		customerResponse.setPhone(customer.getPhone());
		customerResponse.setMessage("Registration Sucess");
		return customerResponse;
	}
	
	public void method() {
		
	}
}
