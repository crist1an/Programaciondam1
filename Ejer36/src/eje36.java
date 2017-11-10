//Generar una matriz de 4 filas y 5 columnas con números aleatorios entre 1 y 100, e imprimirla.
/**
 * 
 */

/**
 * @author usuario
 *
 */
public class eje36 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int generar[][];
		generar=new int [4][5];
		for (int fila = 0; fila < generar.length; fila++) {
			for (int columna = 0; columna < generar[0].length; columna++) {
				generar [fila][columna]=(int) ((Math.random()*100)+1);
				System.out.printf("%2d ",generar [fila][columna]);
			}
				System.out.println();
			}
		}
	}


