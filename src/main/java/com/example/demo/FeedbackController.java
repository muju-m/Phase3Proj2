package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FeedbackController {
	@Autowired
	FeedbackDao dao;
	@RequestMapping("/insert")
	public ModelAndView insert(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		Feedback f = new Feedback();
		f.setName(request.getParameter("name"));
		f.setEmail(request.getParameter("email"));
		f.setFeedback(request.getParameter("feedback"));
		Feedback ep = dao.insert(f);
		if(ep != null) {
			mv.setViewName("display.jsp");
		}
		return mv;
	}

}
