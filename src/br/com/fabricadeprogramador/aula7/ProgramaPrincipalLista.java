package br.com.fabricadeprogramador.aula7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.fabricadeprogramador.aula2.Cliente;

public class ProgramaPrincipalLista {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		c1.setNome("Jao");
		
		
		// Lista generico, ArrayList é uma aplicacao polimorfica
		List<Cliente> lista = new ArrayList<>();
		
		lista.add(c1);
		
		lista.add(new Cliente("Maria"));
		
		for (Cliente c : lista) {
			
			System.out.println(c.getNome());
			
		}
		
		
		for (int i = 0; i < lista.size(); i++) {
			
			System.out.println(lista.get(i).getNome());
			
		}
		
		
		// iterator next, e has next
		
		
		Iterator<Cliente> iterator = lista.iterator();
//		
//		System.out.println(iterator.hasNext());
//		
		//Cliente c = iterator.next();
//		
//		System.out.println(c.getNome());
//		
//		System.out.println(iterator.hasNext());
//		
//		c = iterator.next();
//		
//		System.out.println(c.getNome());
//		
//		System.out.println(iterator.hasNext());
		
		
		// Voce po
		
		
		while(iterator.hasNext()) {
			
			Cliente c = iterator.next();
			
			System.out.println(c.getNome());
			
		}
		
		

	}

}
