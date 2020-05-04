package com.revature.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.Domains.candyBar;

@Repository
public interface CandyBarRepo extends JpaRepository<candyBar, Integer>{

}
