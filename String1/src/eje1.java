/*
 Leer una frase de m�ximo 80 caracteres y escribirla progresivamente es decir si la frase es: �ciervo�, el programa debe imprimir
c
ci
cie
cier
cierv
ciervo
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class eje1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in); 
		String texto="";
		System.out.println("Dame una frase:");
		texto=teclado.nextLine();
		int longitud=1;
		while(longitud<texto.length()){	
		System.out.println(texto.substring(0,(longitud+1)));
		longitud++;
		}
		
	}

}
