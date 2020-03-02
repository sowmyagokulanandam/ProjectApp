package in.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.ni.service.IWhUserTypeService;
import in.nit.model.WhUserType;

@Controller
@RequestMapping("/wht")
public class WhUserTypeController {
	@Autowired
	IWhUserTypeService service;
	@RequestMapping("/create")
	public String showRegisterPage(){
		return "whUserRegisterPage";
		
	}
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public String saveWhUser(@ModelAttribute WhUserType type,Model model) {
		Integer id=service.saveWhUser(type);
		String message="user '"+id+"' saved";
		model.addAttribute("message",message);
		return "whUserRegisterPage"; 
		
	}

}
