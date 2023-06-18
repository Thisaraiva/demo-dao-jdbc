package db;

public class DbIntegrityException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	//classe persnalizada de exceção para uma possível excecão em caso de deleção de um departamento que tenha vendedores cadastrados.
	public DbIntegrityException(String msg) {
		super(msg);
	}

}
