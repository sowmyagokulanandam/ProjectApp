package in.nit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import in.ni.service.IUomService;
import in.nit.dao.IUomDao;
import in.nit.model.Uom;
@Service
public class UmoServiceImpl implements IUomService {
	@Autowired
	private IUomDao dao;

	@Override
	@Transactional
	
 public Integer saveUom(Uom uob) {
		// TODO Auto-generated method stub
		return dao.saveUom(uob);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Uom> displayAllUoms() {
		// TODO Auto-generated method stub
		List<Uom> list= dao.displayAllUoms();
		return list;
	}

	@Override
	@Transactional
	public void deleteUom(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteUom(id);
		
		
	}

}
