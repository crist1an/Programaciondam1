//Introducir un n�mero menor de 5000 y pasarlo a numero romano.

/**
 * 
 */

/**
 * @author usuario
 *
 */
import java.util.Scanner;
public class eje25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num1 = 0;
		int cont = 1;
		String romanos = "";
		int miles=0;
		int centenas=0;
		int decenas=0;
		System.out.println("dame un n�mero:");
		num1=teclado.nextInt();
		while(num1>5000 || num1<0){
			System.out.println("dame un n�mero correcto:");
			num1=teclado.nextInt();
			
		}
		miles=num1/1000;
		switch(miles){
		case 1: romanos="M";
		break;
		case 2: romanos="MM";
		break;
		case 3: romanos="MMM";
		break;
		case 4: romanos="MMMM";
		}
		num1=num1-1000*miles;
		centenas=num1/100;
		switch(centenas){
		case 1: romanos=romanos+"C";
		break;
		case 2: romanos=romanos+"CC";
		break;
		case 3: romanos=romanos+"CCC";
		break;
		case 4: romanos=romanos+"CD";
		break;
		case 5: romanos=romanos+"D";
		break;
		case 6: romanos=romanos+"DC";
		break;
		case 7: romanos=romanos+"DCC";
		break;
		case 8: romanos=romanos+"DCCC";
		break;
		case 9: romanos=romanos+"CM";
		
		}
		num1=num1-100*centenas;
		decenas=num1/10;
		switch(decenas){
		case 1: romanos=romanos+"X";
		break;
		case 2: romanos=romanos+"XX";
		break;
		case 3: romanos=romanos+"XXX";
		break;
		case 4: romanos=romanos+"XL";
		break;
		case 5: romanos=romanos+"L";
		break;
		case 6: romanos=romanos+"LX";
		break;
		case 7: romanos=romanos+"LXX";
		break;
		case 8: romanos=romanos+"LXXX";
		break;
		case 9: romanos=romanos+"XC";
		
		}
		num1=num1-10*decenas;
		switch(num1){
		case 1: romanos=romanos+"I";
		break;
		case 2: romanos=romanos+"II";
		break;
		case 3: romanos=romanos+"III";
		break;
		case 4: romanos=romanos+"IV";
		break;
		case 5: romanos=romanos+"V";
		break;
		case 6: romanos=romanos+"VI";
		break;
		case 7: romanos=romanos+"VII";
		break;
		case 8: romanos=romanos+"VIII";
		break;
		case 9: romanos=romanos+"IX";
		
		}
		System.out.println(romanos);
	}

}
