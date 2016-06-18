package br.com.fabricadeprogramador.aula61;
import br.com.fabricadeprogramador.aula1.Cidade;
import br.com.fabricadeprogramador.aula2.Cliente;

public class GerenciarGenerico<T> {
	
	public void cadastrar(T ob){
		// Opção1.
		if(ob instanceof Cliente ){
			System.out.println("Cliente cadastrado com sucesso");
		} else if (ob instanceof Cidade) {
			System.out.println("Cidade cadastrado com sucesso");
		}
		// Opcao2.
		System.out.println("Segunda Opção. Cadastrado com sucesso: " + ob.getClass().getSimpleName());
	}
}