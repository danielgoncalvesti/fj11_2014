import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class LerArquivo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
	//	InputStream is = new FileInputStream("arquivo.txt");
		// System.out.println(is.read());

	//	InputStream is = new URL("http://www.google.com.br").openStream();
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		// System.out.println((char)isr.read());
		
		BufferedReader br = new BufferedReader(isr);
		
		String s = br.readLine();
		
		while(!s.equalsIgnoreCase("fim")){
			System.out.println(s);
			s = br.readLine();
		}
	}

}