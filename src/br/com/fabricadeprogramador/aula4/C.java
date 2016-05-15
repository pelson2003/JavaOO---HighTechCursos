package br.com.fabricadeprogramador.aula4;

public class C extends B {

	public C() {
		this(10);
		System.out.println("Construtor C");
	}
	
	public C(int n){
		System.out.println(n);
	}
	
}
