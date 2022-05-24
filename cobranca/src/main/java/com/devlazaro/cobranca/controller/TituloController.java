package com.devlazaro.cobranca.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.devlazaro.cobranca.model.Titulo;
import com.devlazaro.cobranca.model.enun.StatusTitulo;
import com.devlazaro.cobranca.service.TituloService;

@Controller
public class TituloController {

	@Autowired
	private TituloService tituloService;

	@RequestMapping("/titulos/novo")
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("CadastroTitulo");
		return mv;
	}

	@RequestMapping(value = "/titulos", method = RequestMethod.POST)
	public ModelAndView salvar(Titulo titulo) {
		tituloService.salvar(titulo);
		ModelAndView mv = new ModelAndView("CadastroTitulo");
		mv.addObject("mensagem", "Título salvo com sucesso!!!!!!");
		return mv;
	}
	
	
	@ModelAttribute("todosStatusTitulo")
	public List<StatusTitulo> todosStatusTitulo(){
		return Arrays.asList(StatusTitulo.values());
	}
	
	

}
