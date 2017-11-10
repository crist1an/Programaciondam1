//Hacer un pseudocódigo que imprima los números del 1 al 100. Que calcule la suma de todos los números pares por un lado, y por otro, la de todos los impares. 

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class eje12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int par=0;
		int impar=0;
		int cont=1;
		while(cont<=100){
			if(cont%2==0){
				par=par+cont;
			}else{
					impar=impar+cont;
					
				}
			cont++;
			}
			System.out.println(par+ "pares");
			System.out.println(impar+ "impares");
		}	
}
