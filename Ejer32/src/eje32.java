//.-Hacer un programa que nos permita introducir un n�mero por teclado y sobre el se realicen las siguientes operaciones: comprobar si es primo, hallar su factorial o imprimir su tabla de multiplicar.

/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class eje32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;//numero que introducimos
		int cont=2;
		int factor=1;
		int multi=1;
		int resul=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un n�mero:");
		num1=teclado.nextInt();
		boolean prim=true;
		while(prim && cont<num1/2){
			
			if(num1%cont==0){
						prim=false;
			}
			cont++;
		}
		if(prim){
			System.out.println("El "+num1+" es primo");
		}else{
			System.out.println("El "+num1+" no es primo");
			
		}
		cont = num1;
		while(cont>=1){
			factor = factor * cont;
			
			cont--;
			
		}
		
		System.out.println("Su factorial es = "+factor );
		while(multi<=10){
			resul=num1*multi;
			
			System.out.println(num1+"*"+multi+"="+resul);
			multi++;
			
		}
	  }
	}
