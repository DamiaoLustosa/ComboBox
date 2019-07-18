package model.entities;

import java.io.Serializable;

public class Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer Id;
	private String nome;
	
	public Pessoa() {
		
	}

	public Pessoa(Integer id, String nome) {
		Id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [Id=" + Id + ", nome=" + nome + "]";
	}
	
	
	
	

}
