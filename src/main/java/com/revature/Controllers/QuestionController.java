package com.revature.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.Domains.Question;
import com.revature.Services.QuestionService;

@RestController
@RequestMapping("/question")
@CrossOrigin
public class QuestionController {
	
	@Autowired
	private QuestionService qs;
	
	@GetMapping("/{id}")
	public Question getQuestionById(@PathVariable("id")int id) {
		return qs.getQuestionById(id);
	}
	
}
