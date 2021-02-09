package com.estoque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.estoque.model.Endereco;
import com.estoque.service.EnderecoService;

@Controller
public class EnderecoController {
	
	@Autowired
	private EnderecoService enderecoService;
	
	@PostMapping("cadastrar-enderecos")
	public String cadastrarEndereco(@ModelAttribute Endereco endereco) {
		enderecoService.salvarEndereco(endereco);
		return "endereco/saveEndereco";
	}
	
	@GetMapping("cadastrar-enderecos")
	public String GetCadastrarEndereco() {
		return "endereco/saveEndereco";
	}
	
	
	@GetMapping("listar-enderecos")
	public ModelAndView listarEndereco() {
		ModelAndView model = new ModelAndView("endereco/listEndereco");
		model.addObject("endereco", enderecoService.listarEndereco());
		return model;
	}

}
