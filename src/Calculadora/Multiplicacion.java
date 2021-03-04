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
	 * <br>
	 * <ul>Casos escpeciales
	 * 		<li> Si alguno de los parametros es 0, el resultado sera 0
	 * 		<li> Si alguno de los valores es negativo levanta la excepcion IncorrectValueException
	 * 		<li> Si alguno de los valores es infinito, el resultado sera infinito
	 * 		<li> Si alguno de los valores es Nan , el resultado sera Nan
	 * </ul>
	 * 
	 * @param a Primer parametro.
	 * @param b Segundo parametro.
	 * @return Producto de a * b
	 */
	
	public static double multiplicar(double a, double b) {
		if (a < 0 || b < 0) {
			throw new IncorrectValueException();
		} else {
			return a * b;
		}
	}
	
	/**
	 * Producto de dos n�meros enteros.
	 * <br>
	 * <ul>Casos escpeciales
	 * 		<li> Si alguno de los parametros es 0, el resultado sera 0
	 * 		<li> Si alguno de los valores es negativo levanta la excepcion IncorrectValueException
	 * 		<li> Si alguno de los valores es infinito, el resultado sera infinito
	 * 		<li> Si alguno de los valores es Nan , el resultado sera Nan
	 * </ul>
	 * 
	 * @param a Primer parametro.
	 * @param b Segundo parametro.
	 * @return Producto de a * b
	 */
	public static int multiplicar(int a, int b)  {
		if (a < 0 || b < 0) {
			throw new IncorrectValueException();
		} else {
			return a * b;
		}
	}

	/**
	 * Producto de tres n�meros reales.
	 * <br>
	 * <ul>Casos escpeciales
	 * 		<li> Si alguno de los parametros es 0, el resultado sera 0
	 * 		<li> Si alguno de los valores es negativo levanta la excepcion IncorrectValueException
	 * 		<li> Si alguno de los valores es infinito, el resultado sera infinito 
	 * 		<li> Si alguno de los valores es Nan , el resultado sera Nan
	 * </ul>
	 * 
	 * @param a Primer parametro.
	 * @param b Segundo parametro.
	 * @param c Tercer parametro.
	 * @return El producto de a * b * c
	 */
	
	public static double multiplicar(double a, double b, double c) {
		if (a < 0 || b < 0 || c < 0) {
			throw new IncorrectValueException();
		} else {
			double d = a * b * c;
			return d;
		}
	}
	
	/**
	 * Potencia.
	 *<br>
	 * <ul>Casos escpeciales
	 * 		<li> Si alguno de los parametros es 0, el resultado sera 0
	 * 		<li> Si alguno de los valores es negativo levanta la excepcion IncorrectValueException
	 * 		<li> Si alguno de los valores es infinito, el resultado sera infinito
	 * 		<li> Si alguno de los valores es Nan , el resultado sera Nan
	 * 		<li> Si los numeros pasados son muy grandes levanta una excepcion
	 * </ul>
	 * 
	 * @param a Base
	 * @param b Exponente
	 * @return a elevado a b.
	 */
	
	public static double potencia(int a, int b) {
		if (a < 0 || b < 0) {
			throw new IncorrectValueException();
		} else {
			double c = a ^ b;
			return c;
		}

	}
	
}
