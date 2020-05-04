package com.revature.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.Domains.candyBar;
import com.revature.Services.CandyBarService;

@RestController
@RequestMapping("/candy")
@CrossOrigin
public class CandyBarController {
	
	@Autowired
	private CandyBarService cbs;
	
	@GetMapping
	public candyBar getCandyBar() {
		return cbs.getCandyBar();
	}
	
}
