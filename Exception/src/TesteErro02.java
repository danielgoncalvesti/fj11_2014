import java.io.FileNotFoundException;

public class TesteErro02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("inicio do main");

		/*
		 * try { metodo1(); }catch (ArrayIndexOutOfBoundsException e){
		 * System.out.println("---Ocorreu um erro---"); }
		 */

		metodo1();
		System.out.println("fim do main");
		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
	public static void metodo1(){
		System.out.println("ínicio do metodo 1");
		
	/*	try{
			metodo2();
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("--Ocorreu erro m2--");
		} */
		
		metodo2();
		System.out.println("fim do metodo 1");
	}

	public static void metodo2() {
		System.out.println("inicio do metodo 2");
		int[] array = new int[10];
		for (int i=0; i<15;i++){
	//exemplo ruim
			try{
				array[i] = i*i;
				System.out.println(array[i]);
			} catch(ArrayIndexOutOfBoundsException e){
				System.out.println("erro, posicao invalida: "+e.getMessage());
			}
		}
		System.out.println("fim do metodo 2");
	}
}
