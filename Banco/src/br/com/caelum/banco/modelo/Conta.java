package br.com.caelum.banco.modelo;

/**
 * <p><b><i> Classe Conta <img>
 * @author Daniel Goncalves da Silva
 *
 */
public class Conta implements Comparable{
	private int numero;
	private String titular;
	protected double saldo;
	private double limite;
	
	@Override
	public int compareTo(Object o) {
		Conta chegou = (Conta)o;
		return getNumero() - chegou.getNumero();
		
	}

/*	public void deposita(double valor) {
		if (valor < 0){
			throw new ValorInvalidoException(valor);
		} else{
			saldo += valor;	
		}
	} */

	/**
	 * Este metodo implementa o deposita na conta
	 * @param valor valor do deposito.
	 * @throws ValorInvalidoException
	 */
	
	public void deposita(double valor) throws ValorInvalidoException {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
			saldo += valor;
		}
	}
	
	@Override
	public String toString() {
		return "Eu sou uma Conta";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Conta){
			return((Conta)obj).getNumero()==getNumero();
		}
		return false;
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
		
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}

	public Conta() {
		limite = 1000;
	}

	public Conta(String titular) {
		this.titular = titular;
	}

	void mostra() {
		System.out.println("numero " + numero);
		System.out.println("titular " + titular);
		System.out.println("saldo " + saldo);
		System.out.println("limite " + limite);
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}


}
