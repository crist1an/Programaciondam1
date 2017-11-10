//Hacer un programa que lea las calificaciones de un alumno en 10 asignaturas, las almacene en un vector y calcule e imprima su media.
/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class eje34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		float media;				
		float nota[];////nota[i] nos sirve para almacenar la nota  introducida por telcado
		nota=new float [10];//nos permite lamacenar hasta 10 notas	//int nota[]={1,2,3,4,5,6,7,8,9,10};
		float suma=0;
		for (int i = 0; i < nota.length; i++) {//nota.length para recorrer el numero de notas puedo introducir
			System.out.println("Dame la nota:");
			nota[i]=teclado.nextFloat();
			suma=suma+nota[i];
		}
		media=suma/nota.length;
		System.out.println(media);
	}

}
