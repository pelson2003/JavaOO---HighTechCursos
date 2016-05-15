package br.com.fabricadeprogramador.aula4;

import javax.swing.JOptionPane;

import br.com.fabricadeprogramador.aula1.Cliente;

public class ProgramaPrincipalEstaticos {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();
		
		System.out.println(c1.getQtdCliente());
		System.out.println(c2.getQtdCliente());
		System.out.println(c3.getQtdCliente());
	
		System.out.println(Cliente.getQtdCliente());
		
		String nome = JOptionPane.showInputDialog(null, "Nome:" );
		c1.setNome(nome);
		
		String cpf = JOptionPane.showInputDialog(null, "CPF:" );
		
		if(ValidacaoUtil.validaCPF(cpf)==true){
			c1.setCpf(cpf);
		}else{
			JOptionPane.showMessageDialog(null, "CPF Incorreto");
		}
		
	
		
		JOptionPane.showMessageDialog(null, c1.getNome());
		
		JOptionPane.showMessageDialog(null, "Total de Clientes: " + Cliente.getQtdCliente());
		
	}

}
