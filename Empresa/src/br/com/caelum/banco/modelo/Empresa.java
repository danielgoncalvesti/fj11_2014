package br.com.caelum.banco.modelo;
class Empresa {
	String cnpj;
	String razao;
	Funcionario[] empregado;

	void adiciona(Funcionario f) {
		for (int i = 0; i < empregado.length; i++) {
			if (empregado[i] == null) {
				empregado[i] = f;
				break;
			}
		}
	}

	void mostra() {
		for (Funcionario f : empregado) {
			if (f != null)
				f.mostra();
		}
	}
}
