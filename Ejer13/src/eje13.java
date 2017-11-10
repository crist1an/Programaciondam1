//Imprimir y contar los números que son múltiplos de 2 o de 3 que hay entre 1 y 100

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class eje13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int multi2=0;
		int multi3=0;
		int cont=1;
		while(cont<=100){
			if(cont%2==0){
				multi2++;
				System.out.println(cont);
				
			}
			if(cont%3==0){
				multi3++;
				System.out.println(cont);
			}
			
			cont++;
			
		}
		System.out.println(multi2+ "son multiplos de 2");
		System.out.println(multi3+ "son multiplos de 3");
	}

}
