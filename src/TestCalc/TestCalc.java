package TestCalc;

import Calculadora.Multiplicacion;

public class TestCalc {

	public static void main(String[] args) {
		
		System.out.println("Primer m�todo : " + Multiplicacion.multiplicar(3, 6));
		System.out.println("Segundo m�todo : " + Multiplicacion.multiplicar(12, 5));
		System.out.println("Tercer m�todo : " + Multiplicacion.multiplicar(4, 5, 6));
		System.out.println("Cuarto m�todo : " + Multiplicacion.potencia(2, 6));
	}

}
