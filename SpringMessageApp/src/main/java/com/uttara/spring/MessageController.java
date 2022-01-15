package com.uttara.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageController {

	@Autowired
	MsgService service;
	
	public MessageController() {
		System.out.println("in MC no-arg constr");
	}
	@RequestMapping({"/", "/home"})
	public String showHome() {
		System.out.println("in MC->showHome()");
		return "Home";
	}
	
	@RequestMapping("/showJoke")
	public String showJoke(Model model) {
		
		//get joke from service
		String joke = service.getJoke();
		model.addAttribute("joke", joke);
		return "DisplayJoke";
	}
	
	@RequestMapping("/openRegisterView")
	public String openRegisterView() {
		
		return "Register";
	}
}









