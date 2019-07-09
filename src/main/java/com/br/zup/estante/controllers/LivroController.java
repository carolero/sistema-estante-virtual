package com.br.zup.estante.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

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

}
