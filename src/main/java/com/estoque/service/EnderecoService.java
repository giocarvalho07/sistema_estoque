package com.estoque.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.estoque.model.Endereco;
import com.estoque.repository.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	
	public List<Endereco> enderecoByAll(){
		return enderecoRepository.findAll();
	}
	
	public void salvar(Endereco endereco) {
		enderecoRepository.save(endereco);
	}
	
	public Endereco enderecoById(Long endereco) {
		return enderecoRepository.findById(endereco).get();
	}// pesquisar aluno por id
	
	public void remover(Endereco endereco) {
		enderecoRepository.delete(endereco);
	} // remover o aluno

}
