package br.com.fabricadeprogramador.aula6;

import br.com.fabricadeprogramador.aula1.Cidade;
import br.com.fabricadeprogramador.aula2.Cliente;

public class GerenciadorGenerico<T> {

	public void cadastrar(T ob) {

		
		
		System.out.println("Cadastrado com Sucesso " + ob.getClass().getSimpleName());
		

	}
	
//	// Opcao 1.
//	public void cadastrar (Object ob){
//		
//		if(ob instanceof Cliente) {
//		
//		System.out.println("Cliente Cadastrado com sucesso");
//		
//		} else if (ob instanceof Cidade) {
//		
//		System.out.println("Cliente Cadastrado com sucesso");
//		
//		}

	

}
