package TestCalc;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Calculadora.IncorrectValueException;
import Calculadora.Resta;

class RestaTest {

	private static final double NaN = 0;

	/**
	 * TEST DEL METODO RESTAR (DOUBLE A, DOUBLE B)
	 */
	
	/**
	 * Si el valor a es negativo levanta excepcion
	 */
	@Test
	void testRestarDoubleDoubleNegativoA() {
		// 1 Arrange
		double a = -9;
		double b = 7;
		try {
			double actual = Resta.restar(a, b);
			fail("Debería saltar una excepcion");
		} catch (IncorrectValueException e) {
			
		}
	}
	
	/**
	 * Si el valor b es negativo levanta excepcion
	 */
	@Test
	void testRestarDoubleDoubleNegativoB() {
		// 1 Arrange
		double a = 9;
		double b = -7;
		// 2 Act y Assert
		try {
			double actual = Resta.restar(a, b);
			fail("Debería saltar una excepcion");
		} catch (IncorrectValueException e) {
			
		}
	}
	
	/**
	 * Si los dos valores son negativos levanta excepcion
	 */
	@Test
	void testRestarDoubleDoubleNegativoAB() {
		// 1 Arrange
		double a = -9;
		double b = -7;
		// 2 Act y Assert
		try {
			double actual = Resta.restar(a, b);
			fail("Debería saltar una excepcion");
		} catch (IncorrectValueException e) {
			
		}
	}
	
	/**
	 * Si el valor de a es 0 devuelve resultado negativo.
	 */
	@Test
	void testRestarDoubleDoubleParamAZero() {
		// 1 Arrange 
		double a = 0;
		double b = 7;
		double expected = -7;
		// 2 Act
		double actual = Resta.restar(a, b);
		// 3 Assert
		assertEquals(expected, actual, "El resultado tiene que ser -7");
	}

	/**
	 * Si el valor de b es 0, devuelve el valor de a.
	 */
	@Test
	void testRestarDoubleDoubleParamBZero() {
		// 1 Arrange 
		double a = 7;
		double b = 0;
		double expected = 7;
		// 2 Act
		double actual = Resta.restar(a, b);
		// 3 Assert
		assertEquals(expected, actual, "El resultado tiene que ser 7");
	}
	
	/**
	 * Si el valor a es infinito devuelve un valor infinito.
	 */
	@Test
	void testRestarDoubleDoubleInfinityA() {
		// 1 Arrange
		double a = Double.POSITIVE_INFINITY;
		double b = 7;
		double expected = Double.POSITIVE_INFINITY;
		// 2 a
		double actual = Resta.restar(a, b);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser un infinito negativo");
	}
	
	/**
	 * Si el valor b es infinito devuelve un valor infinito.
	 */
	@Test
	void testRestarDoubleDoubleInfinityB() {
		// 1 Arrange
		double a = 7;
		double b = Double.POSITIVE_INFINITY;
		double expected = Double.NEGATIVE_INFINITY;
		// 2 a
		double actual = Resta.restar(a, b);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser un infinito negativo");
	}
	
	/**
	 * Si el valor a Y b es infinito devuelve NaN.
	 */
	@Test
	void testRestarDoubleDoubleInfinityAB() {
		// 1 Arrange
		double a = Double.POSITIVE_INFINITY;
		double b = Double.POSITIVE_INFINITY;
		double expected = Double.NaN;
		// 2 a
		double actual = Resta.restar(a, b);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser NaN");
	}
	
	/**
	 * Si el valor a es NaN devuelve NaN.
	 */
	@Test
	void testRestarDoubleDoubleNanA() {
		// 1 Arrange
		double a = Double.NaN;
		double b = 7;
		double expected = Double.NaN;
		// 2 a
		double actual = Resta.restar(a, b);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser NaN");
	}
	
	/**
	 * Si el valor b es NaN devuelve NaN.
	 */
	@Test
	void testRestarDoubleDoubleNanB() {
		// 1 Arrange
		double a = 7;
		double b = Double.NaN;
		double expected = Double.NaN;
		// 2 a
		double actual = Resta.restar(a, b);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser NaN");
	}
	
	/**
	 * Si el valor a Y b es NaN devuelve NaN.
	 */
	@Test
	void testRestarDoubleDoubleNanAB() {
		// 1 Arrange
		double a = Double.NaN;
		double b = Double.NaN;
		double expected = Double.NaN;
		// 2 a
		double actual = Resta.restar(a, b);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser NaN");
	}
	
	/**
	 * TEST DEL METODO RESTAR (INT A, INT B)
	 */
	
	/**
	 * Si el valor a es negativo levanta excepcion
	 */
	@Test
	void testRestarIntIntNegativoA() {
		// 1 Arrange
		int a = -9;
		int b = 7;
		// 2 Act y Assert
		try {
			int actual = Resta.restar(a, b);
			fail("Debería saltar una excepcion");
		} catch (IncorrectValueException e) {
			
		}
	}
	
	/**
	 * Si el valor b es negativo levanta excepcion
	 */
	@Test
	void testRestarIntIntNegativoB() {
		// 1 Arrange
		int a = 9;
		int b = -7;
		// 2 Act y Assert
		try {
			int actual = Resta.restar(a, b);
			fail("Debería saltar una excepcion");
		} catch (IncorrectValueException e) {
			
		}
	}
	
	/**
	 * Si los dos valores son negativos levanta excepcion
	 */
	@Test
	void testRestarIntIntNegativoAB() {
		// 1 Arrange
		double a = -9;
		double b = -7;
		// 2 Act y Assert
		try {
			double actual = Resta.restar(a, b);
			fail("Debería saltar una excepcion");
		} catch (IncorrectValueException e) {
			
		}
	}
	
	/**
	 * Si el valor de a es 0 el resultado es -0
	 */
	@Test
	void testRestarIntIntParamAZero() {
		// 1 Arrange 
		int a = 0;
		int b = 7;
		int expected = -7;
		// 2 Act
		int actual = Resta.restar(a, b);
		// 3 Assert
		assertEquals(expected, actual, "El resultado tiene que ser -7");
	}
	
	/**
	 * Si el valor de b es 0 devuelve el valor de a
	 */
	@Test
	void testRestarIntIntParamBZero() {
		// 1 Arrange 
		int a = 7;
		int b = 0;
		int expected = 7;
		// 2 Act
		int actual = Resta.restar(a, b);
		// 3 Assert
		assertEquals(expected, actual, "El resultado tiene que ser 7");
	}

	/**
	 * Si el valor a es infinito devuelve un valor positivo.
	 */
	@Test
	void testRestarIntIntInfinityA() {
		// 1 Arrange
		int a = (int) Double.POSITIVE_INFINITY;
		int b = 7;
		int expected = 2147483640;
		// 2 a
		int actual = Resta.restar(a, b);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser el máximo de int - 7 = 2147483640");
	}
	
	/**
	 * Si el valor b es infinito devuelve un valor negativo.
	 */
	@Test
	void testRestarIntIntInfinityB() {
		// 1 Arrange
		int a = 7;
		int b = (int) Double.POSITIVE_INFINITY;
		int expected = -2147483640;
		// 2 a
		double actual = Resta.restar(a, b);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser el 7 - el maximo de int = -2147483640");
	}
	
	/**
	 * Si el valor a Y b es infinito devuelve NaN.
	 */
	@Test
	void testRestarIntIntInfinityAB() {
		// 1 Arrange
		double a = Double.POSITIVE_INFINITY;
		double b = Double.POSITIVE_INFINITY;
		double expected = Double.NaN;
		// 2 a
		double actual = Resta.restar(a, b);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser NaN");
	}
	
	/**
	 * Si el valor a es NaN devuelve un número negativo.
	 */
	@Test
	void testRestarIntIntNanA() {
		// 1 Arrange
		int a = (int) Double.NaN;
		int b = 7;
		int expected = -7;
		// 2 a
		int actual = Resta.restar(a, b);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser -7");
	}
	
	/**
	 * Si el valor b es NaN devuelve el mismo valor que a.
	 */
	@Test
	void testRestarIntIntNanB() {
		// 1 Arrange
		int a = 7;
		int b = (int) Double.NaN;
		int expected = 7;
		// 2 a
		double actual = Resta.restar(a, b);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser 7");
	}
	

	/**
	 * Si el valor a Y b es NaN devuelve NaN.
	 */
	@Test
	void testRestarIntIntNanAB() {
		// 1 Arrange
		double a = Double.NaN;
		double b = Double.NaN;
		double expected = Double.NaN;
		// 2 a
		double actual = Resta.restar(a, b);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser NaN");
	}
	
	/**
	 * TEST DEL METODO RESTAR (DOUBLE A, DOUBLE B, DOUBLE C)
	 */
	
	/**
	 * Si el valor a es negativo levanta excepcion
	 */
	@Test
	void testRestarTresDoubleNegativoA() {
		// 1 Arrange
		double a = -9;
		double b = 7;
		double c = 1;
		// 2 Act y Assert
		try {
			double actual = Resta.restar(a, b, c);
			fail("Debería saltar una excepcion");
		} catch (IncorrectValueException e) {
			
		}
	}
	
	/**
	 * Si el valor b es negativo levanta excepcion
	 */
	@Test
	void testRestarTresDoubleNegativoB() {
		// 1 Arrange
		double a = 9;
		double b = -7;
		double c = 1;
		// 2 Act y Assert
		try {
			double actual = Resta.restar(a, b, c);
			fail("Debería saltar una excepcion");
		} catch (IncorrectValueException e) {
			
		}
	}
	
	/**
	 * Si el valor c es negativo levanta excepcion
	 */
	@Test
	void testRestarTresDoubleNegativoC() {
		// 1 Arrange
		double a = 9;
		double b = 7;
		double c = -1;
		// 2 Act y Assert
		try {
			double actual = Resta.restar(a, b, c);
			fail("Debería saltar una excepcion");
		} catch (IncorrectValueException e) {
			
		}
	}
	
	/**
	 * Si el valor a y b son negativos levanta excepcion
	 */
	@Test
	void testRestarTresDoubleNegativoAB() {
		// 1 Arrange
		double a = -9;
		double b = -7;
		double c = 1;
		// 2 Act y Assert
		try {
			double actual = Resta.restar(a, b, c);
			fail("Debería saltar una excepcion");
		} catch (IncorrectValueException e) {
			
		}
	}
	
	/**
	 * Si el valor c y b son negativos levanta excepcion
	 */
	@Test
	void testRestarTresDoubleNegativoCB() {
		// 1 Arrange
		double a = 9;
		double b = -7;
		double c = -1;
		// 2 Act y Assert
		try {
			double actual = Resta.restar(a, b, c);
			fail("Debería saltar una excepcion");
		} catch (IncorrectValueException e) {
			
		}
	}
	
	/**
	 * Si el valor a y c son negativos levanta excepcion
	 */
	@Test
	void testRestarTresDoubleNegativoAC() {
		// 1 Arrange
		double a = -9;
		double b = 7;
		double c = -1;
		// 2 Act y Assert
		try {
			double actual = Resta.restar(a, b, c);
			fail("Debería saltar una excepcion");
		} catch (IncorrectValueException e) {
			
		}
	}
	
	/**
	 * Si el valor de a y b es 0 devuelve un valor negativo
	 */
	@Test
	void testRestarTresDoubleABZero() {
		// 1 Arrange 
		double a = 0;
		double b = 0;
		double c = 7;
		double expected = -7;
		// 2 Act
		double actual = Resta.restar(a, b, c);
		// 3 Assert
		assertEquals(expected, actual, "El resultado tiene que ser -7");
	}
	
	/**
	 * Si el valor de a y c es 0 devuelve un valor negativo
	 */
	@Test
	void testRestarTresDoubleACZero() {
		// 1 Arrange 
		double a = 0;
		double b = 7;
		double c = 0;
		double expected = -7;
		// 2 Act
		double actual = Resta.restar(a, b, c);
		// 3 Assert
		assertEquals(expected, actual, "El resultado tiene que ser -7");
	}
	
	/**
	 * Si el valor de b y c es 0 devuelve el valor de a
	 */
	@Test
	void testRestarTresDoubleBCZero() {
		// 1 Arrange 
		double a = 7;
		double b = 0;
		double c = 0;
		double expected = 7;
		// 2 Act
		double actual = Resta.restar(a, b, c);
		// 3 Assert
		assertEquals(expected, actual, "El resultado tiene que ser 7");
	}
	
	/**
	 * Si el valor a es infinito devuelve un valor infinito.
	 */
	@Test
	void testRestarIntIntIntInfinityA() {
		// 1 Arrange
		double a = Double.POSITIVE_INFINITY;
		double b = 7;
		double c = 8;
		double expected = Double.POSITIVE_INFINITY;
		// 2 a
		double actual = Resta.restar(a, b, c);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser un valor infinito");
	}
	
	/**
	 * Si el valor b es infinito devuelve un valor infinito.
	 */
	@Test
	void testRestarIntIntIntInfinityB() {
		// 1 Arrange
		double a = 7;
		double b = Double.POSITIVE_INFINITY;
		double c = 8;
		double expected = Double.NEGATIVE_INFINITY;
		// 2 a
		double actual = Resta.restar(a, b, c);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser un infinito negativo");
	}
	
	/**
	 * Si el valor C es infinito devuelve un valor infinito.
	 */
	@Test
	void testRestarIntIntIntInfinityC() {
		// 1 Arrange
		double a = 7;
		double b = 8;
		double c = Double.POSITIVE_INFINITY;
		double expected = Double.NEGATIVE_INFINITY;
		// 2 a
		double actual = Resta.restar(a, b, c);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser un infinito negativo");
	}
	
	/**
	 * Si el valor A y C es infinito devuelve NaN.
	 */
	@Test
	void testRestarIntIntIntInfinityAC() {
		// 1 Arrange
		double a = Double.POSITIVE_INFINITY;
		double b = 8;
		double c = Double.POSITIVE_INFINITY;
		double expected = Double.NaN;
		// 2 a
		double actual = Resta.restar(a, b, c);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser un Nan");
	}
	
	/**
	 * Si el valor B y C es infinito devuelve un valor infinito.
	 */
	@Test
	void testRestarIntIntIntInfinityBC() {
		// 1 Arrange
		double a = 8;
		double b = Double.POSITIVE_INFINITY;
		double c = Double.POSITIVE_INFINITY;
		double expected = Double.NEGATIVE_INFINITY;
		// 2 a
		double actual = Resta.restar(a, b, c);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser un infinito negativo");
	}
	
	/**
	 * Si el valor B y A es infinito devuelve NaN.
	 */
	@Test
	void testRestarIntIntIntInfinityAB() {
		// 1 Arrange
		double a = Double.POSITIVE_INFINITY;
		double b = Double.POSITIVE_INFINITY;
		double c = 8;
		double expected = Double.NaN;
		// 2 a
		double actual = Resta.restar(a, b, c);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser NaN");
	}
	
	/**
	 * Si el valor a es NaN devuelve NaN.
	 */
	@Test
	void testRestarIntIntIntNaNA() {
		// 1 Arrange
		double a = Double.NaN;
		double b = 7;
		double c = 8;
		double expected = Double.NaN;
		// 2 a
		double actual = Resta.restar(a, b, c);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser NaN");
	}
	
	/**
	 * Si el valor b es NaN devuelve NaN.
	 */
	@Test
	void testRestarIntIntIntNanB() {
		// 1 Arrange
		double a = 7;
		double b = Double.NaN;
		double c = 8;
		double expected = Double.NaN;
		// 2 a
		double actual = Resta.restar(a, b, c);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser NaN");
	}
	
	/**
	 * Si el valor C es NaN devuelve NaN.
	 */
	@Test
	void testRestarIntIntIntNanC() {
		// 1 Arrange
		double a = 7;
		double b = 8;
		double c = Double.NaN;
		double expected = Double.NaN;
		// 2 a
		double actual = Resta.restar(a, b, c);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser NaN");
	}
	
	/**
	 * Si el valor A y C es NaN devuelve NaN.
	 */
	@Test
	void testRestarIntIntIntNaNAC() {
		// 1 Arrange
		double a = Double.NaN;
		double b = 8;
		double c = Double.NaN;
		double expected = Double.NaN;
		// 2 a
		double actual = Resta.restar(a, b, c);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser un Nan");
	}
	
	/**
	 * Si el valor B y C es NaN devuelve NaN.
	 */
	@Test
	void testRestarIntIntIntNanBC() {
		// 1 Arrange
		double a = 8;
		double b = Double.NaN;
		double c = Double.NaN;
		double expected = Double.NaN;
		// 2 a
		double actual = Resta.restar(a, b, c);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser NaN");
	}

	/**
	 * Si el valor B y A es NaN devuelve NaN.
	 */
	@Test
	void testRestarIntIntIntNanAB() {
		// 1 Arrange
		double a = Double.NaN;
		double b = Double.NaN;
		double c = 8;
		double expected = Double.NaN;
		// 2 a
		double actual = Resta.restar(a, b, c);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser NaN");
	}
	
	/**
	 * TEST DEL MÉTODO RESTAR (INT A)
	 */
	
	/**
	 * Si el valor a es negativo levanta excepcion
	 */
	@Test
	void testRestarIntNegativoA() {
		// 1 Arrange
		int a = -9;
		// 2 Act y Assert
		try {
			int actual = Resta.restar(a);
			fail("Debería saltar una excepcion");
		} catch (IncorrectValueException e) {
			
		}
	}
	
	/**
	 * Si el valor acum es negativo levanta excepcion
	 */
	@Test
	void testRestarIntNegativoAcum() {
		// 1 Arrange
		Resta.acum = -10;
		int a = 9;
		// 2 Act y Assert
		try {
			int actual = Resta.restar(a);
			fail("Debería saltar una excepcion");
		} catch (IncorrectValueException e) {
			
		}
	}
	
	/**
	 * Si el valor acum y a es negativo levanta excepcion
	 */
	@Test
	void testRestarIntNegativoAcumA() {
		// 1 Arrange
		Resta.acum = -10;
		int a = -9;
		// 2 Act y Assert
		try {
			int actual = Resta.restar(a);
			fail("Debería saltar una excepcion");
		} catch (IncorrectValueException e) {
			
		}
	}
	
	/**
	 * Si el valor acum es 0 el resultado es negativo
	 */
	@Test
	void testRestarIntParamAcumZero() {
		// 1 Arrange
		Resta.acum = 0;
		int a = 10;
		int expected = -10;
		// 2 Act 
		int actual = Resta.restar(a);
		// 3 Assert
		assertEquals(expected, actual, "El resultado tiene que ser -10");	
	}
	
	/**
	 * Si el valor de a y acum es 0 el resultado es 0
	 */
	@Test
	void testRestarIntParamAcumAZero() {
		// 1 Arrange
		Resta.acum = 0;
		int a = 0;
		int expected = 0;
		// 2 Act 
		int actual = Resta.restar(a);
		// 3 Assert
		assertEquals(expected, actual, "El resultado tiene que ser 0");	
	}
	
	/**
	 * Si el valor acum es infinito devuelve un numero positivo.
	 */
	@Test
	void testRestarIntInfinityAcum() {
		// 1 Arrange
		Resta.acum = (int) Double.POSITIVE_INFINITY;
				int a = 1;
		int expected = 2147483646;		
		// 2 a
		int actual = Resta.restar(a);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser el maximo de integer - 1 = 2147483646");
	}
	
	/**
	 * Si el valor a es infinito devuelve un numero negativo.
	 */
	@Test
	void testRestarIntInfinityA() {
		// 1 Arrange
		Resta.acum = 1;
				int a = (int) Double.POSITIVE_INFINITY;
		int expected = -2147483646;		
		// 2 a
		int actual = Resta.restar(a);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser 1 - el maximo de integer = -2147483646");
	}
	
	/**
	 * Si el valor a y acum es infinito devuelve 0.
	 */
	@Test
	void testRestarIntInfinityAAcum() {
		// 1 Arrange
		Resta.acum = (int) Double.POSITIVE_INFINITY;
				int a = (int) Double.POSITIVE_INFINITY;
		int expected = 0;		
		// 2 a
		int actual = Resta.restar(a);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser 0");
	}
	
	/**
	 * Si el valor acum es NaN devuelve un numero negativo.
	 */
	@Test
	void testRestarIntNanAcum() {
		// 1 Arrange
		Resta.acum = (int) Double.NaN;
				int a = 1;
		int expected = -1;		
		// 2 a
		int actual = Resta.restar(a);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser -1");
	}
	
	/**
	 * Si el valor a es NaN devuelve el valor del acumulador.
	 */
	@Test
	void testRestarIntNanA() {
		// 1 Arrange
		Resta.acum = 1;
				int a = (int) Double.NaN;
		int expected = 1;		
		// 2 a
		int actual = Resta.restar(a);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser 1");
	}
	
	/**
	 * Si el valor a y acum es NaN devuelve 0.
	 */
	@Test
	void testRestarIntNanAAcum() {
		// 1 Arrange
		Resta.acum = (int) Double.NaN;
				int a = (int) Double.NaN;
		int expected = 0;		
		// 2 a
		int actual = Resta.restar(a);
		// 3 a
		assertEquals(expected, actual, "El resultado tiene que ser 0");
	}

}
