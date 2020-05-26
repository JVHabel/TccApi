package br.com.gods.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gods.domain.entities.Nutricionista;

@Repository
public interface NutricionistaRepository extends JpaRepository<Nutricionista, Integer>{
	

}
