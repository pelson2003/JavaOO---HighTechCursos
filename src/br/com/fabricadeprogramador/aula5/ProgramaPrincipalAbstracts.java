package br.com.fabricadeprogramador.aula5;

import br.com.fabricadeprogramador.aula2.Funcionario;

public class ProgramaPrincipalAbstracts {

	public static void main(String[] args) {
		
		Funcionario f1 = new Analista("Jao", 5000.0);
		System.out.println(f1.calcularSalario());
		
		
		
		Funcionario f2 = new Diretor("Maria", 10000.0);
		double salf2 = f2.calcularSalario();
		System.out.println(salf2);
		
		

	}

}
