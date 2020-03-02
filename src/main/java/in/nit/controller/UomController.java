package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.ni.service.IUomService;
import in.nit.model.Uom;

@Controller
@RequestMapping("/uom")
public class UomController {
	@Autowired
	private IUomService service;
	@RequestMapping("/create")
public String createUom(Model model) {
		model.addAttribute("uom",new Uom());
		return "uomregisterpage";
	
}
	@RequestMapping(value="/save",method=RequestMethod.POST)
		public String saveUom(@ModelAttribute Uom uom,Model model)
		{
			Integer id=service.saveUom(uom);
			String message="uom '"+id+"'saved";
			model.addAttribute("message",message);
			model.addAttribute("uom",new Uom());
			return "uomregisterpage";
			
		}
	@RequestMapping("/all")
	public String displayAllUoms(Model model) {
		List<Uom> list=service.displayAllUoms();
		model.addAttribute("list", list);
		return "uomDataPage";
	}
	@RequestMapping("/delete")
	public String deleteUom(@RequestParam("uid")Integer id,Model model) {
		service.deleteUom(id);
		String message="uom '"+id+"' deleted";
		List<Uom> list=service.displayAllUoms();
		model.addAttribute("list", list);
		return "uomDataPage";
		
		
	}
}
