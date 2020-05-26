package br.com.gods.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gods.domain.entities.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer>{

}
