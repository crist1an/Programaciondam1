//Simular cien tiradas de dos dados y contar las veces que entre los dos suman 10.
/**
 * 
 */

/**
 * @author usuario
 *
 */
public class eje29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont=0;// el numero de lanzamientos
		int suma=0;
		int dado1;
		int dado2;
		
		while(cont<100){
			dado1= (int) (Math.random()*6+1);////nos genera un numero aletorio del (1 al 6)
			dado2= (int) (Math.random()*6+1);////nos genera un numero aletorio del (1 al 6)
			if(dado1+dado2==10){
				suma++;
					
			}
			cont++;
		}
		System.out.println("Las veces que la suma de los dos dados el resultado es 10 son "+suma);
	}

}
