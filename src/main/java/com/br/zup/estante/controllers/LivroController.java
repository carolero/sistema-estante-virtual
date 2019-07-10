package com.br.zup.estante.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.zup.estante.models.LivroModel;
import com.br.zup.estante.services.LivroService;

@Controller
public class LivroController {
	
	@Autowired
	LivroService livroService = new LivroService();
	
	@GetMapping("/")
	public ModelAndView mostrarLivros() {
		ModelAndView modelAndView = new ModelAndView("estante.html");
		modelAndView.addObject("livros", livroService.mostrarLivros());
		return modelAndView;
	}
	
	@GetMapping("/cadastro")
	public ModelAndView cadastrarLivro() {
		ModelAndView modelAndView = new ModelAndView("cadastro.html");
		return modelAndView;
	}
	
	@PostMapping("/cadastro")
	public String cadastrarLivroNaEstante(LivroModel livroModel) {
		livroService.cadastrarLivro(livroModel);
		return "redirect:/";
	}
	
	@GetMapping("/apagar/{id}")
	public ModelAndView apagarLivro() {
		ModelAndView modelAndView = new ModelAndView("apagar.html");
		return modelAndView;
	}
	
	@PostMapping("/apagar/{id}")
	public String apagarLivroDaEstante(@PathVariable int id) {
		livroService.apagarLivro(id);
		return "redirect:/";
	}
	
	@GetMapping("/lidos")
	public ModelAndView verListaDeLivrosLidos() {
		ModelAndView modelAndView = new ModelAndView("lidos.html");
		modelAndView.addObject("lidos", livroService.mostrarLivrosLidos());
		return modelAndView;
	}
	@GetMapping("/lidos/{id}")
	public ModelAndView lerLivro(@PathVariable int id) {
		ModelAndView modelAndView = new ModelAndView("mensagem-lido.html");
		modelAndView.addObject("lidos", livroService.lerLivro(id));
		return modelAndView;
	}
	
	@GetMapping("/emprestados")
	public ModelAndView verListaDeLivrosEmprestados() {
		ModelAndView modelAndView = new ModelAndView("emprestados.html");
		modelAndView.addObject("emprestados", livroService.mostrarLivrosEmprestados());
		return modelAndView;
	}
	@GetMapping("/emprestados/{id}")
	public ModelAndView emprestarLivro(@PathVariable int id) {
		ModelAndView modelAndView = new ModelAndView("mensagem-emprestado.html");
		modelAndView.addObject("lidos", livroService.emprestarLivro(id));
		return modelAndView;
	}
	
	@GetMapping("/devolvido/{id}")
	public ModelAndView devolverLivro() {
		ModelAndView modelAndView = new ModelAndView("mensagem-devolvido.html");
		return modelAndView;
	}
	
	@PostMapping("/devolvido/{id}")
	public String devolverLivroParaEstante(@PathVariable int id) {
		livroService.devolverLivro(id);
		return "redirect:/";
	}
	

}
