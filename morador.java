package ControladoDeAcessoCondominio;

public class morador {

		private String nome;
		private String cpf;
		private String rg;
		private int apartamento;
		private char bloco;
		
		//construtor
		public morador(String nome, String rg, String cpf, char bloco) {
			rg = rg.replaceAll("//d","");
			 if(rg.length() != 9 ) {
				 throw new IllegalArgumentException("RG INVALIDO...");
			 }
			 cpf = cpf.replaceAll("//d","");
			 if(cpf.length() != 11 ) {
				 throw new IllegalArgumentException("CPF INVALIDO...");
			 }
			
			this.nome = nome;
			this.rg = rg;
			this.cpf = cpf;
			this.bloco = bloco;
		}



		//getter e setter
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
		

		public int getApartamento() {
			return apartamento;
		}
		public void setApartamento(int apartamento) {
			this.apartamento = apartamento;
		}
		

		public char getBloco() {
			return bloco;
		}
		public void setBloco(char bloco) {
			this.bloco = bloco;
		}
		
		
		
		
		
}
	

