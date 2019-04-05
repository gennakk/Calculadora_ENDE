package interfazCLI.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Clase de JUNIT creada para hacer pruebas sobre los m�todos que vamos creando
 * Ning�n m�todo ser� dado por v�lido hasta que no tenga su JUNIT correspondiente 
 * con dos pruebas como m�nimo 
 * @author israel
 *
 */

class CalculadoraCLITest {

	@Test
	void testMain() {
		fail("Not yet implemented");
	}
	
	
	/**
	 * Test n�mero 1 sobre el m�todo suma
	 * @author Rodrigo
	 *
	 */
	@Test
	void testSumar1() {
		double solucion = CalculadoraCLI.Sumar(2.0,1.0);
		
		assertEquals(3.0, solucion);
	}
	
	
	/**
	 * Test n�mero 2 sobre el m�todo suma, fallo
	 * @author Rodrigo
	 *
	 */
	@Test
	void testSumar2() {
		double solucion = CalculadoraCLI.Sumar(3.0,1.0);
		
		assertEquals(3.0, solucion);
	}
	
	/**
	 * Test n�mero 1 sobre el m�todo dividir
	 * @author Rodrigo
	 *
	 */
	@Test
	void testDividir1() {
		double solucion = CalculadoraCLI.Dividir(2.0,1.0);
		
		assertEquals(3.0, solucion);
	}
	
	
	/**
	 * Test n�mero 2 sobre el m�todo dividir, fallo
	 * @author Rodrigo
	 *
	 */
	@Test
	void testDividir2() {
		
		assertEquals("Division por 0.", CalculadoraCLI.Dividir(3.0,0));
	}
	

}
