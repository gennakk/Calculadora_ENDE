package interfazCLI.com;

public class CalculadoraCLI {
	
	
	
	
/**
 * Es el programa principal de linea de comandos
 * nuestra labor ser� extraer los m�todos que haga falta y 
 * en la medida de lo posible pasarlo a interfaz gr�fico
 * o al menos tenerlo funcionando
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LanzarMenu();

	}

	
	/**
	 * Muestra un men� de linea de comando con diferentes opciones
	 * como son meter un operador A, un operador B
	 * y realziar una operacion sobre ellos
	 */
private static void LanzarMenu() {
	System.out.println("Bienvenido a la calculadora");
	

}


/**
 * Realiza la suma entre dos n�meros
 * @author Rodrigo
 */
public static double Sumar(double n,double m) {
	System.out.println("Yo sumo dos operadores");
	return n+m;

}

/**
 * Realiza la divisi�n entre dos n�meros.
 * Lanza excepcion cuando el divisor es 0
 * @author Rodrigo
 */
public static double Dividir(double n,double m) {
	System.out.println("Yo divido dos operadores");
	try {
		if(m==0)
			throw new ErrorDivision0("Division por 0.");
		return n/m;	
	}catch(ErrorDivision0 e) {
		System.err.println(e.getMessage());
		return -1;
	}
	
	

}

/**
 * Realiza el logaritmo de n con base m
 *
 * @author Rodrigo
 */
public static double Logaritmo(double n,double m) {
	
	System.out.println("Yo hago el logaritmo de dos operadores");
	
	return Math.log(n) / Math.log(m);
	
}








}
