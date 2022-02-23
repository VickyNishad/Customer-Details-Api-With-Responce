package com.customer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.entities.CustGuId;
import com.customer.entities.Response;
import com.customer.service.CustomerService;

@RestController
public class MyController {

//	@Autowired
//	private Customerdao customerdao;
	
	@Autowired
	private CustomerService customerService;
	

	@PostMapping("/customer")
	public Response getObject(@RequestBody CustGuId custId)
	{
		return this.customerService.getCustomerDetails(custId.getCustGuId());
	}
}
