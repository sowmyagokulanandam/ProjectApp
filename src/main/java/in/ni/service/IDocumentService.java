package in.ni.service;

import java.util.List;

import in.nit.model.Document;

public interface IDocumentService {
	public Integer saveDocument(Document doc);
	public List<Object[]> getFileIdAndFileName();
	public Document getOneDocument(Integer id);



}
