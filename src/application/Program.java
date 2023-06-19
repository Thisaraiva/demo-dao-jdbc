package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		//Department obj = new Department(1, "Books"); 		
		
		//colocado o new date apenas para facilitar a data de aniversário, para não precisar criar e instanciar uma nova data.
		//Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(3); //3 é o ID do funcionário que queremos buscar
		 
		System.out.println(seller);

	}

}
