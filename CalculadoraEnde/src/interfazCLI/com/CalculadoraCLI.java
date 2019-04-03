package interfazCLI.com;

public class CalculadoraCLI {
/**
 * Es el programa principal de linea de comandos
 * nuestra labor será extraer los métodos que haga falta y 
 * en la medida de lo posible pasarlo a interfaz gráfico
 * o al menos tenerlo funcionando
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LanzarMenu();

	}

	
	/**
	 * Muestra un menú de linea de comando con diferentes opciones
	 * como son meter un operador A, un operador B
	 * y realziar una operacion sobre ellos
	 */
private static void LanzarMenu() {
	System.out.println("Bienvenido a la calculadora");
	Sumar(); //debes borrarme
}


private static int Sumar() {
	System.out.println("Yo sumo dos operadores");
	return 0;

}

/**
 * 
 * @param a 
 * @param b valor que recibe la 
 * @return devuelve el resultado de multiplicar los valores
 * @author gian piero
 */
private static double multiplicar(int a, int b)
{
	return a*b;
}

/**
 * 
 * @param a
 * @return Metodo que calcula la raiz cuadrada
 * @author gian piero
 */
private static double raizCuadrada(int a)
{
	try {
		if (a<0)
			throw new Exception();
	}
	catch (Exception e) {
		System.out.println("Error no se puede hacer la raiz cuadrada de un numero negativo");
	}
	return Math.sqrt(a);
}

/**
 * 
 * @param a
 * @return
 */
private static int calcularAbsoluto(int a)
{
	return Math.abs(a);
}

}
