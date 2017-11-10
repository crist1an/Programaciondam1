//Simular el lanzamiento de una moneda al aire e imprimir si ha salido cara o cruz.
/**
 * 
 */

/**
 * @author usuario
 *
 */
public class eje28 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cara=2;
		int num= (int) (Math.random()*2+1);//nos genera un numero aletorio que es 1 o 2
		if(num==cara){
			System.out.println("Gana cara.");	
		}
		else{
			System.out.println("Gana cruz.");
		}
	}

}
