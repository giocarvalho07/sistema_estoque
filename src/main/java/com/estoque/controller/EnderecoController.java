package com.estoque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/endereco")
	public String endereco() {
		return "endereco/endereco";
	}
	
	@PostMapping("/endereco")
	public ModelAndView cadastrarEndereco(Endereco endereco){
			enderecoService.salvar(endereco);
			ModelAndView model = new ModelAndView("endereco/listEndereco");
			Iterable<Endereco> endereco1 = enderecoService.enderecoByAll();
			model.addObject("endereco", endereco1);
			return model;
	}

	@GetMapping("/listar-endereco")
	public ModelAndView listarEndereco() {
		ModelAndView model = new ModelAndView("endereco/listEndereco");
		Iterable<Endereco> endereco = enderecoService.enderecoByAll();
		model.addObject("endereco", endereco);
		return model;
	}
	
	@RequestMapping("editar-endereco/{id}")
	public ModelAndView editarEndereco(@PathVariable("id") Long id) {
		ModelAndView model = new ModelAndView("endereco/editEndereco");
		Endereco endereco = enderecoService.enderecoById(id);
		model.addObject("endereco", endereco);
		return model;
	}
	
	@GetMapping("deletar-endereco")
	public ModelAndView deletarEndereco(Long id) {
		Endereco endereco = enderecoService.enderecoById(id);
		enderecoService.enderecoByDelete(endereco);
		ModelAndView model = new ModelAndView("endereco/listEndereco");
		Iterable<Endereco> enderecoDeletar = enderecoService.enderecoByAll();
		model.addObject("endereco", enderecoDeletar);
		return model;
	}
	



}
