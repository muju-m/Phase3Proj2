package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackDao {
	@Autowired
	FeedbackRepo repo;
	public Feedback insert(Feedback f) {
		return repo.save(f);
	}

}
