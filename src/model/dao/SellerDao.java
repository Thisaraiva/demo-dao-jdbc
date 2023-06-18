package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);//Irá buscar um ID no banco de dados e se encontrar retorna o valor, caso contrário retorna nulo
	List<Seller> findAll();
}
