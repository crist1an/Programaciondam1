//Cargar en una matriz las notas de los alumnos de un colegio en funci�n del n�mero de cursos (filas) y del n�mero de alumnos por curso (columnas).
/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class eje38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		float notAlu [][], dato = 0;
		notAlu= new float [6][5];
		for (int ncur = 0; ncur < notAlu.length; ncur++) {//numer de curso
			System.out.println("Notas del curso "+(ncur+1));
			for (int nalu = 0; nalu < notAlu[ncur].length; nalu++){ //notas alumno
				dato=0;
				while(dato<1 || dato>10){//limitar que meta nota del 1-10 
					System.out.println(" Nota del curso "+(ncur+1)+" alumno "+(nalu+1));
					dato=teclado.nextFloat();
				}
				notAlu[ncur][nalu]=dato;
				}
			
		}
		for (int ncur = 0; ncur < notAlu.length; ncur++) {// Este for lo utilizamos para imprimir la matriz
			System.out.println("Notas del curso "+(ncur+1));
			for (int nalu = 0; nalu < notAlu[ncur].length; nalu++){ 
		
				System.out.printf(" %5.2f",notAlu[ncur][nalu]);
				}
				System.out.println();
		}
		
	}

}
