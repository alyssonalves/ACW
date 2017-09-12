package br.com.uipe.entity;

import java.io.Serializable;

public class Estudante implements Serializable{

	private Long id;
	private String nome;
	
	
	public Estudante(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Estudante() {
	}
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public Estudante clone() {
		return new Estudante(id, nome);
	}
	
	public void restaurar(Estudante estudante) {
		this.id = estudante.getId();
		this.nome = estudante.getNome();
	}
	
}
