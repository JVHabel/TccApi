package br.com.gods.domain.entities.enums;

public enum TipoSexo {

	HOMEM(1,"Sexo masculino"),
	MULHER(2,"Sexo feminino");
	
	private int cod;
	private String descricao;
	
	private TipoSexo(int cod,String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	public static TipoSexo toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		
		for (TipoSexo x : TipoSexo.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
