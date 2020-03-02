package in.nit.dao;

import java.util.List;

import in.nit.model.Document;

public interface IDocumentDao {
	public Integer saveDocument(Document doc);
	public List<Object[]> getFileIdAndFileName();
	public Document getOneDocument(Integer id);

}
