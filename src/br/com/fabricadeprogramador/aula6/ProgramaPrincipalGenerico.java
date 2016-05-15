package br.com.fabricadeprogramador.aula6;

import java.util.ArrayList;
import java.util.List;

import br.com.fabricadeprogramador.aula1.Cidade;
import br.com.fabricadeprogramador.aula2.Cliente;

public class ProgramaPrincipalGenerico {

	public static void main(String[] args) {
		
		GerenciadorGenerico<Cliente> gg = new GerenciadorGenerico<Cliente>();

		gg.cadastrar(new Cliente());
		
		
		GerenciadorCliente gcli = new GerenciadorCliente();
		
		gcli.cadastrar(new Cliente());
		
		
		GerenciadorCidade gcid = new GerenciadorCidade();
		
		gcid.cadastrar(new Cidade());
		
		// Exemplo de Generics
		
		List<Cliente> lista = new ArrayList<Cliente>();
		
		
		
		// //Para a Opcao 1
		// GerenciadorGenerico gg = new GerenciadorGenerico();
		//
		// gg.cadastrar(new Cidade());
		//
		// gg.cadastrar(new Cliente());

	}

}
