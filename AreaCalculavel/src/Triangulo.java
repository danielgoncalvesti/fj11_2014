public class Triangulo implements AreaCalculavel {
	private int base;
	private int altura;
	
	public Triangulo(int base, int altura){
		this.base= base;
		this.altura=altura;
	}
	public double calculaArea(){
		return base*altura/2;
	}
}
