import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestaI18N {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		Scanner arquivo = new Scanner(new FileInputStream("en.properties"));
		
		Map<String, String> i18n = new HashMap<String, String>();
		while(arquivo.hasNextLine()){
			String conjunto = arquivo.nextLine();
			String[] chaveValor = conjunto.split("=");
			i18n.put(chaveValor[0], chaveValor[1]);
		}
		System.out.println(i18n.get("arquivo"));
	}

}
