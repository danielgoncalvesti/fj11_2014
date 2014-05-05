package br.com.caelum.banco;

import br.com.caelum.banco.modelo.ContaCorrente;
import br.com.caelum.banco.modelo.Tributavel;

public class TestaTributalvel {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		
		System.out.println(cc.calculaTributos());
		
		Tributavel t = cc;
		
		System.out.println(t.calculaTributos());
		System.out.println(cc.getSaldo());

	}

}
