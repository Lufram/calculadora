  
package Test;

import Calculadora.Multiplicacion;
import Calculadora.Cociente;

public class TestCalc {

	public static void main(String[] args) {
		
		System.out.println("Primer método : " + Cociente.dividir(23, 12));
		System.out.println("Primer método : " + Cociente.resto(23, 12));
		System.out.println("Segundo método : " + Cociente.dividir(12.2, 3.5));
		System.out.println("Tercer método : " + Cociente.inverso(5));
		System.out.println("Cuarto método : " + Cociente.raiz(9));
	}

}