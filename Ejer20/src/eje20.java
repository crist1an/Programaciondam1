//Calcular el factorial de un numero, mediante subprogramas.
/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class eje20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num1 = 0;
		int cont = 2;
		int factorial = 1;
		System.out.println("dame el n�mero:");
		num1=teclado.nextInt();
		cont = num1;
		while(cont>=1){
			factorial = factorial * cont;
			
			cont--;
			
		}
		
		System.out.println( factorial );
	}

}
