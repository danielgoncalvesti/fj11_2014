import java.io.PrintStream;
import java.util.Scanner;

public class CriarTexto2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// metodo igual o CriarTexto porem menos eficiente que ele.
		Scanner s = new Scanner (System.in);
		PrintStream out = new PrintStream("textosaida2.txt");
		while(s.hasNext()){
			out.println(s.nextLine());
			}
		}
	}


