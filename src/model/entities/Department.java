package model.entities;

import java.io.Serializable;
import java.util.Objects;

//implementação da função Serializable para que nossos objetos poderem ser transformados em sequencia de Bytes, em java precisamos gravar em serie para que 
//nossos dados sejam gravados em arquivos, trafegados em rede e assim por diante.
public class Department implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	
	public Department() {		
	}

	public Department(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//criação do HashCode e Equals somente pelo ID para ficar mais simples
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}	
}
