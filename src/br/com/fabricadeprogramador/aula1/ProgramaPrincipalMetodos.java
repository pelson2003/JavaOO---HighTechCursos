package br.com.fabricadeprogramador.aula1;

public class ProgramaPrincipalMetodos {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		
		c1.marca ="x";
		
		double somar = c1.somar(10, 20);

		System.out.println(somar);
		
	}

}
