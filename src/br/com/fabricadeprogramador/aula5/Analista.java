package br.com.fabricadeprogramador.aula5;

import br.com.fabricadeprogramador.aula2.Funcionario;

public class Analista extends Funcionario{

	
	
	public Analista() {
		// TODO Auto-generated constructor stub
	}
	
	public Analista(String nome, String cpf, String rg, String cargo, double salario) {
		setNome(nome);
		setCpf(cpf);
		setRg(rg);
		setCargo(cargo);
		setSalario(salario);
	}

	public Analista(String nome, double salario) {
		setNome(nome);
		setSalario(salario);
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return getSalario() * 1.05;
	}

	
	
}
