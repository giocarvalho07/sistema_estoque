package com.estoque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estoque.model.Franquia;
import com.estoque.repository.FranquiaRepository;

@Service
public class FranquiaService {
	
	@Autowired
	private FranquiaRepository franquiaRepository;
	
	public List<Franquia> franquiaByAll(){
		return franquiaRepository.findAll();
	}
	
	public void salvarFranquia(Franquia franquia) {
		franquiaRepository.save(franquia);
	}
	
	public void editarFranquia(Long cod) {
		franquiaRepository.findById(cod).get();
	}
	
	public void deletarFranquia(Franquia franquia) {
		franquiaRepository.delete(franquia);
	}


}
