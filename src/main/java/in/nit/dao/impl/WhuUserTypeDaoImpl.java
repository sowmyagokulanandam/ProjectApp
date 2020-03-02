package in.nit.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IWhUserTypeDao;
import in.nit.model.WhUserType;
@Repository
public class WhuUserTypeDaoImpl implements IWhUserTypeDao {
@Autowired	
private HibernateTemplate ht;
	@Override
	public Integer saveWhUser(WhUserType ob) {
		// TODO Auto-generated method stub
		return (Integer) ht.save(ob);
	}

}
