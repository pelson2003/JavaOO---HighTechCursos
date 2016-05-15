package br.com.fabricadeprogramador.aula3;

import java.util.Date;
import java.util.Scanner;

public class ProgramaPrincipalMatricula {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		// Quantidade de Matriculars
		System.out.println("Informe qt de Matriculas: ");
		int qtd = leitor.nextInt();

		GerenciadorMatricula gm = new GerenciadorMatricula();
		gm.setQtdMatriculas(qtd);

		for (int i = 0; i < gm.getQtdMatriculas(); i++) {

			Curso c = new Curso();
			System.out.println("Nome do Curso: ");
			c.setNome(leitor.next());
			System.out.println("Carga Horario do Curso: ");
			c.setCargaHorario(leitor.nextInt());

			Aluno a = new Aluno();
			System.out.println("Codigo do Aluno: ");
			a.setCodigo(leitor.nextInt());
			System.out.println("Informe Nome do Aluno: ");
			a.setNome(leitor.next());

			Matricula m = new Matricula();
			m.setAluno(a);
			m.setCurso(c);
			m.setData(new Date());

			gm.cadastrar(m);

		}

		// Busca

		// for (Matricula m: matbusca) {
		//
		//
		// System.out.println(m.getAluno().getNome());
		// System.out.println(m.getAluno().getCodigo());
		//
		// }

		boolean entradaValida = true;
		Matricula[] matbusca = null;
		while (entradaValida == true) {
			System.out.println("Digite 1 buscar por codigo e 2 para busca por nome");
			int opcao = leitor.nextInt();

			if (opcao == 1) {
				System.out.println("Digite o codigo do aluno para busca: ");
				Aluno alunoBusca = new Aluno();
				alunoBusca.setCodigo(leitor.nextInt());
				matbusca = gm.buscarMatriculas(alunoBusca);
				entradaValida = false;

			} else if (opcao == 2) {

				System.out.println("Digite o Nome do aluno para busca: ");
				Aluno alunoBusca = new Aluno();
				alunoBusca.setNome(leitor.next());
				matbusca = gm.buscarMatriculas(alunoBusca);
				entradaValida = false;

			} else {

				System.out.println("Código Inválido");

			}
		}

		for (int i = 0; i < matbusca.length; i++) {

			// Se tiver na posição nula , o laço eh interrompiado
			if (matbusca[i] == null) {
				break;
			}
			System.out.println("Aluno: " + matbusca[i].getAluno().getNome());
			// System.out.println("Aluno: " +
			// matbusca[i].getAluno().getCpf());
			System.out.println("Codigo: " + matbusca[i].getCodigo());
			System.out.println("Curso: " + matbusca[i].getCurso().getNome());

		}

		leitor.close();

	}

}
