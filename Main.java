import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Rodolfo Cacacho, Fredy Espana, Carlos Solorzano
 */
public class Main {
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		BinarySearchTree<String, String> tree = new BinarySearchTree<String, String>();
		System.out.println("Arbol binario: (in-order)");
		String dic = readFile("diccionario.txt");
			
		/* Lectura del archivo */
		for (String sp : dic.split("-")) {
				String st[] = sp.split(",");
				tree.insert(st[0].substring(1).toUpperCase(),
						st[1].substring(1, st[1].length() - 1));
		}
		tree.inOrder();
		System.out.println();
		
		System.out.println("Texto en ingles:");
		String text = readFile("texto.txt");
		text = text.substring(0, text.length() - 2);
		System.out.println(text);
		System.out.println("Texto en espanol:");
		for (String s : text.split(" ")) {
			String ret = tree.lookup(s.toUpperCase());
			if (ret != null) {
				System.out.print(ret + " ");
			} else {
				System.out.print("*" + s + "* ");
			}
		}
		System.out.println("");
	}

	/**
	 * 
	 * @param path La ruta del archivo a leer
	 * @return La linea o lineas del archivo de texto
	 */
	private static String readFile (String path) {
		String str = "";
		String s = "";
		try {
			FileReader f = new FileReader(path);
			BufferedReader b = new BufferedReader(f);
			try {
				while ((s = b.readLine()) != null) {
					str += s + "-";
				}
				b.close();
			} catch (IOException e) {
				return "";
			}
		} catch (FileNotFoundException e) {
			return "";
		}
		return str;
	}
}