package in.nit.dao;

import java.util.List;

import in.nit.model.OrderMethod;

public interface IOrderMethodDao {
	public  Integer saveOrderMethod(OrderMethod ob);
	public List<OrderMethod> getAllOrderMethods();
	public void deleteOrderMethod(Integer id);
	
		
	

}
