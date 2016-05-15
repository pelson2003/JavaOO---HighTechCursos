package br.com.fabricadeprogramador.aula2;

import br.com.fabricadeprogramador.aula1.Cidade;
import br.com.fabricadeprogramador.aula1.Estado;

public class ProgramaPrincipalHeranca {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Jao");
		cliente.setCpf("909090909");
		cliente.setRg("9090");
		
		Cidade cg = new Cidade();
		cliente.setCidade(cg);
		cg.setNome("Campo Grande");
		
		Estado ms = new Estado();
		ms.setNome("Mato Grosso do Sul");
		ms.setUf("MS");
		
		cg.setEstado(ms);
		
		
		
	}

}
