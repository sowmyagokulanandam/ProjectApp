package in.nit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.ni.service.IDocumentService;
import in.nit.dao.IDocumentDao;
import in.nit.model.Document;
@Service
public class DocumentServiceImpl implements IDocumentService {
	@Autowired
	private IDocumentDao dao;

	@Override
	@Transactional
	public Integer saveDocument(Document doc) {
		// TODO Auto-generated method stub
		return dao.saveDocument(doc);
	}
	@Override
	@Transactional(readOnly = true)
	public List<Object[]> getFileIdAndFileName() {
		// TODO Auto-generated method stub
		return dao.getFileIdAndFileName();
	}
	@Override
	public Document getOneDocument(Integer id) {
		// TODO Auto-generated method stub
		return dao.getOneDocument(id);
	}

}
