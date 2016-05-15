package br.com.fabricadeprogramador.aula5;

public interface Pedido {

	public Integer getCodigo();

	public Double calcularValorTotal();

	public void adicionarItem(ItemPedido itemPedido);

	public void removerItemPedido(ItemPedido itemPedido);

	public void imprimirItens();

	public ItemPedido[] ordernarItensPedido();

	public ItemPedido[] getItensPedido();

}
