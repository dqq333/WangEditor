package service.impl;

import dao.ProductDao;
import dao.impl.ProductDaoImpl;
import entity.Product;
import service.ProductService;

public class ProductServiceImpl implements ProductService {
	ProductDao prod=new ProductDaoImpl();
	@Override
	public boolean addpro(Product pro) {
		int result=prod.find(pro);
		if(result>0) {
			return true;
		}
		return false;
	}

}
