package in.ni.service;

import java.util.List;

import in.nit.model.Uom;

public interface IUomService {
	public  Integer saveUom(Uom uob);
	public List<Uom> displayAllUoms();
	public void deleteUom(Integer id);

}
