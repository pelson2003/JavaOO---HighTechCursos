package br.com.fabricadeprogramador.aula61;

//Interface Funcional é quando temos 1 método abstrato, no nosso caso somar.
@FunctionalInterface
public interface Calculadora {
	
	//Outro ponto do Java8 é que agora podemos implementar métodos em Interfaces
	default public double subtrair (double n1, double n2){
		return n1-n2;
	}
	
	public double somar (double n1, double n2);
	
	
	
}
