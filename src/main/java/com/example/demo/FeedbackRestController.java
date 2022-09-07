package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedbackRestController {
@Autowired
FeedbackDao dao;
@PostMapping("/insert")
public Feedback insert(@RequestBody Feedback f) {
	return dao.insert(f);
}
}
