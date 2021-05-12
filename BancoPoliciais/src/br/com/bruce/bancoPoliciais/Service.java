package br.com.bruce.bancoPoliciais;

import java.util.ArrayList;

public class Service {
	
	ArrayList<Policial> arrayList = new ArrayList<Policial>();
	
	public void adicionar(Policial policial) {
		arrayList.add(policial);
	}
	
	public void listar() {
		for(Policial array : arrayList) {
			System.out.println("----------------------");
			System.out.println(array.getNome());
			System.out.println(array.getCorFarda());
			System.out.println(array.getArma());
			System.out.println("----------------------");
		}
	}

}
