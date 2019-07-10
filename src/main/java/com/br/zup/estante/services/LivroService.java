package com.br.zup.estante.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import com.br.zup.estante.models.LivroModel;

@Service
public class LivroService {
	
	private List<LivroModel> livros = new ArrayList<LivroModel>();
	
	private List<LivroModel> lidos = new ArrayList<LivroModel>();
	private List<LivroModel> emprestados = new ArrayList<LivroModel>();
	
	public Collection<LivroModel> mostrarLivros() {
		return this.livros;
	}
	
	public void cadastrarLivro(LivroModel livroModel) {
		livroModel.setId(livros.size() + 1);
		livroModel.setLocalDeVisualizacao("estante");;
		livros.add(livroModel);
	}
	
	public void apagarLivro(int id) {
		for (LivroModel livroModel : livros) {
			if(livroModel.getId() == id) {
				livroModel.setLocalDeVisualizacao("");;
			}
		}
	}
	
	public Collection<LivroModel> mostrarLivrosLidos() {
		return this.lidos;
	}
	
	public Collection<LivroModel> lerLivro(int id) {
		for (LivroModel livro : livros) {
			if(livro.getId() == id) {
				livro.setLocalDeVisualizacao("lidos");
			}
		}
		return lidos;
	}
	
	public Collection<LivroModel> mostrarLivrosEmprestados() {
		return this.emprestados;
	}
	
	public Collection<LivroModel> emprestarLivro(int id) {
		for (LivroModel livro : livros) {
			if(livro.getId() == id) {
				livro.setLocalDeVisualizacao("emprestados");
			}
		}
		return emprestados;
	}
	
	public void devolverLivro(int id) {
		for (LivroModel livro : livros) {
			if(livro.getId() == id) {
				livro.setLocalDeVisualizacao("estante");
			}
		}		
	}

}
