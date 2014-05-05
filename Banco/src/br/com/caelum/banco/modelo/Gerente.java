package br.com.caelum.banco.modelo;
public class Gerente extends Funcionario {
	private int senha = 12345;

	public boolean validaSenha(int senha) {
		return this.senha == senha;
	}

	public double getBonificacao() {
		return salario * 0.15 + 1000;

	}
}
