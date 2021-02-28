TestMultiplicacion
package TestCalc;

import Calculadora.Multiplicacion;
import Calculadora.Cociente;


public class TestCalc {

	public static void main(String[] args) {
		

		System.out.println("Primer método : " + Multiplicacion.multiplicar(3, 6));
		System.out.println("Segundo método : " + Multiplicacion.multiplicar(12, 5));
		System.out.println("Tercer método : " + Multiplicacion.multiplicar(4, 5, 6));
		System.out.println("Cuarto método : " + Multiplicacion.potencia(2, 6));

		System.out.println("Primer método resultado : " + Cociente.dividir(23, 12));
		System.out.println("Primer método resto : " + Cociente.resto(23, 12));
		System.out.println("Segundo método : " + Cociente.dividir(12.2, 3.5));
		System.out.println("Tercer método : " + Cociente.inverso(5));
		System.out.println("Cuarto método : " + Cociente.raiz(9));
	}

}

