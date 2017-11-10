//Introducir tantas frases como queramos y contarlas

/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class Eje7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in); 
		int cont=1;
		String texto="";
		while(cont>0){
			System.out.println("Dame un la frase:");
			texto=teclado.nextLine();
			cont++;
			System.out.println(cont+" "+texto);
		}
		
	}

}

