package br.com.fabricadeprogramador.aula61;
import br.com.fabricadeprogramador.aula2.Cliente;
import br.com.fabricadeprogramador.aula1.Cidade;
public class ProgramaPrincipalGenerico {

	public static void main(String[] args) {		
		
		// Opção 1 - Utilizando direto o método Gerenciar Genérico, não é a melhor opção
		
		GerenciarGenerico<Cliente> ggcliente = new GerenciarGenerico<Cliente>();
		ggcliente.cadastrar(new Cliente());
		
		GerenciarGenerico<Cidade> ggcidade = new GerenciarGenerico<Cidade>();
		ggcidade.cadastrar(new Cidade());
		
		// Opção 2 - Utilizando classe Gerenciador Cliente que exptends a Gerenciar Genérico
		
		GerenciadorCliente gcli = new GerenciadorCliente();
		gcli.cadastrar(new Cliente());
		
		GerenciadorCidade gcid = new GerenciadorCidade();
		gcid.cadastrar(new Cidade());
		
		
//		GerenciarGenerico gg = new GerenciarGenerico();
//		gg.cadastrar(new Cidade());
//		gg.cadastrar(new Cliente());
		
	}
}
