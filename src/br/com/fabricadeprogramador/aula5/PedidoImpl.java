package br.com.fabricadeprogramador.aula5;

public class PedidoImpl implements Pedido {

	private ItemPedido[] itens = new ItemPedido[3];
	private Integer codigo;
	
	
	
	
	@Override
	public Integer getCodigo() {
		// TODO Auto-generated method stub
		return codigo;
	}

	@Override
	public Double calcularValorTotal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adicionarItem(ItemPedido itemPedido) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerItemPedido(ItemPedido itemPedido) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imprimirItens() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ItemPedido[] ordernarItensPedido() {
		// TODO Auto-generated method stub
		return null;
		
		// MergeSort
		// InsertionSort
		// Buble Sort
	}

	@Override
	public ItemPedido[] getItensPedido() {
		// TODO Auto-generated method stub
		return itens;
	}

	
	
	
}
