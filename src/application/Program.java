package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books"); 		
		
		//colocado o new date apenas para facilitar a data de aniversário, para não precisar criar e instanciar uma nova data.
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, obj);
		
		System.out.println(seller);

	}

}
