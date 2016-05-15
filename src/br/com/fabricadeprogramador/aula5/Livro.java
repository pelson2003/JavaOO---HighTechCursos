package br.com.fabricadeprogramador.aula5;

import java.util.Date;

public class Livro implements ItemPedido {

	private Integer codigo;
	private Double valor;
	private String descricao;
	
	// Outros
	
	private String autor;
	private String editora;
	private Date dataPublicacao;
	
	
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	@Override
	public Integer getCodigo() {
		return codigo;
	}

	@Override
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
		
	}

	@Override
	public Double getValor() {
		// TODO Auto-generated method stub
		return valor;
	}

	@Override
	public void setValor(Double valor) {
		this.valor = valor;
		
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return descricao;
	}

	@Override
	public void setDescricao(String descricao) {
		this.descricao = descricao;
		
	}

}
