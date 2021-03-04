
package TestCalc;

import Calculadora.Resta;
import Calculadora.Multiplicacion;
import Calculadora.Cociente;
import Calculadora.Suma;

public class TestCalc {


	public static void main(String[] args) {
	
		
		System.out.println("Primer método: " + Suma.sumar(5.5, 9.36));
		System.out.println("Segundo método: " + Suma.sumar(96, 54));
		System.out.println("Tercer método: " + Suma.sumar(35.42, 2.15, 7.64));	
		System.out.println("Cuarto método: " + Suma.sumar(65));		

		System.out.println("Primer método : " + Resta.restar(5,4) );
		System.out.println("Segundo método : " + Resta.restar(7, 3) );
		System.out.println("Tercer método : " + Resta.restar(10, 2, 1) );
		System.out.println("Cuarto método : " + Resta.restar(5) );

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



