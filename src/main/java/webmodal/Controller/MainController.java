package webmodal.Controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import webmodal.Service.UserService;

@Controller
public class MainController {
	@Resource
	private UserService userService;
	
	@RequestMapping(value="/getuser", method=RequestMethod.GET)
	public void getUserName(HttpServletRequest req, HttpServletResponse res){
		
	}

	@RequestMapping(value="/")
	public ModelAndView mainpage(HttpServletRequest req){
		ModelAndView mv = new ModelAndView("mainpage");
		ArrayList<String> names = new ArrayList<String>();
		names.add("Jack");
		names.add("Bob");
		mv.addObject("names", names);
		return mv;
	}
}
