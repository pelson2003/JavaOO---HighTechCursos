package br.com.fabricadeprogramador.aula4;

import br.com.fabricadeprogramador.aula2.Funcionario;
import br.com.fabricadeprogramador.aula5.Analista;

public class ProgramaEx {

	public static void main(String[] args) {
		
		//Funcionario f1 = new Funcionario("Jao", "1010", "1111", "Dev");
		
		Funcionario f1 = new Analista("Jao", "1010", "1111", "Dev", 5000.0);
		
		System.out.println(f1);

	}

}
