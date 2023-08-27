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
	    morador morador = new morador(nome, rg, cpf , bloco);
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
		 
		 System.out.print("DIA / MES DE SAIDA (obs nao esqueca do /):");
	        String dataDeEntrada = scanner.nextLine();
	          String[] partesData = dataDeEntrada.split("/");
	            if (partesData.length != 2) {
	        	        System.out.println("Formato de data inválido. Use DD/MM");
	            }
	          
	     
		visitante visitante = new visitante(nome, rg);		
		visitantes.add(visitante);
	
		System.out.println("CADASTRO EFETUADO COM SUCESSO!");
		System.out.println();

		System.out.println("DESCONECTANDO DO SISTEMA EM:");
		System.out.printf("%s / %s / 2023", partesData[0], partesData[1]);
		System.out.println();	
		System.out.println();
		
	}	
	
	//metodos VERIFICA ACESSO
	public void verificaAcesso(Scanner scanner) {
		System.out.println("+-----------------------------------------+");
	    System.out.println("|            VERICADOR ACESSO             |");
	    System.out.println("+-----------------------------------------+");
	    System.out.println("NOME:");
	      String nome = scanner.nextLine();
	       boolean verifica = false;
	       for(morador morador : moradores) {
	    	   if(morador.getNome().equals(nome)) {
	    		   verifica = true;
	    		    System.out.println("ACESSO PERMITIDO PARA " + morador.getNome());
	    		    System.out.println("DOCUMENTO:" + morador.getRg());
	    		    System.out.println("APARTAMENTO:" + morador.getApartamento() + "      BLOCO:" + morador.getBloco());
	    		    break;
	    	   }
	       }
	       
	       if(!verifica) {
	    	   for(visitante visitante : visitantes) {
	    		 if(visitante.getNome().equals(nome)) {   
	    			System.out.println("ACESSO PERMITDO!!"); 
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
