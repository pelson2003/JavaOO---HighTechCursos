package br.com.fabricadeprogramador.aula5;

public class Curso implements ItemPedido {

	private Integer codigo;
	private Double valor;
	private String descricao;
	
	// Outros 
	private String conteudo;
	private String publicoAlvo;
	private Integer cargaHoraria;
	

	
	
	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getPublicoAlvo() {
		return publicoAlvo;
	}

	public void setPublicoAlvo(String publicoAlvo) {
		this.publicoAlvo = publicoAlvo;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public Integer getCodigo() {
		// TODO Auto-generated method stub
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
