package br.com.uipe.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_estudante")
public class Estudante implements Serializable{

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="cpf")
	private String cpf;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="dataNascimento")
	private String dataNascimento;
	
	@Column(name="telefone")
	private String telefone;
	
	public Estudante(String cpf, String nome, String dataNascimento, String telefone) {
		this.cpf = cpf;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
	}
	
	public Estudante() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public Estudante clone() {
		return new Estudante(cpf, nome, dataNascimento, telefone);
	}
	
	public void restaurar(Estudante estudante) {
		this.id = estudante.getId();
		this.nome = estudante.getNome();
		this.dataNascimento = estudante.getDataNascimento();
		this.telefone = estudante.getTelefone();
	}
	
}
