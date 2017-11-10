//Hacer un pseudocódigo que imprima los números impares hasta el 100 y que imprima cuantos impares hay.

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Eje5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int posicion=1;
		int contador=0;
		while(posicion<100){
			System.out.println(posicion);
			contador++;
			posicion=posicion+2;
		}
		System.out.println(contador);

	}

}