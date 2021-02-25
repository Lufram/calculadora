package Calculadora;

/**
 * Esta clase implementar� todos los m�todos que est�n relacionados con los cocientes de la calculadora.
 * <br>
 * Esta calculadora no admite numeros negativos ni 0 como argumentos.
 * @author Ismael
 * @since version 1
 * 
 */

public class Cociente {

	/**
	 * Divisi�n  de dos n�meros reales.
	 * 
	 * @param a dividendo.
	 * @param b divisor.
	 * @return Producto de a / b
	 */
	public static double dividir(double a, double b) {
		double c = a / b ;
		return c;
	}
	/**
	 * Divisi�n  de dos n�meros enteros.
	 * 
	 * @param a dividendo.
	 * @param b divisor.
	 * @return Producto de a * b
	 * Si el resultado de la division el resto no es 0 no devuelve el resto puedes consultar el resto con el metodo {@link resto} 
	 */
	public static int dividir(int a, int b) {
		int c = a / b ;
		return c;
	}
	
	/**
	 * Resto de la divisi�n de dos numeros enteros
	 * @param a dividendo
	 * @param b divisor
	 * @return Resto de dividir a/b
	 */
	
	public static int resto(int a, int b) {
		int c = a%b;
		return c;
	}
	
	
	/**
	 * Inverso de un n�mero real.
	 * 
	 * @param a variable a invertir.
	 * @return Inverso de a.
	 */
	public static double inverso(double a) {
		return 1/a;
	}
	
	
	/**
	 * Ra�z de un n�mero.
	 *
	 * @param a variable a la que realizaremos la raiz cuadrada.
	 * @return Raiz cuadrada de a.
	 */
	
	
}
