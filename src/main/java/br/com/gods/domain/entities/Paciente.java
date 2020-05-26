package br.com.gods.domain.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.gods.domain.entities.enums.TipoSexo;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Paciente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	private String cpf;
	private String telefone;
	private float peso;
	private Timestamp idade;
	private float altura;
	private TipoSexo tipo;
	
	@ManyToOne
	@JoinColumn(name = "nutricionista_id")
	private Nutricionista nutricionista;
	
	
	@OneToMany(mappedBy = "paciente")
	private List<Endereco> enderecos = new ArrayList<>();
	
	
	@OneToOne
	@JoinColumn(name = "dieta_id")
	private Dieta dieta;
	
	@OneToOne(mappedBy = "paciente")
	private Endereco endereco;
	
	//private Sexo sexo;
	
}
