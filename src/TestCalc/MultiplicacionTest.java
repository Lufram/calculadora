package TestCalc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Calculadora.IncorrectValueException;
import Calculadora.Multiplicacion;

class MultiplicacionTest {
	/**
	 *  Multiplicar Double Double
	 *
	 *  
	 *  Evalua si multiplicar devuelve un resultado correcto
	 */
	@Test
	void testMultiplicarDoubleDouble() {
		// 1 Arrange - Preparar
		Double val1 = 10.6;
		Double val2 = 0.5;
		Double resultado;
		Double esperado = 5.3;
		// 3 Act - Ejecutar
		resultado = Multiplicacion.multiplicar(val1, val2);
		// 1 Arrange - Comprobar
		assertEquals(esperado, resultado,  "El resultado debe ser 5.3");
		
	}
	
	/**
	 * Evalua si al introducir 0 en el primer parametro levanta la excepcion
	 */
	@Test
	void testMultiplicarDoubleDoubleFirstValZero() {
		// 1 Arrange - Preparar
		Double val1 = 0.0;
		Double val2 = 0.5;				
		Double resultado;
		Double esperado = 0.0;
		// 3 Act - Ejecutar
		resultado = Multiplicacion.multiplicar(val1, val2);
		// 1 Arrange - Comprobar
		assertEquals(esperado, resultado,  "El resultado debe ser 0.0");
	}
	
	/**
	 * Evalua en el si al introducir 0 en el segundo parametro levanta la excepcion
	 */
	@Test
	void testMultiplicarDoubleDoubleSecondValZero() {
		// 1 Arrange - Preparar
		Double val1 = 0.5;
		Double val2 = 0.0;				
		Double resultado;
		Double esperado = 0.0;
		// 3 Act - Ejecutar
		resultado = Multiplicacion.multiplicar(val1, val2);
		// 1 Arrange - Comprobar
		assertEquals(esperado, resultado,  "El resultado debe ser 0.0");
	}
	
	/**
	 * Evalua si al introducir 0 en los dos parametros levanta la excepcion
	 */
	
	@Test
	void testMultiplicarDoubleDoubleAllValZero() {
		// 1 Arrange - Preparar
		Double val1 = 0.0;
		Double val2 = 0.0;				
		Double resultado;
		Double esperado = 0.0;
		// 3 Act - Ejecutar
		resultado = Multiplicacion.multiplicar(val1, val2);
		// 1 Arrange - Comprobar
		assertEquals(esperado, resultado,  "El resultado debe ser 0.0");
	}
	
	/**
	 * Evalua si al introducir un valor negativo en el primer patametro levanta la excepcion
	 */
	@Test
	void testMultiplicarDoubleDoubleFirstValNegative() {
		// 1 Arrange - Preparar
		Double val1 = -2.3;
		Double val2 = 0.5;				
		try {
			// 3 Act - Ejecutar
			Multiplicacion.multiplicar(val1, val2);
			// 1 Arrange - Comprobar
			fail("Se esperaba excepcion IncorrectValueException");
		} catch(IncorrectValueException e) {}
	}
	/**
	 * Evalua si al introducir un valor negativo en el segundo patametro levanta la excepcion
	 */
	@Test
	void testMultiplicarDoubleDoubleSecondValNegative() {
		// 1 Arrange - Preparar
		Double val1 = 2.3;
		Double val2 = -0.5;				
		try {
			// 3 Act - Ejecutar
			Multiplicacion.multiplicar(val1, val2);
			// 1 Arrange - Comprobar
			fail("Se esperaba excepcion IncorrectValueException");
		} catch(IncorrectValueException e) {}
	}
	/**
	 * Evalua si al introducir un valor negativo en los dos parametros levanta la excepcion
	 */
	@Test
	void testMultiplicarDoubleDoubleSecondAllNegative() {
		// 1 Arrange - Preparar
		Double val1 = -2.3;
		Double val2 = -0.5;				
		try {
			// 3 Act - Ejecutar
			Multiplicacion.multiplicar(val1, val2);
			// 1 Arrange - Comprobar
			fail("Se esperaba excepcion IncorrectValueException");
		} catch(IncorrectValueException e) {}
	}
	
	/**
	 * Evalua si al introducir un valor infinito en el primer parametro devuelve infinito
	 */
	@Test
	void testMultiplicarDoubleDoubleFirstInfinity() {
		// 1 Arrange - Preparar
		Double val1 = Double.POSITIVE_INFINITY;
		Double val2 = 5.1;
		Double esperado = Double.POSITIVE_INFINITY;
		// 3 Act - Ejecutar
		Double resultado = Multiplicacion.multiplicar(val1, val2);
		// 1 Arrange - Comproba
		assertEquals(esperado, resultado,  "El resultado debe ser Infinito");
	}
	/**
	 * Evalua si al introducir un valor infinito en el segundo parametro devuelve infinito
	 */
	@Test
	void testMultiplicarDoubleDoubleSecondInfinity() {
		// 1 Arrange - Preparar
		Double val1 = 5.1;
		Double val2 = Double.POSITIVE_INFINITY;
		Double esperado = Double.POSITIVE_INFINITY;
		// 3 Act - Ejecutar
		Double resultado = Multiplicacion.multiplicar(val1, val2);
		// 1 Arrange - Comproba
		assertEquals(esperado, resultado,  "El resultado debe ser Infinito");
	}
	/**
	 * Evalua si al introducir un valor infinito en los dos parametros devuelve infinito
	 */
	@Test
	void testMultiplicarDoubleDoubleAllInfinity() {
		// 1 Arrange - Preparar
		Double val1 = Double.POSITIVE_INFINITY;
		Double val2 = Double.POSITIVE_INFINITY;
		Double esperado = Double.POSITIVE_INFINITY;
		// 3 Act - Ejecutar
		Double resultado = Multiplicacion.multiplicar(val1, val2);
		// 1 Arrange - Comproba
		assertEquals(esperado, resultado,  "El resultado debe ser Infinito");
	}
	/**
	 * Evalua si al introducir un valor NaN en el primer parametro devuelve NaN
	 */
	@Test
	void testMultiplicarDoubleDoubleFirstNan() {
		// 1 Arrange - Preparar
		Double val1 = Double.NaN;
		Double val2 = 2.0;
		Double esperado = Double.NaN;
		// 3 Act - Ejecutar
		Double resultado = Multiplicacion.multiplicar(val1, val2);
		// 1 Arrange - Comproba
		assertEquals(esperado, resultado,  "El resultado debe ser NaN");
	}
	/**
	 * Evalua si al introducir un valor NaN en el segundo parametro devuelve NaN
	 */
	@Test
	void testMultiplicarDoubleDoubleSecondNan() {
		// 1 Arrange - Preparar
		Double val1 = 2.0;
		Double val2 = Double.NaN;
		Double esperado = Double.NaN;
		// 3 Act - Ejecutar
		Double resultado = Multiplicacion.multiplicar(val1, val2);
		// 1 Arrange - Comproba
		assertEquals(esperado, resultado,  "El resultado debe ser NaN");
	}
	
	
	/**
	 *  Multiplicar int  int
	 *  
	 *  Evalua si multiplicar devuelve un resultado correcto
	 */
	@Test
	void testMultiplicarIntInt() {
		// 1 Arrange - Preparar
		int val1 = 10;
		int val2 = 5;
		int resultado;
		int esperado = 50;
		// 3 Act - Ejecutar
		resultado = Multiplicacion.multiplicar(val1, val2);
		// 1 Arrange - Comprobar
		assertEquals(esperado, resultado,  "El resultado debe ser 50");
		
	}
	
	/**
	 * Evalua si al introducir 0 en el primer parametro devuelve 0
	 */
	@Test
	void testMultiplicarIntIntFirstValZero() {
		// 1 Arrange - Preparar
		int val1 = 0;
		int val2 = 5;				
		int resultado;
		int esperado = 0;
		// 3 Act - Ejecutar
		resultado = Multiplicacion.multiplicar(val1, val2);
		// 1 Arrange - Comprobar
		assertEquals(esperado, resultado,  "El resultado debe ser 0.0");
	}
	
	/**
	 * Evalua si al introducir 0 en el segundo parametro devuelve 0
	 */
	@Test
	void testMultiplicarIntIntSecondValZero() {
		// 1 Arrange - Preparar
		int val1 = 5;
		int val2 = 0;				
		int resultado;
		int esperado = 0;
		// 3 Act - Ejecutar
		resultado = Multiplicacion.multiplicar(val1, val2);
		// 1 Arrange - Comprobar
		assertEquals(esperado, resultado,  "El resultado debe ser 0.0");
	}
	
	/**
	 * Evalua si al introducir 0 en los dos parametros ldevuelve 0
	 */
	
	@Test
	void testMultiplicarIntIntAllValZero() {
		// 1 Arrange - Preparar
		int val1 = 0;
		int val2 = 0;				
		int resultado;
		int esperado = 0;
		// 3 Act - Ejecutar
		resultado = Multiplicacion.multiplicar(val1, val2);
		// 1 Arrange - Comprobar
		assertEquals(esperado, resultado,  "El resultado debe ser 0.0");
	}
	
	/**
	 * Evalua si al introducir un valor negativo en el primer patametro levanta la excepcion
	 */
	@Test
	void testMultiplicarIntIntFirstValNegative() {
		// 1 Arrange - Preparar
		int val1 = -2;
		int val2 = 5;				
		try {
			// 3 Act - Ejecutar
			Multiplicacion.multiplicar(val1, val2);
			// 1 Arrange - Comprobar
			fail("Se esperaba excepcion IncorrectValueException");
		} catch(IncorrectValueException e) {}
	}
	/**
	 * Evalua si al introducir un valor negativo en el segundo patametro levanta la excepcion
	 */
	@Test
	void testMultiplicarIntIntSecondValNegative() {
		// 1 Arrange - Preparar
		int val1 = 3;
		int val2 = -5;				
		try {
			// 3 Act - Ejecutar
			Multiplicacion.multiplicar(val1, val2);
			// 1 Arrange - Comprobar
			fail("Se esperaba excepcion IncorrectValueException");
		} catch(IncorrectValueException e) {}
	}
	/**
	 * Evalua si al introducir un valor negativo en los dos parametros levanta la excepcion
	 */
	@Test
	void testMultiplicarIntIntSecondAllNegative() {
		// 1 Arrange - Preparar
		int val1 = -3;
		int val2 = -5;				
		try {
			// 3 Act - Ejecutar
			Multiplicacion.multiplicar(val1, val2);
			// 1 Arrange - Comprobar
			fail("Se esperaba excepcion IncorrectValueException");
		} catch(IncorrectValueException e) {}
	}
	
	/**
	 * Evalua si al introducir un valor infinito en el primer parametro devuelve un numero positivo
	 */
	@Test
	void testMultiplicarIntIntFirstInfinity() {
		// 1 Arrange - Preparar
		int val1 = (int) Double.POSITIVE_INFINITY;
		int val2 = 5;
		int esperado = 2147483643;
		// 3 Act - Ejecutar
		int resultado = Multiplicacion.multiplicar(val1, val2);
		// 1 Arrange - Comproba
		assertEquals(esperado, resultado,  "El resultado debe ser Infinito");
	}
	/**
	 * Evalua si al introducir un valor infinito en  parametro devuelve un numero positivo
	 */
	@Test
	void testMultiplicarIntIntSecondInfinity() {
		// 1 Arrange - Preparar
		int val1 = 5;
		int val2 = (int) Double.POSITIVE_INFINITY;
		int esperado = 2147483643;
		// 3 Act - Ejecutar
		int resultado = Multiplicacion.multiplicar(val1, val2);
		// 1 Arrange - Comproba
		assertEquals(esperado, resultado,  "El resultado debe ser Infinito");
	}
	/**
	 * Evalua si al introducir un valor infinito en los dos parametros devuelve un numero positivo
	 */
	@Test
	void testMultiplicarIntIntAllInfinity() {
		// 1 Arrange - Preparar
		int val1 = (int) Double.POSITIVE_INFINITY;
		int val2 = (int) Double.POSITIVE_INFINITY;
		int esperado = 1;
		// 3 Act - Ejecutar
		int resultado = Multiplicacion.multiplicar(val1, val2);
		// 1 Arrange - Comproba
		assertEquals(esperado, resultado,  "El resultado debe ser Infinito");
	}
	/**
	 * Evalua si al introducir un valor NaN en el primer parametro devuelve NaN
	 */
	@Test
	void testMultiplicarIntIntFirstNan() {
		// 1 Arrange - Preparar
		int val1 = (int) Double.NaN;
		int val2 = 2;
		int esperado = (int) Double.NaN;
		// 3 Act - Ejecutar
		int resultado = Multiplicacion.multiplicar(val1, val2);
		// 1 Arrange - Comproba
		assertEquals(esperado, resultado,  "El resultado debe ser NaN");
	}
	/**
	 * Evalua si al introducir un valor NaN en el segundo parametro devuelve NaN
	 */
	@Test
	void testMultiplicarIntIntSecondNan() {
		// 1 Arrange - Preparar
		int val1 = 2;
		int val2 = (int) Double.NaN;
		int esperado = (int) Double.NaN;
		// 3 Act - Ejecutar
		int resultado = Multiplicacion.multiplicar(val1, val2);
		// 1 Arrange - Comproba
		assertEquals(esperado, resultado,  "El resultado debe ser NaN");
	}
	/**
	 * Evalua si al introducir un valor NaN en los dos parametros devuelve NaN
	 */
	@Test
	void testMultiplicarIntIntAllNan() {
		// 1 Arrange - Preparar
		int val1 = (int) Double.NaN;
		int val2 = (int) Double.NaN;
		int esperado = (int) Double.NaN;
		// 3 Act - Ejecutar
		int resultado = Multiplicacion.multiplicar(val1, val2);
		// 1 Arrange - Comproba
		assertEquals(esperado, resultado,  "El resultado debe ser NaN");
	}
	
	/**
	 *  Multiplicar Double Double Double
	 *  
	 *  Evalua si multiplicar devuelve un resultado correcto
	 */
	@Test
	void testMultiplicarDoubleDoubleDouble() {
		// 1 Arrange - Preparar
		Double val1 = 10.5;
		Double val2 = 5.5;
		Double val3 = 8.5;
		Double resultado;
		Double esperado = 490.875;
		// 3 Act - Ejecutar
		resultado = Multiplicacion.multiplicar(val1, val2, val3);
		// 1 Arrange - Comprobar
		assertEquals(esperado, resultado,  "El resultado debe ser 490.875");
		
	}
	
	/**
	 * Evalua si al introducir 0 en el primer parametro devuelve 0
	 */
	@Test
	void testMultiplicarDoubleDoubleDoubleFirstValZero() {
		// 1 Arrange - Preparar
		Double val1 = 0.0;
		Double val2 = 5.5;
		Double val3 = 8.5;
		Double resultado;
		Double esperado = 0.0;
		// 3 Act - Ejecutar
		resultado = Multiplicacion.multiplicar(val1, val2, val3);
		// 1 Arrange - Comprobar
		assertEquals(esperado, resultado,  "El resultado debe ser 0.0");
	}
	
	/**
	 * Evalua si al introducir 0 en el segundo parametro devuelve 0
	 */
	@Test
	void testMultiplicarDoubleDoubleDoubleSecondValZero() {
		// 1 Arrange - Preparar
		Double val1 = 5.5;
		Double val2 = 0.0;
		Double val3 = 8.5;
		Double resultado;
		Double esperado = 0.0;
		// 3 Act - Ejecutar
		resultado = Multiplicacion.multiplicar(val1, val2, val3);
		// 1 Arrange - Comprobar
		assertEquals(esperado, resultado,  "El resultado debe ser 0.0");
	}
	
	/**
	 * Evalua si al introducir 0 en el tercer parametro devuelve 0
	 */
	@Test
	void testMultiplicarDoubleDoubleDoubleThirdValZero() {
		// 1 Arrange - Preparar
		Double val1 = 5.5;
		Double val2 = 8.5;
		Double val3 = 0.0;
		Double resultado;
		Double esperado = 0.0;
		// 3 Act - Ejecutar
		resultado = Multiplicacion.multiplicar(val1, val2, val3);
		// 1 Arrange - Comprobar
		assertEquals(esperado, resultado,  "El resultado debe ser 0.0");
	}
	
	/**
	 * Evalua si al introducir 0 en el primer y segundo parametro devuelve 0
	 */
	@Test
	void testMultiplicarDoubleDoubleDoubleFirstAndSecondValZero() {
		// 1 Arrange - Preparar
		double val1 = 0;
		double val2 = 0;
		double val3 = 8.5;
		double resultado;
		double esperado = 0.0;
		// 3 Act - Ejecutar
		resultado = Multiplicacion.multiplicar(val1, val2, val3);
		// 1 Arrange - Comprobar
		assertEquals(esperado, resultado,  "El resultado debe ser 0.0");
	}
	
	/**
	 * Evalua si al introducir 0 en el primer y tercer parametro devuelve 0
	 */
	@Test
	void testMultiplicarDoubleDoubleDoubleFirstAndThirdValZero() {
		// 1 Arrange - Preparar
		double val1 = 0;
		double val2 = 8.5;
		double val3 = 0;
		double resultado;
		double esperado = 0.0;
		// 3 Act - Ejecutar
		resultado = Multiplicacion.multiplicar(val1, val2, val3);
		// 1 Arrange - Comprobar
		assertEquals(esperado, resultado,  "El resultado debe ser 0.0");
	}
	
	/**
	 * Evalua si al introducir 0 en el segundo y tercer parametro devuelve 0
	 */
	@Test
	void testMultiplicarDoubleDoubleDoubleSecondAndThirdValZero() {
		// 1 Arrange - Preparar
		double val1 = 8.5;
		double val2 = 0;
		double val3 = 0;
		double resultado;
		double esperado = 0;
		// 3 Act - Ejecutar
		resultado = Multiplicacion.multiplicar(val1, val2, val3);
		// 1 Arrange - Comprobar
		assertEquals(esperado, resultado,  "El resultado debe ser 0.0");
	}
	/**
	 * Evalua si al introducir 0 en los tres parametros devuelve 0
	 */
	
	@Test
	void testMultiplicarDoubleDoubleDoubleAllValZero() {
		// 1 Arrange - Preparar
		Double val1 = 0.0;
		Double val2 = 0.0;
		Double val3 = 0.0;
		Double resultado;
		Double esperado = 0.0;
		// 3 Act - Ejecutar
		resultado = Multiplicacion.multiplicar(val1, val2, val3);
		// 1 Arrange - Comprobar
		assertEquals(esperado, resultado,  "El resultado debe ser 0.0");
	}
	
	/**
	 * Evalua si al introducir un valor negativo en el primer parametro levanta la excepcion
	 */
	@Test
	void testMultiplicarDoubleDoubleDoubleFirstValNegative() {
		// 1 Arrange - Preparar
		Double val1 = -2.2;
		Double val2 = 5.3;
		Double val3 = 8.6;
		try {
			// 3 Act - Ejecutar
			Multiplicacion.multiplicar(val1, val2, val3);
			// 1 Arrange - Comprobar
			fail("Se esperaba excepcion IncorrectValueException");
		} catch(IncorrectValueException e) {}
	}
	/**
	 * Evalua si al introducir un valor negativo en el segundo parametro levanta la excepcion
	 */
	@Test
	void testMultiplicarDoubleDoubleDoubleSecondValNegative() {
		// 1 Arrange - Preparar
		Double val1 = 3.5;
		Double val2 = -5.2;
		Double val3 = 8.6;
		try {
			// 3 Act - Ejecutar
			Multiplicacion.multiplicar(val1, val2, val3);
			// 1 Arrange - Comprobar
			fail("Se esperaba excepcion IncorrectValueException");
		} catch(IncorrectValueException e) {}
	}
	/**
	 * Evalua si al introducir un valor negativo en el tercer parametro levanta la excepcion
	 */
	@Test
	void testMultiplicarDoubleDoubleDoubleThirdValNegative() {
		// 1 Arrange - Preparar
		Double val1 = 3.5;
		Double val2 = 5.2;
		Double val3 = -8.6;
		try {
			// 3 Act - Ejecutar
			Multiplicacion.multiplicar(val1, val2, val3);
			// 1 Arrange - Comprobar
			fail("Se esperaba excepcion IncorrectValueException");
		} catch(IncorrectValueException e) {}
	}
	/**
	 * Evalua si al introducir un valor negativo en el primer y tercer parametro levanta la excepcion
	 */
	@Test
	void testMultiplicarDoubleDoubleDoubleFirstAndThirdValNegative() {
		// 1 Arrange - Preparar
		Double val1 = -3.5;
		Double val2 = 5.2;
		Double val3 = -8.6;
		try {
			// 3 Act - Ejecutar
			Multiplicacion.multiplicar(val1, val2, val3);
			// 1 Arrange - Comprobar
			fail("Se esperaba excepcion IncorrectValueException");
		} catch(IncorrectValueException e) {}
	}
	/**
	 * Evalua si al introducir un valor negativo en el primer y tercer parametro levanta la excepcion
	 */
	@Test
	void testMultiplicarDoubleDoubleDoubleSecondtAndThirdValNegative() {
		// 1 Arrange - Preparar
		Double val1 = 3.5;
		Double val2 = -5.2;
		Double val3 = -8.6;
		try {
			// 3 Act - Ejecutar
			Multiplicacion.multiplicar(val1, val2, val3);
			// 1 Arrange - Comprobar
			fail("Se esperaba excepcion IncorrectValueException");
		} catch(IncorrectValueException e) {}
	}
	/**
	 * Evalua si al introducir un valor negativo en el primer y segundo parametro levanta la excepcion
	 */
	@Test
	void testMultiplicarDoubleDoubleDoubleFirstAndSecondtdValNegative() {
		// 1 Arrange - Preparar
		Double val1 = -3.5;
		Double val2 = -5.2;
		Double val3 = 8.6;
		try {
			// 3 Act - Ejecutar
			Multiplicacion.multiplicar(val1, val2, val3);
			// 1 Arrange - Comprobar
			fail("Se esperaba excepcion IncorrectValueException");
		} catch(IncorrectValueException e) {}
	}
	
	/**
	 * Evalua en el si al introducir un valor negativo en los tres parametros levanta la excepcion
	 */
	@Test
	void testMultiplicarDoubleDoubleDoubleAllValNegative() {
		// 1 Arrange - Preparar
		Double val1 = -3.2;
		Double val2 = -5.3;
		Double val3 = -3.5;
		try {
			// 3 Act - Ejecutar
			Multiplicacion.multiplicar(val1, val2, val3);
			// 1 Arrange - Comprobar
			fail("Se esperaba excepcion IncorrectValueException");
		} catch(IncorrectValueException e) {}
	}
	
	/**
	 *Evalua si al introducir un valor infinito en uno de los parametros devuelve infinito
	 */
	@Test
	void testMultiplicarDoubleDoubleDoubleFirstInfinity() {
		// 1 Arrange - Preparar
		Double val1 = Double.POSITIVE_INFINITY;
		Double val2 = 5.5;
		Double val3 = 3.5;
		Double esperado = Double.POSITIVE_INFINITY;
		// 3 Act - Ejecutar
		Double resultado = Multiplicacion.multiplicar(val1, val2, val3);
		// 1 Arrange - Comproba
		assertEquals(esperado, resultado,  "El resultado debe ser Infinito");
	}
	/**
	 * Evalua si al introducir un valor infinito en uno de los parametros devuelve infinito
	 */
	@Test
	void testMultiplicarDoubleDoubleDoubleSecondInfinity() {
		// 1 Arrange - Preparar
		Double val1 = 5.5;
		Double val2 = Double.POSITIVE_INFINITY;
		Double val3 = 3.5;
		Double esperado = Double.POSITIVE_INFINITY;
		// 3 Act - Ejecutar
		Double resultado = Multiplicacion.multiplicar(val1, val2, val3);
		// 1 Arrange - Comproba
		assertEquals(esperado, resultado,  "El resultado debe ser Infinito");
	}
	/**
	 * Evalua si al introducir un valor infinito en uno de los parametros devuelve infinito
	 */
	@Test
	void testMultiplicarDoubleDoubleDoubleThirdInfinity() {
		// 1 Arrange - Preparar
		Double val1 = 5.5;
		Double val2 = 3.5;
		Double val3 = Double.POSITIVE_INFINITY;
		Double esperado = Double.POSITIVE_INFINITY;
		// 3 Act - Ejecutar
		Double resultado = Multiplicacion.multiplicar(val1, val2, val3);
		// 1 Arrange - Comproba
		assertEquals(esperado, resultado,  "El resultado debe ser Infinito");
	}
	/**
	 * Evalua si al introducir un valor infinito en los tres parametros devuelve infinito
	 */
	@Test
	void testMultiplicarDoubleDoubleDoubleAllInfinity() {
		// 1 Arrange - Preparar
		Double val1 = Double.POSITIVE_INFINITY;
		Double val2 = Double.POSITIVE_INFINITY;
		Double val3 = Double.POSITIVE_INFINITY;
		Double esperado = Double.POSITIVE_INFINITY;
		// 3 Act - Ejecutar
		Double resultado = Multiplicacion.multiplicar(val1, val2, val3);
		// 1 Arrange - Comproba
		assertEquals(esperado, resultado,  "El resultado debe ser Infinito");
	}
	/**
	 * Evalua si al introducir un valor infinito en uno de los parametros devuelve NaN
	 */
	@Test
	void testMultiplicarDoubleDoubleDoubleFirstNan() {
		// 1 Arrange - Preparar
		Double val1 = Double.NaN;
		Double val2 = 2.5;
		Double val3 = 3.5;
		Double esperado = Double.NaN;
		// 3 Act - Ejecutar
		Double resultado = Multiplicacion.multiplicar(val1, val2, val3);
		// 1 Arrange - Comproba
		assertEquals(esperado, resultado,  "El resultado debe ser NaN");
	}
	/**
	 * Evalua si al introducir un valor infinito en uno de los parametros devuelve NaN
	 */
	@Test
	void testMultiplicarDoubleDoubleDoubleSecondNan() {
		// 1 Arrange - Preparar
		Double val1 = 2.5;
		Double val2 = Double.NaN;
		Double val3 = 3.5;
		Double esperado = Double.NaN;
		// 3 Act - Ejecutar
		Double resultado = Multiplicacion.multiplicar(val1, val2, val3);
		// 1 Arrange - Comproba
		assertEquals(esperado, resultado,  "El resultado debe ser NaN");
	}
	/**
	 * Evalua si al introducir un valor infinito en uno de los parametros devuelve NaN
	 */
	@Test
	void testMultiplicarDoubleDoubleDoubleThirdNan() {
		// 1 Arrange - Preparar
		Double val1 = 2.5;
		Double val2 = 3.2;
		Double val3 = Double.NaN;
		Double esperado = Double.NaN;
		// 3 Act - Ejecutar
		Double resultado = Multiplicacion.multiplicar(val1, val2, val3);
		// 1 Arrange - Comproba
		assertEquals(esperado, resultado,  "El resultado debe ser NaN");
	}
	
	/**
	 * Evalua si al introducir un valor infinito en los tres parametros devuelve NaN
	 */
	@Test
	void testMultiplicarDoubleDoubleDoubleAllNan() {
		// 1 Arrange - Preparar
		Double val1 = Double.NaN;
		Double val2 = Double.NaN;
		Double val3 = Double.NaN;
		Double esperado = Double.NaN;
		// 3 Act - Ejecutar
		Double resultado = Multiplicacion.multiplicar(val1, val2, val3);
		// 1 Arrange - Comproba
		assertEquals(esperado, resultado,  "El resultado debe ser NaN");
	}
	
	/**
	 *  Potencia int  int
	 *  
	 *  Evalua si potencia devuelve un resultado correcto
	 */
	@Test
	void testPotenciaIntInt() {
		// 1 Arrange - Preparar
		double val1 = 10;
		double val2 = 5;
		double resultado;
		double esperado = 100000.0;
		// 3 Act - Ejecutar
		resultado = Multiplicacion.potencia(val1, val2);
		// 1 Arrange - Comprobar
		assertEquals(esperado, resultado,  "El resultado debe ser 100000.0");
		
	}
	
	/**
	 * Evalua si al introducir 0 en el primer parametro levanta la excepcion
	 */
	@Test
	void testPotenciaIntIntFirstValZero() {
		// 1 Arrange - Preparar
		double val1 = 0;
		double val2 = 5;				
		double resultado;
		double esperado = 0.0;
		// 3 Act - Ejecutar
		resultado =  Multiplicacion.potencia(val1, val2);
		// 1 Arrange - Comprobar
		assertEquals(esperado, resultado,  "El resultado debe ser 0.0");
	}
	
	/**
	 * Evalua en el si al introducir 0 en el segundo parametro levanta la excepcion
	 */
	@Test
	void testPotenciaIntIntSecondValZero() {
		// 1 Arrange - Preparar
		double val1 = 5;
		double val2 = 0;				
		double resultado;
		double esperado = 0.0;
		// 3 Act - Ejecutar
		resultado = (double) Multiplicacion.potencia(val1, val2);
		// 1 Arrange - Comprobar
		assertEquals(esperado, resultado,  "El resultado debe ser 0.0");
	}
	
	/**
	 * Evalua en el si al introducir 0 en los dos parametros levanta la excepcion
	 */
	
	@Test
	void testPotenciaIntIntAllValZero() {
		// 1 Arrange - Preparar
		double val1 = 0;
		double val2 = 0;				
		double resultado;
		double esperado = 0.0;
		// 3 Act - Ejecutar
		resultado = Multiplicacion.potencia(val1, val2);
		// 1 Arrange - Comprobar
		assertEquals(esperado, resultado,  "El resultado debe ser 0.0");
	}
	
	/**
	 * Evalua en el si al introducir un valor negativo en el primer parametro levanta la excepcion
	 */
	@Test
	void testPotenciaIntIntFirstValNegative() {
		// 1 Arrange - Preparar
		double val1 = -2;
		double val2 = 5;				
		try {
			// 3 Act - Ejecutar
			Multiplicacion.potencia(val1, val2);
			// 1 Arrange - Comprobar
			fail("Se esperaba excepcion IncorrectValueException");
		} catch(IncorrectValueException e) {}
	}
	/**
	 * Evalua en el si al introducir un valor negativo en el segundo parametro levanta la excepcion
	 */
	@Test
	void testPotenciaIntIntSecondValNegative() {
		// 1 Arrange - Preparar
		double val1 = 3;
		double val2 = -5;				
		try {
			// 3 Act - Ejecutar
			Multiplicacion.potencia(val1, val2);
			// 1 Arrange - Comprobar
			fail("Se esperaba excepcion IncorrectValueException");
		} catch(IncorrectValueException e) {}
	}
	/**
	 * Evalua en el si al introducir un valor negativo en los dos parametros levanta la excepcion
	 */
	@Test
	void testPotenciaIntIntSecondAllNegative() {
		// 1 Arrange - Preparar
		double val1 = -3;
		double val2 = -5;				
		try {
			// 3 Act - Ejecutar
			Multiplicacion.potencia(val1, val2);
			// 1 Arrange - Comprobar
			fail("Se esperaba excepcion IncorrectValueException");
		} catch(IncorrectValueException e) {}
	}
	
	/**
	 * Evalua si al introducir un valor infinito en el primer parametro devuelve infinito
	 */
	@Test
	void testPotenciaIntIntFirstInfinity() {
		// 1 Arrange - Preparar
		double val1 = Double.POSITIVE_INFINITY;
		double val2 = 5;
		double esperado = Double.POSITIVE_INFINITY;
		// 3 Act - Ejecutar
		double resultado = Multiplicacion.potencia(val1, val2);
		// 1 Arrange - Comproba
		assertEquals(esperado, resultado,  "El resultado debe ser Infinito");
	}
	/**
	 * Evalua si al introducir un valor infinito en el segundo parametro devuelve infinito
	 */
	@Test
	void testPotenciaIntIntSecondInfinity() {
		// 1 Arrange - Preparar
		double val1 = 5;
		double val2 = Double.POSITIVE_INFINITY;
		double esperado = Double.POSITIVE_INFINITY;
		// 3 Act - Ejecutar
		double resultado = Multiplicacion.potencia(val1, val2);
		// 1 Arrange - Comproba
		assertEquals(esperado, resultado,  "El resultado debe ser Infinito");
	}
	/**
	 * Evalua si al introducir un valor infinito en los dos parametros devuelve infinito
	 */
	@Test
	void testPotenciaIntIntAllInfinity() {
		// 1 Arrange - Preparar
		double val1 = Double.POSITIVE_INFINITY;
		double val2 = Double.POSITIVE_INFINITY;
		double esperado = Double.POSITIVE_INFINITY;
		// 3 Act - Ejecutar
		double resultado = Multiplicacion.potencia(val1, val2);
		// 1 Arrange - Comproba
		assertEquals(esperado, resultado,  "El resultado debe ser Infinito");
	}
	/**
	 * Evalua si al introducir un valor nan en el primer parametro devuelve nan
	 */
	@Test
	void testPotenciaIntIntFirstNan() {
		// 1 Arrange - Preparar
		double val1 =  Double.NaN;
		double val2 = 2;
		double esperado = Double.NaN;
		// 3 Act - Ejecutar
		double resultado =  Multiplicacion.potencia(val1, val2);
		// 1 Arrange - Comproba
		assertEquals(esperado, resultado,  "El resultado debe ser NaN");
	}
	/**
	 * Evalua si al introducir un valor nan en el segundo parametro devuelve nan
	 */
	@Test
	void testPotenciaIntIntSecondNan() {
		// 1 Arrange - Preparar
		double val1 = 2;
		double val2 = Double.NaN;
		double esperado = Double.NaN;
		// 3 Act - Ejecutar
		double resultado = Multiplicacion.potencia(val1, val2);
		// 1 Arrange - Comproba
		assertEquals(esperado, resultado,  "El resultado debe ser NaN");
	}
	
	/**
	 * Evalua si al introducir un valor nan en los dos parametros devuelve nan
	 */
	@Test
	void testPotenciaIntIntAllNan() {
		// 1 Arrange - Preparar
		double val1 = Double.NaN;
		double val2 = Double.NaN;
		double esperado = Double.NaN;
		// 3 Act - Ejecutar
		Double resultado = Multiplicacion.potencia(val1, val2);
		// 1 Arrange - Comproba
		assertEquals(esperado, resultado,  "El resultado debe ser NaN");
	}
	
	
}
