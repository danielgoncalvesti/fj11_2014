package br.com.caelum.banco;

import java.util.Collection;
import java.util.HashSet;

public class TestaConjunto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//	Set<String> cj = new HashSet<String>();
		Collection<String> cj = new HashSet<String>();
		cj.add("Guilherme");
		cj.add("Paulo");
		cj.add("Sergio");
		cj.add("Alberto");
		cj.add("Paulo");
		System.out.println(cj);
		System.out.println("Amor".hashCode());
	}

}
