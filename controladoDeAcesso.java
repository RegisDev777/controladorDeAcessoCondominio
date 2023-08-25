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
		System.out.print("CPF:");
		 String cpf = scanner.nextLine();
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
		System.out.println("               REGISTAR MORADOR            ");
		System.out.println("+-----------------------------------------+");	
		System.out.print("NOME:");
		 String nome = scanner.nextLine();
		System.out.print("RG:");
		 String rg = scanner.nextLine();
		visitante visitante = new visitante(nome, rg);
		visitantes.add(visitante);
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
	    		    System.out.println("ACESSO PERMITIDO PARA ");
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
