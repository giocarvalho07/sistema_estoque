package com.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.estoque.model.Endereco;

@Repository
public interface EnderecoRepository  extends JpaRepository <Endereco, Long>{

}
