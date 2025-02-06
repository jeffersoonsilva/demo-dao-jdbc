package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("=== TEST 1: seller findById ====");
		
		SellerDao sellerDao = DaoFactory.createSellerrDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
	}
}