package br.com.fabricadeprogramador.aula61;

//Interface Funcional � quando temos 1 m�todo abstrato, no nosso caso somar.
@FunctionalInterface
public interface Calculadora {
	
	//Outro ponto do Java8 � que agora podemos implementar m�todos em Interfaces
	default public double subtrair (double n1, double n2){
		return n1-n2;
	}
	
	public double somar (double n1, double n2);
	
	
	
}
