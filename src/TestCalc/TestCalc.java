
package TestCalc;

import Calculadora.Resta;
import Calculadora.Multiplicacion;
import Calculadora.Cociente;
import Calculadora.Suma;

public class TestCalc {


	public static void main(String[] args) {
	
		
		System.out.println("Primer metodo: " + Suma.sumar(5.5, 9.36));
		System.out.println("Segundo metodoo: " + Suma.sumar(96, 54));
		System.out.println("Tercer metodo: " + Suma.sumar(35.42, 2.15, 7.64));	
		System.out.println("Cuarto metodo: " + Suma.sumar(65));		

		System.out.println("Primer metodo : " + Resta.restar(5,4) );
		System.out.println("Segundo metodo : " + Resta.restar(7, 3) );
		System.out.println("Tercer metodo : " + Resta.restar(10, 2, 1) );
		System.out.println("Cuarto metodo : " + Resta.restar(5) );

		System.out.println("Primer metodo : " + Multiplicacion.multiplicar(3, 6));
		System.out.println("Segundo metodo : " + Multiplicacion.multiplicar(12, 5));
		System.out.println("Tercer metodo : " + Multiplicacion.multiplicar(4, 5, 6));
		System.out.println("Cuarto metodo : " + Multiplicacion.potencia(2, 6));

		System.out.println("Primer metodo resultado : " + Cociente.dividir(23, 12));
		System.out.println("Primer metodo resto : " + Cociente.resto(23, 12));
		System.out.println("Segundo metodo : " + Cociente.dividir(12.2, 3.5));
		System.out.println("Tercer metodo : " + Cociente.inverso(5));
		System.out.println("Cuarto metodo : " + Cociente.raiz(9));
	}

}



