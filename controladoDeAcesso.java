package ControladoDeAcessoCondominio;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class controladoDeAcesso {

	private List<morador> moradores = new ArrayList<>();
	private List<visitante> visitantes = new ArrayList<>();
 
	 //metodo  CADASTRA
	public void cadastraMoradores(Scanner scanner) {
		System.out.println("+-----------------------------------------+");
		System.out.println("               REGISTAR MORADOR            ");
		System.out.println("+-----------------------------------------+");
		System.out.print("NOME:");
		 String nome = scanner.nextLine();
		 
		 
		System.out.print("RG:");
		 String rg = scanner.nextLine();
			rg = rg.replaceAll("//d","");
			 if(rg.length() != 9 ) {
				 throw new IllegalArgumentException("RG INVALIDO...");
			 }
		 
		System.out.print("CPF:");
		 String cpf = scanner.nextLine();
		 	cpf = cpf.replaceAll("//d","");
		 	 if(cpf.length() != 11 ) {
		 		 throw new IllegalArgumentException("CPF INVALIDO...");
		     }
		 
	    System.out.print("BLOCO:");
		 char bloco = scanner.next().charAt(0);
		   if(bloco != 'A' && bloco != 'B' && bloco != 'C' && bloco != 'D' && bloco != 'a' && bloco != 'b' && bloco != 'c' && bloco != 'd' ) {
			      throw new IllegalArgumentException("BLOCO INVALIDO! tente novamente");
	   }
	    
		System.out.print("APARTAMENTO: ");
		 int apartamento = scanner.nextInt();
	
	    morador morador = new morador(nome, rg, cpf , bloco,apartamento );
		moradores.add(morador);
		System.out.println("MORADOR CADASTRADO COM SUCESSO");
	}
	
	public void cadastraVisitante(Scanner scanner) {
		System.out.println("+-----------------------------------------+");
		System.out.println("               REGISTAR VISITANTE          ");
		System.out.println("+-----------------------------------------+");	
		System.out.print("NOME:");
		 String nome = scanner.nextLine();
		 
		System.out.print("RG:");
		 String rg = scanner.nextLine();
		   rg = rg.replaceAll("//d","");
		     if(rg.length() != 9 ) {
			    throw new IllegalArgumentException("RG INVALIDO...");
		   }
		
	   
		     
		 System.out.print("DIA DE SAIDA:");
	        String Saida = scanner.nextLine();	        
	     
	     System.out.print("HORA:");
	        String Hora = scanner.nextLine();
	          
	     
		visitante visitante = new visitante(nome, rg, Saida, Hora);		
		visitantes.add(visitante);
		

	    
		System.out.println();
		System.out.println("CADASTRO EFETUADO COM SUCESSO!");
		System.out.println();

		System.out.println("DESCONECTANDO DO SISTEMA:");
		System.out.printf("data:" + Saida + "/2023" + " As " + Hora);
		System.out.println();	
		System.out.println();
		
	}	
	
	//metodos VERIFICA ACESSO
	public void verificaAcesso(Scanner scanner) {
		System.out.println("+-----------------------------------------+");
	    System.out.println("|            VERICADOR ACESSO             |");
	    System.out.println("+-----------------------------------------+");
	    System.out.print("NOME:");
	      String nome = scanner.nextLine();
	       boolean verifica = false;
	       for(morador morador : moradores) {
	    	   if(morador.getNome().equals(nome)) {
	    		   verifica = true;
	    		    System.out.println("ACESSO PERMITIDO PARA MORADOR");
	    		    System.out.println(morador.getNome());
	    		    System.out.println("DOCUMENTO:" + morador.getRg());
	    		    System.out.println("APARTAMENTO:" + morador.getApartamento() + "      BLOCO:" + morador.getBloco());
	    		    break;
	    	   }
	       }
	       
	       if(!verifica) {
	    	   for(visitante visitante : visitantes) {
	    		 if(visitante.getNome().equals(nome)) {   
	    			System.out.println("ACESSO PERMITDO PARA VISITANTE");
	    			System.out.println(visitante.getNome());
	    			System.out.println("Desconectando Do Sistema em: ");
	    			System.out.println("Data De Saida:" + visitante.getDataSaida() + "/2023");
	    			System.out.println("Hora Prevista " + visitante.getHoraSaida());
	    			verifica = true;
	    			break;
	    		 }
	    	   }
	       }
	       
	       if(!verifica) {
	    	   System.out.println("PESSOA NAO ENCONTRADA NA LISTA");
	       }
	       
	}
	
	
	
	
}
