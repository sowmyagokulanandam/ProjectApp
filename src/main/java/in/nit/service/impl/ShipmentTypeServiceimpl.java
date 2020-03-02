package in.nit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.ni.service.IShipmentTypeService;
import in.nit.dao.IShipmentTypeDao;
import in.nit.model.ShipmentType;

@Service
public class ShipmentTypeServiceimpl implements IShipmentTypeService {
	@Autowired
	private IShipmentTypeDao dao;
@Transactional
	@Override
	public Integer saveShipmentType(ShipmentType ob) {
		// TODO Auto-generated method stub
		
		
		return dao.saveShipmentType(ob);
	}
@Override
@Transactional(readOnly =true)
public List<ShipmentType> getAllShipmentTypes() {
	// TODO Auto-generated method stub
	List<ShipmentType> list=dao.getAllShipmentTypes();
	return list;
}
@Override
@Transactional
public void deleteShipmentType(Integer id) {
	// TODO Auto-generated method stub
	dao.deleteShipmentType(id);
	
}
@Override
@Transactional(readOnly = true)
public ShipmentType getOneShipmetType(Integer id) {
	// TODO Auto-generated method stub
	return dao.getOneShipmetType(id);
}
@Override
@Transactional
public void updateShipmetType(ShipmentType ob) {
	// TODO Auto-generated method stub
	dao.updateShipmetType(ob);
	
	
}
@Override
public List<Object[]> getShipmentModeCount() {
	// TODO Auto-generated method stub
	return dao.getShipmentModeCount();
}

}
