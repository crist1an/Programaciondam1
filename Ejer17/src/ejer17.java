//Imprimir, contar y sumar los múltiplos de 2 que hay entre una serie de números, tal que el segundo sea mayor o igual que el primero. 
/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class ejer17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num1=0;
		int num2=0;
		int cont=1;
		int mul=0;
		int sumulti=0;
		System.out.println("dame el primer número:");
		num1=teclado.nextInt();
		System.out.println("dame el segundo número:");
		num2=teclado.nextInt();
		cont=num1;
		while(cont<=num2){
			if(cont%2==0){
				System.out.println(cont);
				mul++;
				sumulti=sumulti+cont;
			}
			
			cont++;
		}
		System.out.println(sumulti);

	}

}
