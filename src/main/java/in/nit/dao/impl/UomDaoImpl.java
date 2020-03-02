package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IUomDao;
import in.nit.model.Uom;
@Repository
public class UomDaoImpl implements IUomDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveUom(Uom uob) {
		// TODO Auto-generated method stub
		return (Integer) ht.save(uob);
		 
	}

	@Override
	public List<Uom> displayAllUoms() {
		// TODO Auto-generated method stub
		return ht.loadAll(Uom.class);
		 
	}

	@Override
	public void deleteUom(Integer id) {
		// TODO Auto-generated method stub
		Uom uob=new Uom();
		uob.setUomId(id);
		ht.delete(uob);
		
	}

}
