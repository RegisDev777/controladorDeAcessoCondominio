package ControladoDeAcessoCondominio;

public class visitante {
	private String nome;
	private String cpf;
	private String rg;
	private String saida;
    private String mesSaida;
	
	
	
	
	//construto
	public visitante(String nome, String rg) {
		this.nome = nome;
	}


	//metodos
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


	public String getSaida() {
		return saida;
	}
	public void setSaida(String saida) {
		this.saida = saida;
	}


	public String getMesSaida() {
		return mesSaida;
	}
	public void setMesSaida(String mesSaida) {
		this.mesSaida = mesSaida;
	}


	



	
	
	
	
	
	
	
}
