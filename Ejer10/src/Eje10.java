//Introducir un numero por teclado. Que nos diga si es par o impar. 
/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class Eje10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num=0;
		System.out.println("dame un número:");
		num=teclado.nextInt();
		if(num%2==0){
			System.out.println(num+ " es par");
			
		    }else{
				System.out.println(num+ " es impar" );
			}
			
		}	
	}

