package com.example.serve;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	
	@GetMapping("getBalance")
	String getBalance() {
		logger.info("inside getBalance");
		return "zero balance";
	}
	
	
}
	
