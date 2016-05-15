package br.com.fabricadeprogramador.aula2;

public abstract class Funcionario extends PessoaFisica {

	private String cargo;
	private double salario;

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	
	public Funcionario(String nome, String cpf, String rg, String cargo) {
		setNome(nome);
		setCpf(cpf);
		setRg(rg);
		setCargo(cargo);
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Funcionario [cargo=" + cargo + ", getCpf()=" + getCpf() + ", getRg()=" + getRg() + ", getNome()="
				+ getNome() + ", getCidade()=" + getCidade() + "]";
	}

	

	//Sobre Escrita
//	@Override
//	public String toString() {
//		return "nome: " + getNome() + "cargo: " + getCargo();
//	}

	
	// Declaracao método abstrato
	public abstract double calcularSalario();

	public double calcularBonificacao() {
		return getSalario() + 50;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
}
