package Calculadora;

public class TestSuma {

	public static void main(String[] args) {
	

		
		
		System.out.println("Primer método: " + Suma.sumar(5.5, 9.36));
		System.out.println("Segundo método: " + Suma.sumar(96, 54));
		System.out.println("Tercer método: " + Suma.sumar(35.42, 2.15, 7.64));
		

		Suma.acum= 23.5;
		System.out.println("Cuarto método: " + Suma.sumar(65.3));
		
	}

}
