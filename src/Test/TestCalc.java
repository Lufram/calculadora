  
package Test;

import Calculadora.Multiplicacion;
import Calculadora.Cociente;

public class TestCalc {

	public static void main(String[] args) {
		
		System.out.println("Primer m�todo : " + Cociente.dividir(23, 12));
		System.out.println("Primer m�todo : " + Cociente.resto(23, 12));
		System.out.println("Segundo m�todo : " + Cociente.dividir(12.2, 3.5));
		System.out.println("Tercer m�todo : " + Cociente.inverso(5));
		System.out.println("Cuarto m�todo : " + Cociente.raiz(9));
	}

}