package br.com.gods.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gods.domain.entities.Nutricionista;
import br.com.gods.repository.NutricionistaRepository;

@Service
public class NutricionistaService {
	
	@Autowired
	private NutricionistaRepository rep;
	
	public Nutricionista find(Integer id){
		Optional <Nutricionista> obj = rep.findById(id);
		return null;
				/*obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Nutricionista.class.getName()));*/
	}

}
