package br.com.caelum.banco;

public class TestaString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "fj11";
		s = s.replaceAll("1","2");
		System.out.println(s);
		
		int i = s.charAt(0);
		System.out.println(i);
		
		String stringComEspaco = "teste de string com espacos  ";
		
		String palavras[] = stringComEspaco.split(" ");
		
		String semEspaco = "";
		for (String palavra:palavras){
			semEspaco = semEspaco.concat(palavra);
		}
		System.out.println(semEspaco);

		String stringComEspaco2 = "teste de string com espacos  ";
		
		String semEspaco2 = stringComEspaco2.replace(" ", "");
		System.out.println(semEspaco2);
		
		String stringVazia = "c";
		boolean s1 = stringVazia.isEmpty();
		System.out.println(s1);
	}

}
