package application;

import java.util.List;

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
		
		System.out.println("=== TEST 2: seller findByDerpartment ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		 for(Seller obj: list) {
			 System.out.println(obj);
		 }
		 
		 System.out.println("=== TEST 3: seller findAll ====");
		 list = sellerDao.findALL();
			 for(Seller obj: list) {
				 System.out.println(obj);
			 }
	}
}