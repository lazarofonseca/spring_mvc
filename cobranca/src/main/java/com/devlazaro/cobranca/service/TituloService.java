package com.devlazaro.cobranca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devlazaro.cobranca.model.Titulo;
import com.devlazaro.cobranca.repository.TituloRepository;

@Service
public class TituloService {
	
	@Autowired
	private TituloRepository tituloRepository;
	
	public String salvar(Titulo titulo) {
		tituloRepository.save(titulo);
		return "Novo titulo salvo";
	}
	
	
}
