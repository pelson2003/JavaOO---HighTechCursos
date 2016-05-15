package br.com.fabricadeprogramador.aula3.sobrescrita;

import br.com.fabricadeprogramador.aula2.Pessoa;

public class ProgramaPrincipalSobrescrita {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();	
		p1.setNome("Jao");
		
		Pessoa p2 = new Pessoa();	
		p2.setNome("Jao");
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

		//if ternario return (x>10)?0:1
		// ? entao ) if
		// : senao )else
	}

}
