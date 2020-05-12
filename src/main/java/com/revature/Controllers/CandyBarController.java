package com.revature.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(method = RequestMethod.OPTIONS)
	public ResponseEntity<HttpStatus> optionsRequest() {
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
}
