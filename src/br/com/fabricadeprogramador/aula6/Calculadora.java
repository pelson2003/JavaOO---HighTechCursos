package br.com.fabricadeprogramador.aula6;

@FunctionalInterface
public interface Calculadora {

	// Somente no java8 podemos implementar metodos em interfaces
	default public double subtrair (double n1, double n2){
		return n1-n2;
	}
	
	public double somar(double n1, double n2);
	
}
