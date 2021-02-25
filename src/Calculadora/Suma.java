package Calculadora;


/**
 * Esta clase implementar� todos los m�todos que est�n relacionados con la sumas de la calculadora.
 * <br>
 * Esta calculadora no admite nnumeros negativos
 * 
 * @author Alberto 
 * @since version 1
 * 
 */

public class Suma {	
	
	/**
	 * Suma de dos n�meros reales.
	 * 
	 * @param a Primer parametro de la suma.
	 * @param b Segundo parametro de la suma. 
	 * @return La suma de a + b.
	 */
	
	public static double sumar(double a, double b) {
		double c = a + b ;
		return c;
	}
	
	/**
	 * Suma de dos n�meros enteros.
	 * 
	 * @param a Primer parametro de la suma.
	 * @param b Segundo parametro de la suma.
	 * @return La suma de a + b
	 */
	
	public static int sumar(int a, int b) {
		int c = a + b ;
		return c;
	}
	
	
	/**
	 * Suma de tres n�meros reales.
	 * 
	 * @param a Primer parametro de la suma.
	 * @param b Segundo parametro de la suma.
	 * @param c Tercer parametro de la suma
	 * @return La suma de a + b + c
	 */
	public static double sumar(double a, double b, double c) {
		double d = a + b + c ;
		return d;
	}
	
	/**
	 * Suma con valor acumulado.
	 * 
	 * @param a El valor que sumaremos al acumulador.
	 * @return La suma de a mas el valor acumulado.
	 */
	static int acm = 0;
	
	public static int sumar(int a) {
		return a + acm;
	}
}
