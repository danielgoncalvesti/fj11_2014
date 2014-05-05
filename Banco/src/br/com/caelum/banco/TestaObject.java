package br.com.caelum.banco;

import br.com.caelum.banco.modelo.Conta;
import br.com.caelum.banco.modelo.ContaCorrente;

public class TestaObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaCorrente();
		c1.setNumero(10);
		c2.setNumero(10);
		
		System.out.println(c1);
		
		System.out.println(c1 == c2);

		System.out.println(c1.equals(c2));
		
		String s1 = "Ettore";
		s1 = s1.toUpperCase();
		System.out.println(s1);
		
		System.out.println(Integer.MAX_VALUE); 
	}

}
