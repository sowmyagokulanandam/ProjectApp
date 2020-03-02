package in.nit.controller;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.ni.service.IShipmentTypeService;
import in.nit.model.ShipmentType;
import in.nit.util.ShipmentTypeUtil;
import in.nit.view.ShipmentTypeExcelView;

@Controller
@RequestMapping("/shipment")
public class ShipmentTypeController {
	@Autowired
	private IShipmentTypeService service;
	@Autowired
	ServletContext context=null;
	@Autowired
	private ShipmentTypeUtil util; 
	@RequestMapping(value="/register")
	public String showregPage(Model model) {
		System.out.println("ShipmentTypeController.showregPage()");
		model.addAttribute("shipmentType", new ShipmentType());
		return "shipmentTyperegister";
		
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveShipmentType(@ModelAttribute ShipmentType shipmentType,Model model) {
		Integer id=service.saveShipmentType(shipmentType);
		String message="shipmenttype '"+id+"' saved";
		model.addAttribute("message",message);
		model.addAttribute("shipmentType",new ShipmentType());
		return "shipmentTyperegister";
	}
	@RequestMapping("/all")
	public String getAllShipmentTypes(Model model) {
		List<ShipmentType> list=service.getAllShipmentTypes();
		model.addAttribute("list",list);
		return "shipmentTypeData";
	}
	@RequestMapping("/delete")
	public String deleteShipment(@RequestParam("sid")Integer id,Model model) {
		service.deleteShipmentType(id);
		String message="shipmentType '"+id+"' deleted";
		model.addAttribute("message",message);
		List<ShipmentType> list=service.getAllShipmentTypes();
		model.addAttribute("list",list);
		return "shipmentTypeData";
			
		}
	@RequestMapping("/edit")
	public String showEditPage(@RequestParam("sid")Integer id,Model model) {
		service.getOneShipmetType(id);
		ShipmentType st=service.getOneShipmetType(id);
		model.addAttribute("shipmentType", st);
		
		return "shipmentTypeEdit";
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String updateShipmentType(@ModelAttribute ShipmentType shipmentType,Model model) {
		service.updateShipmetType(shipmentType);
		String message="shipmentType '"+shipmentType.getShipId()+"' updated";
		
		model.addAttribute("message", message);
		List<ShipmentType> list=service.getAllShipmentTypes();
		model.addAttribute("list", list);
		
		return "shipmentTypeData";
	}
		
		
	@RequestMapping("/view")
	public String showOneShipment(@RequestParam("sid")Integer id,Model model) {
		ShipmentType st=service.getOneShipmetType(id);
		model.addAttribute("ob",st);
		return "shipmentTypeView";
		
	}
	@RequestMapping("/excel")
	public ModelAndView showExcel() {
		ModelAndView m=new ModelAndView();
		m.setView(new ShipmentTypeExcelView());
		//fetching data from db
		List<ShipmentType> list=service.getAllShipmentTypes();
		m.addObject("list", list);
		return m;
		
	}
	@RequestMapping("/charts")
	public String showCharts() {
		List<Object[]> list=service.getShipmentModeCount();
		String path=context.getRealPath("/");
		util.generatePie(path, list);
		return "shipmenttypecharts";
		
	}
	

	
}

