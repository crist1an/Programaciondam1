//Introducir dos n�meros por teclado. Imprimir los n�meros naturales que hay entre ambos n�meros empezando por el m s peque�o, contar cuantos hay y cu�ntos de ellos son pares. Calcular la suma de los impares.

/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class eje15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num1=0;
		int num2=0;
		int mayor=0;
		int menor=0;
		int pares=0;
		int sumimpa=0;
		int cont=0;
		System.out.println("dame el primer n�mero:");
		num1=teclado.nextInt();
		System.out.println("dame el segundo n�mero:");
		num2=teclado.nextInt();
		if(num1>num2){
			mayor=num1;
			menor=num2;
		}else{
			menor=num1;
			mayor=num2;
		}
		System.out.println(menor+"  es menor  " +mayor+"  es mayor" );
		while(menor<mayor){
			if(menor%2==0){
				pares++;
			}else{
				sumimpa=sumimpa+menor;
			}
			menor++;
			cont++;
		}
		System.out.println("Hay "+pares+" pares");
		System.out.println("La suma de los impares es  "+sumimpa);
		System.out.println(cont);
		
	}

}
