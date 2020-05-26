package br.com.gods.domain.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Nutricionista implements Serializable{
	private static final long serialVersionUID = 1L;
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String email;
	private String crm;
	private String cpf;
	private String nome;
	private String telefone;
	
	
	@OneToMany(mappedBy = "nutricionista")
	private List<Paciente> pacientes = new ArrayList<>();
	
	
	@OneToOne
	private Endereco endereco;
	
	/*
	@JsonManagedReference
	@OneToOne
	private Clinica clinica;*/
	
	
	
	
}
