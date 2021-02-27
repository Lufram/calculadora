package Calculadora;

/**
 * Esta clase implementar� todos los m�todos que est�n relacionados con la multiplicacion de la calculadora.
 * <br>
 * Esta calculadora no admite numeros negativos.

 * @author Javier
 * @since version 1
 * 
 */

public class Multiplicacion {

	/**
	 * Producto de dos n�meros reales.
	 * 
	 * @param a Primer parametro.
	 * @param b Segundo parametro.
	 * @return Producto de a * b
	 */
	
	public static double multiplicar(double a, double b) {
		return a*b;
	}
	
	/**
	 * Producto de dos n�meros enteros.
	 * 
	 * @param a Primer parametro.
	 * @param b Segundo parametro.
	 * @return Producto de a * b
	 */
	public static int multiplicar(int a, int b) {
		return a*b;
	}

	/**
	 * Producto de tres n�meros reales.
	 * 
	 * @param a Primer parametro.
	 * @param b Segundo parametro.
	 * @param c Tercer parametro.
	 * @return El producto de a * b * c
	 */
	
	public static double multiplicar(double a, double b, double c) {
		double d = a * b * c ;
		return d;
	}
	
	/**
	 * Potencia.
	 *
	 * @param a Base
	 * @param b Exponente
	 * @return a elevado a b.
	 */
	
	public static double potencia(int a, int b) {
		double c = a^b ;
		return c;
	}
	
}
