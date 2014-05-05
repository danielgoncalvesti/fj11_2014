import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class CriarTexto {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// mais performance que o CriarTexto2
		InputStream texto = System.in;
		InputStreamReader textor = new InputStreamReader(texto);
		
		BufferedReader br = new BufferedReader(textor);
		OutputStream os = new FileOutputStream("textosaida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String s = br.readLine();
		
		while(!s.equalsIgnoreCase("fim")){
			bw.write(s + "\n");
			s = br.readLine();
		}
		bw.close();
		
		
	}

}
