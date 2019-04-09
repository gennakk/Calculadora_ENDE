
package interfazCLI.com;

import java.util.function.BinaryOperator;

public class CalculadoraCLI {
	
	
	
	
/**
 * Es el programa principal de linea de comandos
 * nuestra labor ser� extraer los m�todos que haga falta y 
 * en la medida de lo posible pasarlo a interfaz gr�fico
 * o al menos tenerlo funcionando
 * @param args
 */
	public static void main(String[] args) {
		try {
			LanzarMenu();
		} catch (ErrorDivision0 e) {
			e.getMessage();
		}

	}

	
	/**
	 * Muestra un men� de linea de comando con diferentes opciones
	 * como son meter un operador A, un operador B
	 * y realiziar una operacion sobre ellos
	 */
private static void LanzarMenu() throws ErrorDivision0 {

	int a=0;
	int b=0;
	int resp;
	do{
		System.out.println("Bienvenido a la calculadora");
		System.out.println("1-SUMAR");
		System.out.println("2-RESTAR");
		System.out.println("3-MULTIPLICAR");
		System.out.println("4-DIVIDIR");
		System.out.println("5-RAIZ CUADRADA");
		System.out.println("6-BINARIO");
		System.out.println("7-VALOR ABSOLUTO");
		System.out.println("8-LOGARITMO");
		System.out.println("9-FACTORIAL");
		System.out.println("10-SALIR ");
		resp = Consola.leeInt();
		switch (resp) {
		case 1:
			
			System.out.println("Introduce valor para a");
			a = Consola.leeInt();
			System.out.println("Introduce valor para b");
			b = Consola.leeInt();
			System.out.println("El resultado es" +  Sumar(a,b));
			break;
		case 2:
			
			System.out.println("Introduce valor para a");
			a = Consola.leeInt();
			System.out.println("Introduce valor para b");
			b = Consola.leeInt();
			System.out.println("El resultado es" +  Restar(a,b));
			break;	
		
		case 3:
			
			System.out.println("Introduce valor para a");
			a = Consola.leeInt();
			System.out.println("Introduce valor para b");
			b = Consola.leeInt();
			System.out.println("El resultado es" +  Multiplicar(a,b));
			break;	
		
		case 4:
			
			System.out.println("Introduce valor para a");
			a = Consola.leeInt();
			System.out.println("Introduce valor para b");
			b = Consola.leeInt();
			try {
				System.out.println("El resultado es" +  Dividir(a,b));
			}
			catch (ErrorDivision0 e) {
				System.err.println(e.getMessage());
			}
			break;	
		
		case 5:
			
			System.out.println("Introduce valor para a");
			a = Consola.leeInt();
			System.out.println("El resultado es" +  RaizCuadrada(a));
			break;	
			
		case 6:
			
			System.out.println("Introduce valor para a");
			a = Consola.leeInt();
			System.out.println("El resultado es" +  Binario(a));
			break;	
			
		case 7:
			
			System.out.println("Introduce valor para a");
			a = Consola.leeInt();
			System.out.println("El resultado es" +  Absoluto(a));
			break;	
			
			
		case 8:
			
			System.out.println("Introduce valor para a");
			a = Consola.leeInt();
			System.out.println("Introduce valor para b");
			b = Consola.leeInt();
			System.out.println("El resultado es" +  Logaritmo(a,b));
			break;	
			
		case 9:
			
			System.out.println("Introduce valor para a");
			a = Consola.leeInt();
			System.out.println("Introduce valor para b");
			b = Consola.leeInt();
			System.out.println("El resultado es" +  Factorial(a));
			break;		
		default:
			resp=10;
			break;
		}
	}while(resp!=10);
}
/**
 * Metodo que eleva un n a la m
 * @author gian piero
 * @param n numero base
 * @param m exponente
 * @return el resultado de exponenciar n a la m
 */
public static double Elevar(double n, double m)
{
	return Math.pow(n, m);
}


/**
 * Metodo que calcula la raiz cuadrada de n
 * @author gian piero
 * @param n numero del que se realizara su raiz cuadrada
 * @return raiz cuadrada de n
 */
public static double RaizCuadrada(double n)
{
	try {
		if (n<0)
			throw new Exception();
	}
	catch (Exception e) {
		System.out.println("Error no se puede hacer la raiz cuadrada de un numero negativo");
	}
	return Math.sqrt(n);
}

/**
 * Metodo que calcula el valor absoluto de n
 * @author gian piero
 * @param n valor del que se obtendra su valor absoluto
 * @return valor absoluto de n
 */
public static double Absoluto(double n)
{
	return Math.abs(n);
}
  
 /**
 * Realiza la suma entre dos n�meros
 * @author Rodrigo
 * @param n numero que se sumara a m
 * @param m numero que se sumara a n
 * @return suma de n y m
 */
public static double Sumar(double n,double m) {
	System.out.println("Yo sumo dos operadores");
	return n+m;

}

/**
* Realiza la resta entre dos n�meros
* @author Rodrigo
* @param n numero al que se le restara m
* @param m numero que sera restado a n
* @return resultado de restarle m a n
*/
public static double Restar(double n,double m) {
	System.out.println("Yo resto dos operadores");
	return n-m;

}

/**
* Realiza la multiplicacion entre dos n�meros
* @author Rodrigo
* @param n numero que se multiplicara por m
* @param m numero que se multiplicara por n
* @return resultado de multiplicar n y m
*/
public static double Multiplicar(double n,double m) {
	System.out.println("Yo multiplico dos operadores");
	return n*m;

}

/**
 * Realiza la divisi�n entre dos n�meros.
 * Lanza excepcion cuando el divisor es 0
 * @author Rodrigo
 * @param n dividendo
 * @param m divisor
 * @return resultado de dividir n entre m
 */
public static double Dividir(double n,double m) throws ErrorDivision0{
	System.out.println("Yo divido dos operadores");
	
		if(m==0)
			throw new ErrorDivision0("Division por 0.");
		return n/m;	

}

/**
 * Realiza el logaritmo de n con base m
 *
 * @author Rodrigo
 * @param n numero del logaritmo
 * @param m base del logaritmo
 * @return resultado de realizar el logaritmo de n con base m
 */
public static double Logaritmo(double n,double m) {
	
	System.out.println("Yo hago el logaritmo de dos operadores");
	
	return Math.log(n) / Math.log(m);
	
}


/**
 * Metodo que calcula el binario absoluto de n
 * @author gian piero
 * @param n numero decimal del que se desea saber su binario
 * @return numero binario correspondiente al numero decimal recibido (n)
 */
public static double Binario(double n)
{
	return  Double.parseDouble(Integer.toBinaryString((int)n)) ;
}


/**
 * Metodo que calcula el factorial de n
 * @author gian piero
 * @param n numero del que se desea saber su factorial
 * @return factorial de n
 */
public static double Factorial(double n)
{
	int i=1;
	for (int cont=(int) n; cont>0; cont--)
	{
		i*=cont;
	}
	return i;
}

}
