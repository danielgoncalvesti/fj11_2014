package br.com.caelum.banco;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class TestaLista {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//	ArrayList lista = new ArrayList();
	
	//	ArrayList<String> lista = new ArrayList<String>();
		LinkedList<String> lista = new LinkedList<String>();
		lista.add("C");
		lista.add("C#");
		lista.add("Java");
		lista.add("Cobol");
		System.out.println(lista.toString());
		lista.remove("Cobol");
		System.out.println(lista);
		System.out.println(lista.contains("Java"));
		System.out.println(lista.size());
		//lista.add(10);
		System.out.println(lista);
		
		lista.add("Python");
		lista.add("Ada");
		lista.add("ObjectiveC");
		lista.add("Ruby");
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);
		
		Collections.reverse(lista);
		System.out.println(lista);
		Collections.shuffle(lista);
		System.out.println(lista);
	}

}
