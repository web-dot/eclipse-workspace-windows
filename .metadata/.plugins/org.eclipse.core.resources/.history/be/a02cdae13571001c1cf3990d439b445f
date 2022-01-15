package com.springmvc.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	public HomeController() {
		System.out.println("in HC no-rgs constructor");
	}
	
	@RequestMapping("/")
	public ModelAndView showHome(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("in HC-> showHome()");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/openInputView")
	public String showInputView() {
		
		System.out.println("in HC->showInputView()");
		return "input";
	}
	
}
