package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IShipmentTypeDao;
import in.nit.model.ShipmentType;
@Repository
public class ShipmentTypeDaoImpl implements IShipmentTypeDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveShipmentType(ShipmentType ob) {
		// TODO Auto-generated method stub
		return (Integer) ht.save(ob);
	}

	@Override
	public List<ShipmentType> getAllShipmentTypes() {
		// TODO Auto-generated method stub
		return ht.loadAll(ShipmentType.class);
		
	}

	@Override
	public void deleteShipmentType(Integer id) {
	    ShipmentType s=new ShipmentType();
	   s.setShipId(id);
	   
	   ht.delete(s);
		
	}

	@Override
	public ShipmentType getOneShipmetType(Integer id) {
		// TODO Auto-generated method stub
		return ht.get(ShipmentType.class, id);
	}

	@Override
	public void updateShipmetType(ShipmentType ob) {
		// TODO Auto-generated method stub
		ht.update(ob);
		
	}
	@Override
	public List<Object[]> getShipmentModeCount() {
		// TODO Auto-generated method stub
		String hql="select shipMode,count(shipMode) "+" from  in.nit.model.ShipmentType  "     + " group by shipMode "; 
		return (List<Object[]>) ht.find(hql);
	}
}