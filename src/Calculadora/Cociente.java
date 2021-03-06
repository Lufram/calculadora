package Calculadora;


/**
 * Esta clase implementa todos los metodos que estan relacionados con los cocientes de la calculadora.
 * <br>
 * Esta calculadora no acepta numeros negativos como parametros.
 * 
 * @author Ismael
 * @since version 1
 * 
 */

public class Cociente {

	/**
	 * Division  de dos numeros reales.
	 * <br>
	 * <p> Casos escpeciales</p>
	 * <ul> 
	 *  	<li> Si el primer valor es 0 el resultado sera 0
	 *  	<li> Si el segundo valor es 0 el resultado sera 1
	 *		<li> Si alguno de los valores es negativo levanta la excepcion IncorrectValueException
	 *     	<li> Si alguno de los valores es infinito el resultado sera infinito
	 *     	<li> Si alguno de los valores es NaN el resultado sera NaN. 
	 *     	<li> Si el valor es demasiado grande levanta una excepcion
	 * </ul>    
	 *    
	 * @param a dividendo.
	 * @param b divisor.
	 * @return Producto de a / b
	 */
	public static double dividir(double a, double b) throws IncorrectValueException{
		if (a <= 0) {
			if (a == 0) {
				return 0;
			}else{
				throw new IncorrectValueException();				
			}
	
		} else { 
			if(b <= 0){
				if (b == 0) {
					return 1;				
				}else{
					throw new IncorrectValueException();
				}
			}else {
				double c = a / b ;
				return c;
			}	
		}	
	}
	
	/**
	 * Division  de dos numeros enteros.
	 * <br>
	 * <p> Casos escpeciales</p>
	 * <ul> 
	 *  	<li> Si el primer valor es 0 el resultado sera 0
	 *  	<li> Si el segundo valor es 0 el resultado sera 1
	 *		<li> Si alguno de los valores es negativo levanta la excepcion IncorrectValueException
	 *     	<li> Si alguno de los valores es infinito el resultado sera infinito
	 *     	<li> Si alguno de los valores es NaN el resultado sera NaN.
	 *      <li> Si el valor es demasiado grande levanta una excepcion	
	 * </ul>  
	 * 
	 * @param a dividendo.
	 * @param b divisor.
	 * @return Producto de a * b
	 * Si el resultado de la division el resto no es 0 no devuelve el resto puedes consultar el resto con el metodo {@link resto} 
	 */
	public static int dividir(int a, int b) throws IncorrectValueException{
		if (a <= 0) {
			if (a == 0) {
				return 0;
			}else{
				throw new IncorrectValueException();				
			}
	
		} else { 
			if(b <= 0){
				if (b == 0) {
					return 1;				
				}else{
					throw new IncorrectValueException();
				}
			}else {
				int c = a / b ;
				return c;
			}	
		}	
	}
	
	/**
	 * Resto de la division de dos numeros enteros
	 * <br>
	 * <p> Casos escpeciales</p>
	 * <ul> 
	 *  	<li> Si el primer valor es 0 levanta el resultado sera 0
	 *  	<li> Si el segundo valor es 0 levanta el resultado sera 1
	 *		<li> Si alguno de los valores es negativo levanta la excepcion IncorrectValueException
	 *     	<li> Si alguno de los valores es infinito el resultado sera infinito
	 *     	<li> Si alguno de los valores es NaN el resultado sera NaN.
	 *     	<li> Si el valor es demasiado grande levanta una excepcion	
	 * </ul> 
	 * @param a dividendo
	 * @param b divisor
	 * @return Resto de dividir a/b
	 */
	
	public static int resto(int a, int b) throws IncorrectValueException{
		if (a <= 0) {
			if (a == 0) {
				return 0;
			}else{
				throw new IncorrectValueException();				
			}
	
		} else { 
			if(b <= 0){
				if (b == 0) {
					return 1;				
				}else{
					throw new IncorrectValueException();
				}
			}else {
				int c = a % b ;
				return c;
			}	
		}
	}
	
	
	/**
	 * Inverso de un numero real.
	 * <br>
	 * <p> Casos escpeciales</p>
	 * <ul> 
	 *  	<li> Si el parametro es 0 el resultado sera 0
	 *		<li> Si el parametro es negativo levanta la excepcion IncorrectValueException
	 *     	<li> Si el parametro es infinito el resultado sera infinito
	 *     	<li> Si el parametro es NaN el resultado sera NaN.
	 *    	<li> Si valor es demasiado grande levanta una excepcion	
	 * </ul> 
	 * 
	 * @param a variable a invertir.
	 * @return Inverso de a.
	 */
	public static double inverso(double a) throws IncorrectValueException{
		if (a <= 0) {
			if (a == 0) {
				return 0;
			}else{
				throw new IncorrectValueException();				
			}
		
		} else {
			return 1/a;
		}
	}
	
	
	/**
	 * Raiz de un numero.
	 * <br>
	 * <p> Casos especiales</p>
	 * <ul> 
	 *  	<li> Si el parametro es 0 el resultado sera 1
	 *		<li> Si el parametro es negativo levanta la excepcion IncorrectValueException
	 *     	<li> Si alguno de los valores es infinito el resultado sera infinitov
	 *     	<li> Si el parametro es NaN el resultado sera NaN.
	 *     	<li> Si el numero es demasiado grande levanta una excepcion	
	 * </ul> 
	 * @param a variable a la que realizaremos la raiz cuadrada.
	 * @return Raiz cuadrada de a.
	 */
	public static double raiz(int a) throws IncorrectValueException{
		if (a < 0) {
			throw new IncorrectValueException();
		} else { if (a == 0){
					return 1;
				}else {
					double b = Math.sqrt(a) ;
					return b;	
				}
		}
	
	}
	
	
}
