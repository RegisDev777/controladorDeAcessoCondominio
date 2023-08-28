package ControladoDeAcessoCondominio;



public class visitante {
	private String nome;
	private String cpf;
	private String rg;
	private String dataSaida;
	private String HoraSaida;
	
	
	
	//construto
	public visitante(String nome, String rg, String dataSaida, String HoraSaida) {
		this.nome = nome;
		this.rg = rg;
		this.dataSaida = dataSaida;
		this.HoraSaida = HoraSaida;
	}

	//metodos

	
	
	
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	

	public String getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	

	public String getHoraSaida() {
		return HoraSaida;
	}

	public void setHoraSaida(String horaSaida) {
		HoraSaida = horaSaida;
	}






	
	
	
	
	
	
	
}
