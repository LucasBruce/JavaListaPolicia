package br.com.bruce.bancoPoliciais;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		Service service = new Service();
		
	    int digito=0;
		
		do {
			System.out.println("digite <3> para adicionar policial");
			System.out.println("digite <2> para listar policiais");
			System.out.println("digite <1> para sair");
			
			digito = scan.nextInt();
			
			if(digito != 0) {
			   if(digito == 3) {
				   
				   Policial policia = new Policial();
				   
				   System.out.println("digite o nome:");
				   policia.setNome(scan.next());
				   
				   System.out.println("digie a cor da farda:");
				   policia.setCorFarda(scan.next());
				   
				   System.out.println("digite a arma:");
				   policia.setArma(scan.next());
				   
				   service.adicionar(policia);
				   
			   }else if(digito == 2) {
				   service.listar();
				   
			   }
			}
		}while(digito != 1);
		System.out.println("...");
	}

}
