public class TestaFormas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
		Quadrado a1 = new Quadrado(2);
		Retangulo a2 = new Retangulo(3,4);
		Circulo a3 = new Circulo(5);
		Retangulo a4 = new Retangulo(6,7);
		Quadrado a5 = new Quadrado(8); */

		//agora com polimorfismo
		/*		
		AreaCalculavel a1 = new Quadrado(2);
		AreaCalculavel a2 = new Retangulo(3,4);
		AreaCalculavel a3 = new Circulo(5);
		AreaCalculavel a4 = new Retangulo(6,7);
		AreaCalculavel a5 = new Quadrado(8);


		System.out.println(a1.calculaArea());
		System.out.println(a2.calculaArea());
		System.out.println(a3.calculaArea());
		System.out.println(a4.calculaArea());
		System.out.println(a5.calculaArea());		
		*/
		
		//agora com array
		
		//AreaCalculavel a[] = new AreaCalculavel[5];
		Object a[] = new Object [5];
		a[0] = new Quadrado(2);
		a[1] = new Retangulo(3,4);
		a[2] = new Circulo(5);
		a[3] = new Retangulo(6,7);
		a[4] = new Quadrado(8);
		a[4] = new Quadrado(8);
		//a[4] = "caelum";
		
		//para cada AreaCalculavel ac faça (percorre todo array)
/*		for(AreaCalculavel ac: a){
			System.out.println(ac.calculaArea());
		}
	*/
		for(Object ac: a){
			System.out.println(((AreaCalculavel)ac).calculaArea());
		}
		//System.out.println(a[5]);

	}

}
