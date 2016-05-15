package br.com.fabricadeprogramador.aula2;

import br.com.fabricadeprogramador.aula1.Cidade;

public class Pessoa {

	protected String nome;
	private Cidade cidade;
	
	public Pessoa(String nome) {
		setNome(nome);
	}
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, Cidade cidade){
		
		setNome(nome);
		setCidade(cidade);
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cidade=" + cidade + "]";
	}

	
	
//	@Override
//	public boolean equals(Object obj) {
//		
//		// Cast do objeto.
//		Pessoa p = (Pessoa) obj;
//		
//		return this.nome.equals(p.getNome());
//	}
	
	
	
	
}
