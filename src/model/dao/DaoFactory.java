package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerrDao() {
		return new SellerDaoJDBC();
	}
	
}