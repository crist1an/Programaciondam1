//Hacer un pseudocódigo que imprima el mayor y el menor de una serie de cinco números que vamos introduciendo por teclado.

/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class eje14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num=0;
		int mayor=num;
		int menor=num;
		int veces=1;
		while(veces<=5){
			System.out.println("dame un número:");
			num=teclado.nextInt();
			if(veces==1){
				mayor=num;//asignar mayor en la primera vuelta
				menor=num;//asignar menor en el primera vuelta
			}
			if(num>mayor){
				mayor=num;

			}
			if(num<menor){
				menor=num;


			}
			veces++;

		}
		System.out.println("Es el mayor "+mayor);
		System.out.println("Es el menor "+menor);
	}

}
