//Hacer un pseudoc�digo que imprima todos los n�meros naturales que hay desde la unidad hasta un numero que introducimos por teclado.

/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class Eje6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 
		int contador=1;
		int num=0;
		System.out.println("dame un n�mero:");
		num=teclado.nextInt();
		while(contador<=num){
			System.out.println(contador);
			contador++;

		}



	}

}
