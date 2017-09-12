package br.com.unipe.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.uipe.entity.Estudante;

@ManagedBean
@SessionScoped
public class CrudJsfBean {
	
	private List<Estudante> listaEstudante;
	private Estudante estudante = new Estudante();
	
	private Estudante antesEditarItem = null;
	private boolean edit;
	
	@PostConstruct
	public void init() {
		listaEstudante = new ArrayList<Estudante>();
	}
	
	public void adicionar() {
		
		estudante.setId(
				listaEstudante.isEmpty() ? 1 : 
					listaEstudante.get(listaEstudante.size()-1).getId()+1);
		
		listaEstudante.add(estudante);
		
		estudante = new Estudante();
		
	}
	
	public void editar (Estudante estudante) {
		antesEditarItem = estudante.clone();
		this.estudante = estudante;
		edit = true;
	}
	
	public void cancelarEdicao() {
		this.estudante.restaurar(antesEditarItem);
		this.estudante = new Estudante();
		edit = false;
	}
	
	public void salvarEdicao() {
		this.estudante = new Estudante();
		
		edit = false;
	}
	
	public void apagar(Estudante estudante) {
		listaEstudante.remove(estudante);
	}

	public List<Estudante> getListaEstudante() {
		return listaEstudante;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public boolean isEdit() {
		return edit;
	}
}
