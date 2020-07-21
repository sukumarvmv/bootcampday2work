package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 

public class CalculatorService {

	@GetMapping("/hello")
	public String sayHello() {
		return "HelloWold";
		
	}
		
	@GetMapping("/sum")
	public int sum() {
		return 20;
		
	}
	
	@GetMapping("/mul")
	public int multip() {
		return 30;
		
	}
	
	@GetMapping("/diff")
	public int diff() {
		return 40;
		
	}

	@GetMapping("/div")
	public int div() {
		return 50;
		
	}
	

}
