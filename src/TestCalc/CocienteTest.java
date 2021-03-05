package TestCalc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Calculadora.Cociente;
import Calculadora.IncorrectValueException;

class CocienteTest {

	// Division de dos numeros decimales.

	/**
	 * Si el primer valor es 0 el resultado sera 0
	 */
	@Test
	void testDividirDoubleDouble_A() {

		// 1 Arrange
		double a = 0;
		double b = 5.5;

		double expected = Cociente.dividir(a, b);
		// 2 Act
		double actual = Cociente.dividir(a, b);
		// 3 Assert

		assertEquals(expected, actual, "El resultado tiene que ser ");
	}

	/**
	 * Si el segundo valor es 0 el resultado sera 1
	 */

	@Test
	void testDividirDoubleDouble_B() {

		// 1 Arrange
		double a = 5.5;
		double b = 0;
		double expected = Cociente.dividir(a, b);
		// 2 Act
		double actual = Cociente.dividir(a, b);
		// 3 Assert

		assertEquals(expected, actual, "El resultado tiene que ser ");
	}

	/**
	 * Si alguno de los valores es negativo levanta la excepcion
	 * IncorrectValueException
	 */

	@Test
	void testDividirDoubleDouble_C() {

		// 1 Arrange
		double a = 8.5;
		double b = -5.5;
		try {

			// 2 Act
			double actual = Cociente.dividir(a, b);
			// 3 Assert
			fail("Tiene que saltar la excepciÃ³n");

		} catch (IncorrectValueException e) {
		}

	}

	// Division de dos numeros enteros.

	/**
	 * Si el primer valor es 0 el resultado sera 0
	 */

	@Test
	void testDividirIntInt_A() {

		// 1 Arrange
		double a = 0;
		double b = 5;

		double expected = Cociente.dividir(a, b);
		// 2 Act
		double actual = Cociente.dividir(a, b);
		// 3 Assert
		assertEquals(expected, actual, "El resultado tiene que ser ");
	}

	/**
	 * Si el segundo valor es 0 el resultado sera 1
	 */

	@Test
	void testDividirIntInt_B() {

		// 1 Arrange
		double a = 20;
		double b = 0;

		double expected = Cociente.dividir(a, b);
		// 2 Act
		double actual = Cociente.dividir(a, b);
		// 3 Assert
		assertEquals(expected, actual, "El resultado tiene que ser ");
	}

	/**
	 * Si alguno de los valores es negativo levanta la excepcion
	 * IncorrectValueException
	 */

	@Test
	void testDividirIntInt_C() {

		// 1 Arrange
		double a = 8;
		double b = -4;
		try {

			// 2 Act
			double actual = Cociente.dividir(a, b);
			// 3 Assert
			fail("Tiene que saltar la excepciÃ³n");

		} catch (IncorrectValueException e) {
		}
	}

//Resto de la division de dos numeros enteros

	/**
	 * Si el primer valor es 0 el resultado sera 0
	 * 
	 */
	@Test
	void testResto_A() {

		// 1 Arrange
		int a = 0;
		int b = 10;

		int expected = Cociente.resto(a, b);
		// 2 Act
		int actual = Cociente.resto(a, b);
		// 3 Assert
		assertEquals(expected, actual, "El resultado tiene que ser ");
	}

	/**
	 * Si el segundo valor es 0 el resultado sera 1
	 */

	@Test
	void testResto_B() {

		// 1 Arrange
		int a = 20;
		int b = 0;

		int expected = Cociente.resto(a, b);
		// 2 Act
		int actual = Cociente.resto(a, b);
		// 3 Assert
		assertEquals(expected, actual, "El resultado tiene que ser ");
	}

	/**
	 * Si alguno de los valores es negativo levanta la excepcion
	 * IncorrectValueException
	 */

	@Test
	void testResto_C() {
		// 1 Arrange
		int a = 8;
		int b = -4;

		try {

			// 2 Act
			int actual = Cociente.resto(a, b);
			// 3 Assert
			fail("Tiene que saltar la excepciÃ³n");

		} catch (IncorrectValueException e) {
		}
	}

	// Inverso de un numero real.

	/**
	 * Si el parametro es 0 el resultado sera 0
	 */

	@Test
	void testInverso_A() {

		// 1 Arrange
		double a = 0;

		double expected = Cociente.inverso(a);
		// 2 Act
		double actual = Cociente.inverso(a);
		// 3 Assert
		assertEquals(expected, actual, "El resultado tiene que ser ");
	}

	/**
	 * Si el parametro es negativo levanta la excepcion IncorrectValueException
	 */

	@Test
	void testInverso_B() {

		// 1 Arrange
		double a = -25.5;
		try {

			// 2 Act
			double actual = Cociente.inverso(a);
			// 3 Assert
			fail("Tiene que saltar la excepciÃ³n");

		} catch (IncorrectValueException e) {
		}
	}

	// Raiz de un numero.

	/**
	 * Si el parametro es 0 el resultado sera 1
	 */

	@Test
	void testRaiz_A() {

		// 1 Arrange

		int a = 0;

		double expected = Cociente.raiz(a);
		// 2 Act
		double actual = Cociente.raiz(a);
		// 3 Assert
		assertEquals(expected, actual, "El resultado tiene que ser ");
	}

	/**
	 * Si el parametro es negativo levanta la excepcion IncorrectValueException
	 */

	@Test
	void testRaiz_B() {

		// 1 Arrange
		int a = -14;

		try {

			// 2 Act
			double actual = Cociente.raiz(a);
			// 3 Assert
			fail("Tiene que saltar la excepciÃ³n");

		} catch (IncorrectValueException e) {
		}
	}

}

