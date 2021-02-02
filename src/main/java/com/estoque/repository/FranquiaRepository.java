package com.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.estoque.model.Franquia;

@Repository
public interface FranquiaRepository extends JpaRepository <Franquia, Long>{

	
}
