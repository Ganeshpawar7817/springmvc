package springmvc.controller;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class FetchDataFF {
	
	@RequestMapping("/form")
	public String form() {
		return "Form";
	}
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public void printData(HttpServletRequest request) {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		int age=Integer.parseInt(request.getParameter("age"));
		String gender=request.getParameter("gender");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(password);
		System.out.println(age);
		System.out.println(gender);
	}
	
	@RequestMapping(path = "processform2",method = RequestMethod.POST)
	public String printData2(
			@RequestParam String name,
			@RequestParam String email,
			@RequestParam String password,
			@RequestParam String gender,
			@RequestParam int age,
			Model model) {
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(password);
		System.out.println(age);
		System.out.println(gender);
		System.out.println("Invoked 2 method");
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		model.addAttribute("password", password);
		model.addAttribute("age", age);
		model.addAttribute("gender", gender);
		
		return "data";
	}
	@RequestMapping("processform3")
	public String printData3(@ModelAttribute User user,Model model) {
		
		return "data";
		
	}

}
