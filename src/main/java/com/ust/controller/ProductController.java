package com.ust.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@GetMapping("/order")
	public String customerOrderDetails() {
		return "Order detail for customer";
	}
	
	@GetMapping("/orderPage")
	public String getOrderPage() {
		return "Order page";
	}

}
