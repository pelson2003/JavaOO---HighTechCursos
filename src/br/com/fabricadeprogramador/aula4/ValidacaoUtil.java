package br.com.fabricadeprogramador.aula4;

public class ValidacaoUtil {

	public static boolean validaCPF(String cpf) {

		if (cpf.length() != 11)
			return false;
		return true;

	}

	public static boolean validaRG(String rg) {
		return true;
	}

	public static boolean validaEmail(String email) {
		return true;
	}

}
