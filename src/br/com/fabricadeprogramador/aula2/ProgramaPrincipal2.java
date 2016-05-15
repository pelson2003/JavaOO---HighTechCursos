package br.com.fabricadeprogramador.aula2;

import br.com.fabricadeprogramador.aula1.Cidade;
import br.com.fabricadeprogramador.aula1.Estado;
import br.com.fabricadeprogramador.aula5.Analista;
import br.com.fabricadeprogramador.aula5.Diretor;

public class ProgramaPrincipal2 {

	public static void main(String[] args) {
		
	Estado ms = new Estado();
	ms.setNome("Mato Grosso do Sul");
	ms.setUf("MS");
		
	Cidade cg = new Cidade();
	cg.setNome("Campo Grande");
	cg.setEstado(ms);
	
	
		Funcionario func1 = new Analista();
		func1.setNome("jao");
		func1.setCargo("Programador Java");
		func1.setCidade(cg);
		
		
		Funcionario func2 = new Diretor();
		
		System.out.println(func1.equals(func2));
		
		System.out.println(func1.toString());
		
		
		String nome1 = new String("Jao");
		
		String nome2 = new String("Jao");
		
		System.out.println(nome1.equals(nome2));

	}

}
