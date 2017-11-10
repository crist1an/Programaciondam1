//Hacer un programa que calcule independientemente la suma de los pares y los impares de los números entre 1 y 1000, utilizando un switch.

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class eje21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contadorPares = 0;
		int	contadorImpares = 0;
		int	cont = 2;
		int esparoimpar = 0; //si es par se asignara el valor 1, y si es impar se asignara 2
		//cuenta del 2 hasta el 999
		while(cont<1000){
			boolean p = (cont%2 == 0);
			if (p == true){
				esparoimpar=1;
			}else{
				esparoimpar = 2;
			}
			switch(esparoimpar){
			case 1:
				contadorPares = contadorPares + cont;
				break;
			case 2:
				contadorImpares = contadorImpares + cont;
				break;
			
			}
			cont++;
			System.out.println("Ahora vamos a sumar el numero: " + cont);
			System.out.println("La suma de los pares es: " + contadorPares + " y la suma de los impares es: " + contadorImpares);
		}
		
	}

}
