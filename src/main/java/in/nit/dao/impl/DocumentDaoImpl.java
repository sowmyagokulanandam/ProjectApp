package in.nit.dao.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IDocumentDao;
import in.nit.model.Document;
@Repository

public class DocumentDaoImpl implements IDocumentDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveDocument(Document doc) {
		// TODO Auto-generated method stub
		return (Integer) ht.save(doc);
	}
	@Override
	public List<Object[]> getFileIdAndFileName() {
		// TODO Auto-generated method stub
		String hql="select fileId,fileName from in.nit.model.Document";
		
		return (List<Object[]>) ht.find(hql);
	}
@Override
public Document getOneDocument(Integer id) {
	// TODO Auto-generated method stub
	return ht.get(Document.class, id);
}
}
