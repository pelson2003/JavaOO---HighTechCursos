package br.com.fabricadeprogramador.aula4;

import br.com.fabricadeprogramador.aula1.Cidade;
import br.com.fabricadeprogramador.aula1.Estado;
import br.com.fabricadeprogramador.aula2.Pessoa;

public class ProgramaPrincipalConstrutor {

	public static void main(String[] args) {
		
		Estado ms = new Estado();
		ms.setUf("MS");
		
		Cidade cg = new Cidade();
		cg.setNome("Bonito");
		cg.setEstado(ms);
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Jao");
		p1.setCidade(cg);
		
		//System.out.println(p1.getNome());
		
		Pessoa p2 = new Pessoa("Maria");
		//System.out.println(p2.getNome());
		
		Pessoa p3 = new Pessoa ("Vimerson", new Cidade("Campo Grande", new Estado("MS")));
//		System.out.println(p3.getNome());
//		System.out.println(p3.getCidade().getNome());
//		System.out.println(p3.getCidade().getEstado().getUf());
		
		System.out.println(p3);
		
	}

}
