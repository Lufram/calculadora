package Calculadora;

/**
 * Esta clase implementara todos los metodos que estan relacionados con la
 * restas de la calculadora. <br>
 * Esta calculadora no admite numeros negativos
 * 
 * @author
 * @version 1
 * 
 */

public class Resta {

	/**
	 * <p> Resta de dos numeros reales.
	 * 
	 * 
	 * <br>
	 * <p> Casos especiales
	 *
	 * <ul>
	 * <li>Si el valor de a o b son negativo, levanta excepcion
	 * <li>Si los dos valores son negativos, levanta excepcion. 
	 * <li>Si el valor de a es 0, devuelve resultado negativo.
	 * <li>Si el valor de b es 0, devuelve el valor de a.
	 * <li>Si el valor de a o b es infinito, levanta excepcion
	 * <li>Si el valor de a y b es infinito, devuelve NaN.
	 * <li>Si el valor de a o b es NaN, devuelve NaN.
	 * <li>Si el valor de a y b es NaN, devuelve NaN.
	 * <ul>
	 * 
	 * @param a variable a la que le restaremos b.
	 * @param b variable que restaremos a la variable a.
	 * @return La resta de a - b
	 */

	public static double restar(double a, double b) throws IncorrectValueException {
		if (a < 0 || b < 0) {
			throw new IncorrectValueException();
		} else {
			double c = a - b;
			return c;
		}
	}

	/**
	 * <p>Resta de dos numeros enteros.
	 * 
	 * 
	 * <br>
	 * <p>Casos Especiales
	 * 
	 * <ul>
	 * <li>Si el valor de a o b es negativo, levanta excepcion.
     * <li>Si el valor de a y b es negativo, levanta excepcion.
     * <li>Si el valor de a es 0, devuelve resultado -a.
     * <li>Si el valor de b es 0, devuelve el valor de a.
	 * <li>Si el valor a es infinito, devuelve un valor positivo.
	 * <li>Si el valor b es infinito, devuelve un valor negativo.
	 * <li>Si el valor a Y b es infinito, devuelve NaN.
	 * <li>Si el valor a es NaN, devuelve un nÃºmero negativo.
	 * <li>Si el valor b es NaN, devuelve el mismo valor que a.
	 * <li>Si el valor de a y b es NaN, el resultado sera NaN.
	 * <ul>
	 * 	
	 * 
	 * @param a variable a la que le restaremos b.
	 * @param b variable que restaremos a la variable a.
	 * @return La resta de a - b
	 */

	public static int restar(int a, int b) throws IncorrectValueException {

		if (a < 0 || b < 0) {
			throw new IncorrectValueException();
		} else {
			int c = a - b;
			return c;
		}
	}

	/**
	 * <p>Resta de tres numeros reales.
	 * 
	 * <br>
	 * <p>Casos Especiales
	 * 
	 * <ul>
	 * <li>Si alguno de los valores de a , b o c es negativo, levanta excepcion.
	 * <li>Si dos de los valores son negativos, levanta excepcion.
	 * <li>Si el valor de a y b es 0, devuelve un valor negativo.
	 * <li>Si el valor de a y c es 0, devuelve un valor negativo.
	 * <li>Si el valor de b y c es 0, devuelve el valor de a.
	 * <li>Si alguno de los valores de a, b o c es infinito levanta excepcion.
	 * <li>Si el valor A y C es infinito, devuelve NaN.
	 * <li>Si el valor A y B es infinito, devuelve NaN. 
	 * <li>Si el valor B y C es infinito, devuelve un valor infinito.
	 * <li>Si alguno de los valores de A, B o C es NaN, el resultado sera NaN.   
	 * <ul>
	 * 
	 * 
	 * 
	 * @param a variable a la que le restaremos b y c.
	 * @param b primera variable que restaremos a la variable a.
	 * @param c segunda variable que restaremos a la variable a.
	 * @return La resta de a - b - c
	 */

	public static double restar(double a, double b, double c) throws IncorrectValueException {
		if (a < 0 || b < 0 || c < 0) {
			throw new IncorrectValueException();
		} else {
			double d = a - b - c;
			return d;
		}
	}

	/**
	 * <p>Resta con valor acumulado.
	 * 
	 * <br>
	 * <p>Casos Especiales
	 * 
	 * <ul>
	 * <li>Si el valor de a o acum es negativo, levanta excepcion.
     * <li>Si el valor de a y acum es negativo, levanta excepcion
     * <li>Si el valor de acum es 0, el resultado es negativo.
     * <li>Si el valor de a y acum es 0, el resultado es 0.
     * <li>Si el valor de acum es infinito, devuelve un numero positivo.
     * <li>Si el valor de a es infinito, devuelve un numero negativo.
     * <li>Si el valor a y acum es infinito devuelve 0.
     * <li>Si el valor acum es NaN, devuelve un numero negativo.
     * <li>Si el valor de a es NaN, devuelve el valor de acum.
     * <li>Si el valor a y acum es NaN,
	 *
	 * Este metodo no se puede utilizar por que no no acepta valores negativos
	 * 
	 * @param a variable que restaremos al acumulado.
	 * @return el valor acumulado menos el valor de a.
	 */

	public static int acum = 0;

	public static int restar(int a) throws IncorrectValueException {
		if (a < 0) {
			throw new IncorrectValueException();
		} else {
			if (acum < 0) {
				throw new IncorrectValueException();
			} else {
				acum = acum - a;
				return acum;
			}

		}
	}

}
