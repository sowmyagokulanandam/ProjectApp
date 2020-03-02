package in.nit.dao;

import java.util.List;

import in.nit.model.Uom;

public interface IUomDao {
	public  Integer saveUom(Uom uob);
	public List<Uom> displayAllUoms();
	public void deleteUom(Integer id);
	
	

}
