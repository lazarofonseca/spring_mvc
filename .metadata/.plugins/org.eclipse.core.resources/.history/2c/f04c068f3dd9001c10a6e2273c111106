package com.devlazaro.cobranca.controller;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.devlazaro.cobranca.model.Titulo;

@Controller
public class TituloController {
	
	@RequestMapping("/titulos/novo")
	public String novo(){
		return "CadastroTitulo";
	}
	
	@RequestMapping(value = "/titulos", method = RequestMethod.POST)
	public String salvar(Titulo titulo) {
		BigDecimal teste = titulo.getValor();
		System.out.println(teste);
		System.out.println("Teste do controller");
		String descricao = titulo.getDescricao();
		System.out.println("Teste descrição");
		System.out.println(descricao);
		System.out.println(titulo.getDescricao());
		return "Lista";
	}

}
