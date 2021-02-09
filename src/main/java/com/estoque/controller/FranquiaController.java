package com.estoque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.estoque.model.Franquia;
import com.estoque.service.FranquiaService;

@Controller
public class FranquiaController {
	
	@Autowired
	private FranquiaService franquiaService;
	

	@GetMapping("/listar-franquias")
	public ModelAndView franquiaByAll() {
		
		ModelAndView model = new ModelAndView("franquia/saveFranquia");
		model.addObject("franquia", franquiaService.franquiaByAll());
		return model;
	}
	
	@PostMapping("/cadastrar-franquias")
	public String salvarFranquia(@ModelAttribute Franquia franquia) {
		franquiaService.salvarFranquia(franquia);
		return "franquia/listFranquia";
	}
	
	@GetMapping("/cadastrar-franquias")
	public String getsalvarFranquia() {
		return "franquia/listFranquia";
	}
	
	

}
