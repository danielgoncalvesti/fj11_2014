import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
			throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		//dispara cliente
		new Cliente("192.168.133.25",30000).executa();
	}
	
	private String host;
	private int porta;
	
	public Cliente (String host, int porta){
		this.host = host;
		this.porta = porta;
	}
	
	public void executa() throws UnknownHostException, IOException {
		Socket cliente = new Socket(this.host, this.porta);
		System.out.println("O cliente se conectou ao servidor!");
		
		//thread para receber mensagem do servidor
		Recebedor r = new Recebedor(cliente.getInputStream());
		new Thread(r).start();
		
		//le msgs do teclado e manda para o servidor
		Scanner teclado = new Scanner(System.in);
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		while (teclado.hasNextLine()){
			saida.println(teclado.nextLine());
		}
		
		saida.close();
		teclado.close();
		cliente.close();
		
	}

}