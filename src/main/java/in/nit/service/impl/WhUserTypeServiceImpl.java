package in.nit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.ni.service.IWhUserTypeService;
import in.nit.dao.IWhUserTypeDao;
import in.nit.model.WhUserType;
@Service
public class WhUserTypeServiceImpl implements IWhUserTypeService {
	@Autowired
	private IWhUserTypeDao dao;

	@Override
	@Transactional
	public Integer saveWhUser(WhUserType ob) {
		// TODO Auto-generated method stub
		return dao.saveWhUser(ob);
	}

}
