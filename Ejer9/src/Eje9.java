//Introducir un numero por teclado. Que nos diga si es positivo o negativo.

/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class Eje9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in); 
		int num=0;
		System.out.println("Dame un n�mero:");
		num=teclado.nextInt();	
			if(num>=0){
				System.out.println(num+ " es positivo");

			}else {
				System.out.println(num+ " es negativo");
			}


		
	}

}
