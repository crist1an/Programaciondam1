//Introducir una frase por teclado. Imprimirla cinco veces en filas consecutivas, pero cada impresión ir desplazada cuatro columnas hacia la derecha.
/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class eje22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int cont = 1;
		String espacios= "    "; 
		String mitexto; // vamos a leer una frase
		System.out.println("Dame una frase:");
		mitexto=teclado.nextLine();
		while(cont<5){ 
			System.out.println(espacios + mitexto);
			espacios = espacios +  "    ";
			cont++;
		}
	}

}
