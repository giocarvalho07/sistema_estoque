package com.estoque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.estoque.model.Franquia;
import com.estoque.service.EnderecoService;
import com.estoque.service.FranquiaService;

@Controller
public class FranquiaController {
	
	@Autowired
	private FranquiaService franquiaService;
	
	@Autowired
	private EnderecoService enderecoService;
	
	@GetMapping("/franquia")
	public ModelAndView franquia() {
		ModelAndView model = new ModelAndView("franquia");
		model.addObject("franquia", new Franquia());
		model.addObject("franquias", franquiaService.franquiaByAll());
		model.addObject("enderecos", enderecoService.enderecoByAll());
		return model;
	}
	

}
