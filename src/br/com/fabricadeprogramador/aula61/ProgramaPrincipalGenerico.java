package br.com.fabricadeprogramador.aula61;
import br.com.fabricadeprogramador.aula2.Cliente;
import br.com.fabricadeprogramador.aula1.Cidade;
public class ProgramaPrincipalGenerico {

	public static void main(String[] args) {		
		
		// Op��o 1 - Utilizando direto o m�todo Gerenciar Gen�rico, n�o � a melhor op��o
		
		GerenciarGenerico<Cliente> ggcliente = new GerenciarGenerico<Cliente>();
		ggcliente.cadastrar(new Cliente());
		
		GerenciarGenerico<Cidade> ggcidade = new GerenciarGenerico<Cidade>();
		ggcidade.cadastrar(new Cidade());
		
		// Op��o 2 - Utilizando classe Gerenciador Cliente que exptends a Gerenciar Gen�rico
		
		GerenciadorCliente gcli = new GerenciadorCliente();
		gcli.cadastrar(new Cliente());
		
		GerenciadorCidade gcid = new GerenciadorCidade();
		gcid.cadastrar(new Cidade());
		
		
//		GerenciarGenerico gg = new GerenciarGenerico();
//		gg.cadastrar(new Cidade());
//		gg.cadastrar(new Cliente());
		
	}
}
