package in.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import in.nit.model.OrderMethod;
@Controller
@RequestMapping("/om")
public class OrderMethodController {
	@RequestMapping("/show")
	public String showRegisterPage(Model model) {
		model.addAttribute("orderMethod", new OrderMethod() );
		return "ordermethodregister";
		
	}
	
}
