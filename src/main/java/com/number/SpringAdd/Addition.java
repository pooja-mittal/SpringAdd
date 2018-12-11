package com.number.SpringAdd;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Addition {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int num1, @RequestParam("t2") int num2, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("inside addition method");
//		int num1=Integer.parseInt(request.getParameter("t1"));
//		int num2=Integer.parseInt(request.getParameter("t2"));
		int sum=num1+num2;
		ModelAndView mv=new ModelAndView();
		mv.setViewName("success");
		mv.addObject("result", sum);
		return mv;
	}

}
