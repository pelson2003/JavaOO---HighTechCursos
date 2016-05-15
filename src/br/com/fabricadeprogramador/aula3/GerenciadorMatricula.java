package br.com.fabricadeprogramador.aula3;

public class GerenciadorMatricula {

	
	
	
	// Declaracao do Vetor
	private Matricula matriculas[];

	// Integer poneiro , igual a nulo
	private Integer codSequencial = 1;
	private Integer pos = 0;

	// Metodo de Cadastro de Matricula
	public void cadastrar(Matricula mat) {

		// 1 Atribui codigo na matricula
		// mat.setCodigo(gerarCodigoSequencial());

		Integer codigoSequencial = gerarCodigoSequencial();
		mat.setCodigo(codigoSequencial);

		// 2 Adiciona no Vator na condiçao de tamanho;
		if (pos < matriculas.length) {

			matriculas[pos++] = mat;

		} else {
			System.out.println("Numero de Posições cheias");
		}
	}

	
	public Matricula[] buscarMatriculas(Integer codigoAluno) {
	 return null;
	}
	
	public Matricula[] buscarMatriculas(Aluno alunoBusca) {

		Matricula matres[] = new Matricula[getQtdMatriculas()];
		int posbusca = 0;
		
		for (int i = 0; i < matriculas.length; i++) {

			// Comparando o codigo do aluno da matricula com o codigo do aluno
			// da busca

			if (matriculas[i].getAluno().getCodigo() == alunoBusca.getCodigo()) {

				matres[posbusca++] = matriculas[i];

			}

		}

		return matres;
		
	}

	private Integer gerarCodigoSequencial() {

		return codSequencial++;

	}

	public int getQtdMatriculas() {
		return matriculas.length;
	}
	
	
	public void setQtdMatriculas(int qtd) {
		matriculas = new Matricula[qtd];
	}
	

}
