package Calculadora;

/**
 * Esta clase implementaria todos los metodos que estan relacionados con la multiplicacion de la calculadora.
 * <br>
 * Esta calculadora no admite numeros negativos.

 * @author Javier
 * @since version 1
 * 
 */

public class Multiplicacion {

	/**
	 * Producto de dos numeros reales.
	 * <br>
	 * <p> Casos escpeciales</p>
	 * <ul>
	 * 		
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
	 * Producto de dos numeros enteros.
	 * <br>
	 * <p> Casos escpeciales</p>
	 * <ul>
	 * 		<li> Si alguno de los parametros es 0, el resultado sera 0
	 * 		<li> Si alguno de los valores es negativo levanta la excepcion IncorrectValueException
	 * 		<li> Si alguno de los valores es infinito, el resultado sera un numero positivo
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
	 * Producto de tres numeros reales.
	 * <br>
	 * <p> Casos escpeciales</p>
	 * <ul>
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
	 *<p> Casos escpeciales</p>
	 * <ul>
	 * 		<li> Si el parametro a es 0, el resultado sera 0.
	 * 		<li> Si el parametro b es 0, el resultado sera 1.
	 * 		<li> Si los dos parametros son 0, el resultado sera 1. 
	 * 		<li> Si alguno de los valores es negativo levanta la excepcion IncorrectValueException
	 * 		<li> Si alguno de los valores es infinito, el resultado sera infinito
	 * 		<li> Si alguno de los valores es Nan , el resultado sera Nan
	 * </ul>
	 * 
	 * @param a Base
	 * @param b Exponente
	 * @return a elevado a b.
	 */
	
	public static double potencia(double a, double b) {
		if (a < 0 || b < 0) {
			throw new IncorrectValueException();
		} else {
			double c = Math.pow(a, b);
			return c;
		}

	}
	
}
