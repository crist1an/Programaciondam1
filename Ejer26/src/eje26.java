//Introducir una frase por teclado. Imprimirla en el centro de la pantalla

/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class eje26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int longitud=80;
		int espacio=0;
		int espacioenblan=0;
		String mitexto; // vamos a leer una frase
		System.out.println("dame un texto:");
		mitexto=teclado.nextLine();
		//System.out.println(mitexto);
		int texto=mitexto.length();
		if(texto<80){
			espacio=longitud-texto;
			espacioenblan=espacio/2;
			
		}
		for (int i = 0; i < espacioenblan; i++) { // imprimir espacios en blanco
			System.out.print(" ");
		}
		System.out.println(mitexto);
		
	}

}
