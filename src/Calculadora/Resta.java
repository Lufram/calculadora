package Calculadora;

/**
 * Esta clase implementará todos los métodos que están relacionados con la restas de la calculadora.

 * Esta calculadora no admite numeros negativos

 * @author Alberto, Javier, Ismael
 * @version 1
 * 
 */

public class Resta {
	
	/**
	 * Resta de dos números reales.
	 * 
	 * @param a variable a la que le restaremos b.
	 * @param b variable que restaremos a la variable a.
	 * @return La resta de a - b
	 */

	
	public static double restar(double a, double b) {
		double c = a - b ;
		return c;
	}

	/**
   * Resta de dos numeros enteros.
   *
	 * @param a variable a la que le restaremos b.
	 * @param b variable que restaremos a la variable a.
	 * @return La resta de a - b
	 */
  *

	
	public static int restar(int a, int b) {
		int c = a - b ;
		return c;
	}
	
	/**
	 * Resta de tres números reales.
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
	
        	

	/**
	 * Resta con valor acumulado.
	 * Este metodo no se puede utilizar por que no no acepta valores negativos
	 * @param a variable que restaremos al acumulado.
	 * @return el valor acumulado menos el valor de a.
	 */
  
  static int acum = 0;
	public static int restar(int a) {
		acum = acum - a ;
		return acum;
	}

}
