package com.revature.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.Domains.Question;
import com.revature.Repositories.QuestionRepo;

@Service
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	private QuestionRepo qr;
	
	@Override
	public Question getQuestionById(int id) {
		return qr.findById(id).get();
	}

}
