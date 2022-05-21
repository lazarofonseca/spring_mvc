package com.devlazaro.cobranca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.devlazaro.cobranca.model.Titulo;
import com.devlazaro.cobranca.service.TituloService;

@Controller
public class TituloController {

	@Autowired
	private TituloService tituloService;

	@RequestMapping("/titulos/novo")
	public String novo() {
		return "CadastroTitulo";
	}

	@RequestMapping(value = "/titulos", method = RequestMethod.POST)
	public ModelAndView salvar(Titulo titulo) {
		tituloService.salvar(titulo);
		ModelAndView mv = new ModelAndView("CadastroTitulo");
		mv.addObject("mensagem", "Título salvo com sucesso!!!!!!");
		return mv;
	}

}
