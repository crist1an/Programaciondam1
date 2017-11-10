//Hacer un pseudocódigo que imprima los números del 0 al 100, controlando las filas y las columnas.

/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class eje23 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int cont = 0;
		int num1=0;
		System.out.println("Dame el número de columnas:");
		num1=teclado.nextInt();
		while(cont<=100){
			if(cont%num1==0){
				System.out.println();
			}
			System.out.printf("%3d ",cont);//imprime con formato
			cont++;
		}
	}

}
