package com.revature.Services;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.Domains.candyBar;
import com.revature.Repositories.CandyBarRepo;

@Service
public class CandyBarServiceImpl implements CandyBarService {
	
	@Autowired
	private CandyBarRepo cbr;
	
	private Random rand = new Random();
	
	@Override
	public candyBar getCandyBar() {
		int id = rand.nextInt(253);
		return cbr.findById(id).get();
	}

}
