package Calculadora;

//import Calculadora.Suma;

public class TestSuma {

	public static void main(String[] args) {
		
		Suma.acum = 20;
	
		System.out.println("Primer método: " + Suma.sumar(8.3, 7.6));
		System.out.println("Segundo método: " + Suma.sumar(18, 32));
		System.out.println("Tercer método: " + Suma.sumar(41.6, 2.5, 3.75));	
		System.out.println("Cuarto método: " + Suma.sumar(32.5));

	}

}
