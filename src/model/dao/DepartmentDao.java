package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);//Irá buscar um ID no banco de dados e se encontrar retorna o valor, caso contrário retorna nulo
	List<Department> findAll();
}
