//Imprimir y contar los múltiplos de 3 desde la unidad hasta un numero que introducimos por teclado.

/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class eje11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num=0;
		int cont=1;
		int multiplos=0;
		System.out.println("dame un número:");
		num=teclado.nextInt();
		while(num>=cont){
			if(cont%3==0){
				multiplos++;
				System.out.println(cont);
				
			}
			cont++;
		}
		System.out.println(multiplos);
	}

}
