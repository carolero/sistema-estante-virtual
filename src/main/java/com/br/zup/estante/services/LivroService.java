package com.br.zup.estante.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import com.br.zup.estante.models.LivroModel;

@Service
public class LivroService {
	
	private List<LivroModel> livros = new ArrayList<LivroModel>(Arrays.asList(new LivroModel("Mitologia Nórdica", "Neil Gaiman", "Literatura fantástica", 288)));
	
	public Collection<LivroModel> mostrarLivros() {
		return this.livros;
	}

}
