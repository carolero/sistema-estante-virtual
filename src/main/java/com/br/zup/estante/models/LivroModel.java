package com.br.zup.estante.models;

public class LivroModel {
	
	private int id = 0; 
	private String tituloDoLivro;
	private String autor;
	private String genero;
	private int paginas;
	
	public LivroModel() {
		
	}
	public LivroModel(String tituloDoLivro, String autor, String genero, int paginas) {
		super();
		id++;
		this.tituloDoLivro = tituloDoLivro;
		this.autor = autor;
		this.genero = genero;
		this.paginas = paginas;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTituloDoLivro() {
		return tituloDoLivro;
	}
	public void setTituloDoLivro(String tituloDoLivro) {
		this.tituloDoLivro = tituloDoLivro;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	@Override
	public String toString() {
		StringBuilder modelo = new StringBuilder();
		modelo.append("Título: " + this.tituloDoLivro);
		modelo.append("Autor: " + this.autor);
		modelo.append("Gênero: " + this.genero);
		modelo.append("Número de páginas: " + this.paginas);
		return modelo.toString();
	}

}
