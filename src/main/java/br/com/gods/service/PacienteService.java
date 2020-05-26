package br.com.gods.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gods.domain.entities.Paciente;
import br.com.gods.repository.PacienteRepository;

@Service
public class PacienteService {
	
	@Autowired
	private PacienteRepository rep;
	
	public Paciente find(Integer id){
		Optional <Paciente> obj = rep.findById(id);
		return null;
				/*obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Paciente.class.getName()));*/
	}

}
