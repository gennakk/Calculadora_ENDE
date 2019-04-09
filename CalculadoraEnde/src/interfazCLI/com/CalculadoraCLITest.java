package interfazCLI.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Clase de JUNIT creada para hacer pruebas sobre los métodos que vamos creando
 * Ningún método será dado por válido hasta que no tenga su JUNIT correspondiente 
 * con dos pruebas como mínimo 
 * @author israel
 *
 */

class CalculadoraCLITest {
	
	/**
	 * Test número 1 sobre el metodo suma
	 * @author Rodrigo
	 *
	 */
	@Test
	void testSumar1() {
		double solucion = CalculadoraCLI.Sumar(2.0,1.0);
		
		assertEquals(3.0, solucion);
	}
	
	
	/**
	 * Test numero 2 sobre el metodo suma, fallo
	 * @author Rodrigo
	 *
	 */
	@Test
	void testSumar2() {
		double solucion = CalculadoraCLI.Sumar(3.0,1.0);
		
		assertEquals(3.0, solucion);
	}
	
	/**
	 * Test numero 1 sobre el metodo resta
	 * @author gian piero
	 *
	 */
	@Test
	void testResta1() {
		double solucion = CalculadoraCLI.Restar(3,4);
		
		assertEquals(-1, solucion);
	}
	
	/**
	 * Test numero 1 sobre el metodo resta, fallo
	 * @author gian piero
	 *
	 */
	@Test
	void testResta2() {
		double solucion = CalculadoraCLI.Restar(3,4);
		
		assertNotEquals(-2, solucion);
	}
	
	/**
	 * Test numero 1 sobre el metodo dividir
	 * @author Rodrigo
	 *
	 */
	@Test
	void testDividir1() {
		double solucion;
		try {
			solucion = CalculadoraCLI.Dividir(2.0,1.0);
			assertEquals(3.0, solucion);
		} catch (ErrorDivision0 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	/**
	 * Test numero 2 sobre el metodo dividir, fallo
	 * @author Rodrigo
	 *
	 */
	@Test
	void testDividir2() {
		
		try {
			assertEquals("Division por 0.", CalculadoraCLI.Dividir(3.0,0));
		} catch (ErrorDivision0 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Test numero 1 sobre el metodo elevar
	 * @author gian piero
	 *
	 */
	@Test
	void testElevar1() {
		double solucion = CalculadoraCLI.Elevar(2.0,1.0);
		assertEquals(2.0, solucion);
	}
	
	/**
	 * Test numero 2 sobre el metodo elevar, fallo
	 * @author gian piero
	 *
	 */
	@Test
	void testElevar2() {
		double solucion = CalculadoraCLI.Elevar(2.0,1.0);
		assertNotEquals(3.0, solucion);
	}
	
	/**
	 * Test que realiza pruebas con una serie de parametros
	 *@author gian piero
	 */
	@DisplayName("Prueba con parametros para la multiplicacion")
	@Test
	@ParameterizedTest(name = "{index} => a={0}, b={1}, resultado={2}")
	@CsvSource({"5.0,9.0,45.0","1.0,2.0,2.0","20.0,21.0,420.0", "13.0,18.0,234.0" , "-2.0,-20.0,40.0" , "-3.0,10.0,-30.0"}) 
	public void testMultiplicarParametros(double a, double b, double resultado)
	{
		double solucion = CalculadoraCLI.Multiplicar(a, b);
		assertEquals(resultado, solucion);
	}
	

	/**
	 * Test numero 1 sobre el metodo multiplicar
	 * @author gian piero
	 *
	 */
	@Test
	void testMultiplicar1() {
		double solucion = CalculadoraCLI.Multiplicar(2.0,2.0);
		assertEquals(4.0, solucion);
	}
	
	/**
	 * Test numero 2 sobre el metodo multiplicar, fallo
	 * @author gian piero
	 *
	 */
	@Test
	void testMultiplicar2() {
		double solucion = CalculadoraCLI.Multiplicar(2.0,1.0);
		assertNotEquals(4.0, solucion);
	}
	
	

	
	/**
	 * Test numero 1 sobre el metodo raiz cuadrada
	 * @author gian piero
	 *
	 */
	@Test
	void testRaizCuadrada1() {
		double solucion = CalculadoraCLI.RaizCuadrada(4.0);
		assertEquals(2.0, solucion);
	}
	
	/**
	 * Test numero 2 sobre el metodo raiz cuadrada, fallo
	 * @author gian piero
	 *
	 */
	@Test
	void testRaizCuadrada2() {
		double solucion = CalculadoraCLI.RaizCuadrada(4.0);
		assertNotEquals(1.0, solucion);
	}
	
	
	
	/**
	 * Test numero 1 sobre el metodo binario
	 * @author gian piero
	 *
	 */
	@Test
	void testBinario1() {
		double solucion = CalculadoraCLI.Binario(2.0);
		assertEquals(10.0, solucion);
	}
	
	/**
	 * Test numero 1 sobre el metodo binario, fallo
	 * @author gian piero
	 *
	 */
	@Test
	void testBinario2() {
		double solucion = CalculadoraCLI.Binario(4.0);
		assertNotEquals(10.0, solucion);
	}
	
	
	
	
	
	/**
	 * Test numero 1 sobre el metodo calcular valor absoluto
	 * @author gian piero
	 *
	 */
	@Test
	void testValorAbsoluto1() {
		double solucion = CalculadoraCLI.Absoluto(-2.0);
		assertEquals(2.0, solucion);
	}
	
	/**
	 *  Test numero 1 sobre el metodo calcular valor absoluto, fallo
	 * @author gian piero
	 *
	 */
	@Test
	void testValorAbsoluto2() {
		double solucion = CalculadoraCLI.Absoluto(4.0);
		assertNotEquals(-4.0, solucion);
	}
	


	/**
	 * Test nu�mero 1 sobre el metodo calcular el logaritmo
	 * @author gian piero
	 *
	 */
	@Test
	void testLogaritmo1() {
		double solucion = CalculadoraCLI.Logaritmo(2.0,8.0);
		assertEquals(3.0, solucion);
	}
	
	/**
	 *  Test numero 1 sobre el metodo calcular  el logaritmo, fallo
	 * @author gian piero
	 *
	 */
	@Test
	void testLogaritmo2() {
		double solucion = CalculadoraCLI.Logaritmo(2.0,8.0);
		assertNotEquals(3.1, solucion);
	}
	
	
	
	
	/**
	 * Test numero 1 sobre el metodo calcular el factorial
	 * @author gian piero
	 *
	 */
	@Test
	void testFactorial1() {
		double solucion = CalculadoraCLI.Factorial(4.0);
		assertEquals(24.0, solucion);
	}
	
	/**
	 *  Test numero 1 sobre el metodo calcular  el factorial, fallo
	 * @author gian piero
	 *
	 */
	@Test
	void testFactorial2() {
		double solucion = CalculadoraCLI.Factorial(3);
		assertNotEquals(6.0, solucion);
	}
	
	
	
}
