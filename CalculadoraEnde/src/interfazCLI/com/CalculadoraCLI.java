package interfazCLI.com;

public class CalculadoraCLI {
	
	private double n;

	private double m;
	
	Calculadora(double x,double y){
		this.n=n;
		this.m=m;
	}
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
	Sumar(); //debes borrarme
}

/**
 * Realiza la suma entre dos n�meros
 * @author Rodrigo
 */
private static int Sumar() {
	System.out.println("Yo sumo dos operadores");
	return n+m;

}

/**
 * Realiza la divisi�n entre dos n�meros
 * @author Rodrigo
 */
private static int Dividir() {
	System.out.println("Yo divido dos operadores");
	try {
		if(m==0)
			
		return n/m;	
	}catch() {
		System.out.println("Dividendo igual a 0");
	}

}




}
