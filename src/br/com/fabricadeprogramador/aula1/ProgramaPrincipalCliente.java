package br.com.fabricadeprogramador.aula1;

public class ProgramaPrincipalCliente {

	public static void main(String[] args) {
		
		// Instancia de Estado
		Estado ms = new Estado();
		ms.setNome("Mato Grosso do Sul");
		ms.setUf("MS");
		
		// Instancia de Cidade
		Cidade cg = new Cidade();
		cg.setNome("Campo Grande");
		cg.setEstado(ms);
		
		// Instancia de Cliente
		Cliente c1 = new Cliente ();
		c1.setNome("Jao");
		c1.setRg("9999");
		c1.setCpf("9090909");
		
		// Relacionamente de Cliente com Cidade
		c1.setCidade(cg);
		
		Cliente c2 = new Cliente ();
		c2.setNome("Maria");
		c2.setCidade(cg);
		
		Cliente c3 = new Cliente ();
		c3.setNome("Jose");
		c3.setCidade(cg);
		
		System.out.println(c1.getNome());
		System.out.println(c1.getNomeCidade());
		System.out.println(c1.getCidade().getEstado().getNome());
		System.out.println(c1.getCidade().getEstado().getUf());
		
		System.out.println(c2.getNome());
		System.out.println(c2.getCidade().getNome());
		
		System.out.println(c3.getNome());
		System.out.println(c3.getCidade().getNome());
		
		
				
	
	}

}
