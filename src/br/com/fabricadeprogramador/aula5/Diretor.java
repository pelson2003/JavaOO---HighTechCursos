package br.com.fabricadeprogramador.aula5;

import br.com.fabricadeprogramador.aula2.Funcionario;

public class Diretor extends Funcionario {

	public Diretor() {
		// TODO Auto-generated constructor stub
	}
	
	public Diretor(String nome, double salario) {
		setNome(nome);
		setSalario(salario);
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return getSalario() * 1.10;
		
	}
	

	
}
