package br.com.fabricadeprogramador.aula7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import br.com.fabricadeprogramador.aula2.Cliente;



public class ProgramaPrincipalSet {

	// Set Trabalha com o conceito de conjuntos
	// Nao podem se repetir (MUITO IMPORTANTE)
	// Nao tem ordenação
	
	public static void main(String[] args) {
		
		Set<Cliente> conjunto = new HashSet<Cliente>();
		
		Cliente c1 = new Cliente();
		c1.setNome("Jao");
		
		Cliente c2 = new Cliente();
		c2.setNome("Jao");
		
		Cliente c3 = new Cliente();
		c3.setNome("Maria");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		
		
		
		System.out.println(conjunto.add(c1)); // True
		System.out.println(conjunto.add(c2)); // False
		System.out.println(conjunto.add(c3)); // True
		
		Iterator<Cliente> iterador = conjunto.iterator();
		
		while(iterador.hasNext()){
			Cliente c = iterador.next();
			System.out.println(c.getNome());
		}
		
		
		// Segunda forma
		for (Cliente c : conjunto) {
			
			System.out.println(c.getNome());
			
		}
		
		
		
		
	}
	
	
	

	
	
	
}
