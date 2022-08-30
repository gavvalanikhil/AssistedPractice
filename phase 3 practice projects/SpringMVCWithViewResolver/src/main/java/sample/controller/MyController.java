package sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping(value="hello",method= RequestMethod.GET)
	public String sayHello() {
		System.out.println("I came here");
		
		return "display";
	}
	
	
	@RequestMapping(value = "hi",method = RequestMethod.GET)
	public String sayHi(Model mm) {				// DI for Model API 
		
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("msg", "Akash");
//		return mav;
		
    	mm.addAttribute("msg", "Nikhil");			// request.setAttribute("msg","Akash");
		System.out.println("I Came Here");
		
		return "info";
	}
	
	
	@RequestMapping(value = "bye",method = RequestMethod.GET)
	public ModelAndView sayBye(Model mm) {			
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Akash");
		return mav;
	}


}

