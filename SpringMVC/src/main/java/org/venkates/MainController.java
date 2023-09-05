package org.venkates;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String welocme() {
		return "hello";
	}
	
	@GetMapping("displayname")
	public ModelAndView displayName(@RequestParam("firstName") String firstName) {
		ModelAndView modelView = new ModelAndView("displayName");
		List<String> teamNames=new ArrayList<String>();
		teamNames.add("Venkates");
		teamNames.add("Sachin");
		teamNames.add("Virat");
		teamNames.add("Christopher Nolan");
		
		Date date =new Date();
		modelView.addObject("name",firstName);
		modelView.addObject("date", date);
		modelView.addObject("team",teamNames);
  		return modelView;
	}
	
	//Using Model and View Class
	/*
	 * @RequestMapping("displayname") public ModelAndView
	 * displayName(@RequestParam("firstName") String firstName) { ModelAndView
	 * modelView = new ModelAndView("displayName");
	 * 
	 * modelView.addObject("name",firstName); return modelView; }
	 */
	
	//Using Spring Features
	//@RequestMapping("displayname")
	//public String displayName(@RequestParam("firstName") String firstName,Model model) {
	//	model.addAttribute("name",firstName);
  //		return "displayName";
	//}
	
	/*Using HttpServletRequest as a Method Parameter
	 * 
	 * @RequestMapping("displayname") public String displayName(HttpServletRequest
	 * request){ String firstName=request.getParameter("firstName");
	 * request.setAttribute("firstName", firstName); return "displayName"; }
	 */
}