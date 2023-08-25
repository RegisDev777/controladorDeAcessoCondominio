package ControladoDeAcessoCondominio;

import java.util.Scanner;

public class teste {
		public static void main(String[] args) {
			   Scanner scanner = new Scanner(System.in);	   
		       controladoDeAcesso controladoDeAcesso = new controladoDeAcesso();
		       
		        while(true) {
		        	System.out.println("+-----------------------------------------+");
		            System.out.println("|          Iniciar o Sistema              |");
		            System.out.println("+-----------------------------------------+");
		            System.out.println("| 1. Cadastrar Morador                    |");
		            System.out.println("| 2. Cadastrar Visitante                  |");
		            System.out.println("| 3. Verifica Acesso                      |");
		            System.out.println("| 4. Sair                                 |");
		            System.out.println("+-----------------------------------------+");
		            
		            int opcao = scanner.nextInt();
		            scanner.nextLine();
		            
		            switch(opcao) {
		            case 1:
		            	controladoDeAcesso.cadastraMoradores(scanner);
		            	break;
		            case 2:
		            	controladoDeAcesso.cadastraVisitante(scanner);
		                break;
		            case 3:
		            	controladoDeAcesso.verificaAcesso(scanner);
		            case 4:
		            	System.out.println("Saindo do sistema...");
		            	return;
		            default:
		            	System.out.println("Opcao invalida. tente novamente!!");
		                 
		            }
		            
		        }
		       
		       
		       
		       
			

	}

}
