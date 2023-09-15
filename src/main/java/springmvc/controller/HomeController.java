package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		String message="This is a home page";
		model.addAttribute("message", message);
		return "Home";
	}

	@RequestMapping("/about")
	public String about(Model model) {
		System.out.println("This is about page");
		List<String> list=new ArrayList<String>();
		list.add("Ganesh");
		list.add("Pradeep");
		list.add("Manjunath");
		list.add("Omkar");
		model.addAttribute("names", list);
		
		return "About";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		String name="Ganesh Pawar";
		int rollNumber=12345;
		LocalDateTime dateTime=LocalDateTime.now();
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name",name);
		modelAndView.addObject("rollNumber",rollNumber);
		
		modelAndView.addObject("dateTime",dateTime);
		modelAndView.setViewName("help");
		return modelAndView;
	}
	
}
