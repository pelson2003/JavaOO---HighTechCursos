package br.com.fabricadeprogramador.aula7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProgramaPrincipalMap {

	public static void main(String[] args) {
		
		// Nao é ordenado.
		
		Map<String, String> linguagensProgramacao = new HashMap <String, String>();
		
		linguagensProgramacao.put("Java", "Oracle");
		linguagensProgramacao.put("C#", "Microsoft");
		
		// Case Sensitive
		System.out.println(linguagensProgramacao.get("Java"));
		System.out.println(linguagensProgramacao.get("C#"));
		
		
		// Percorrer por 
		Set<String> chaves = linguagensProgramacao.keySet();
		
		for (String c: chaves) {
			System.out.println(c + " : " + linguagensProgramacao.get(c));
		}
		
		
		
		

	}

}
