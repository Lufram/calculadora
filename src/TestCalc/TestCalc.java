package TestCalc;

import Calculadora.Multiplicacion;

public class TestCalc {

	public static void main(String[] args) {
		
		System.out.println("Primer método : " + Multiplicacion.multiplicar(3, 6));
		System.out.println("Segundo método : " + Multiplicacion.multiplicar(12, 5));
		System.out.println("Tercer método : " + Multiplicacion.multiplicar(4, 5, 6));
		System.out.println("Cuarto método : " + Multiplicacion.potencia(2, 6));
	}

}
