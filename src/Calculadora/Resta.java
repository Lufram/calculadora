package Calculadora;

/**
 * Esta clase implementar� todos los m�todos que est�n relacionados con la restas de la calculadora.
 * <br>
 * Esta calculadora no admite numeros negativos

 * @author Isa
 * @version 1
 * 
 */

public class Resta {
	
	/**
	 * Resta de dos n�meros reales.
	 * 
	 * @param a variable a la que le restaremos b.
	 * @param b variable que restaremos a la variable a.
	 * @return La resta de a - b
	 */

	/**
	 * Resta de dos n�meros enteros.
	 * 
	 * @param a variable a la que le restaremos b.
	 * @param b variable que restaremos a la variable a.
	 * @return La resta de a - b
	 */
	
	/**
	 * Resta de tres n�meros reales.
	 * 
	 * @param a variable a la que le restaremos b y c.
	 * @param b primera variable que restaremos a la variable a.
	 * @param c segunda variable que restaremos a la variable a.
	 * @return La resta de a - b - c
	 */
	
	public static double restar(double a, double b, double c) {
		double d = a - b - c ;
		return d;
	}
	
	static int acum = 0;

	/**
	 * Resta con valor acumulado.
	 * Este metodo no se puede utilizar por que no no acepta valores negativos
	 * @param a variable que restaremos al acumulado.
	 * @return el valor acumulado menos el valor de a.
	 */
	public static int restar(int a) {
		acum = acum - a ;
		return acum;
	}
	
}
