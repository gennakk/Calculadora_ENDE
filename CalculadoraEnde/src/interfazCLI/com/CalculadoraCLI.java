package interfazCLI.com;

import java.util.function.BinaryOperator;

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
	/*
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
		System.out.println("9- ");
		System.out.println("10-SALIR ");
		resp = Consola.leeInt();
		if (resp==1)
		{
			System.out.println("Introduce valor para a");
			int a = Consola.leeInt();
			System.out.println("Introduce valor para b");
			int b = Consola.leeInt();
			System.out.println("El resultado es" +  multiplicar(a,b));
		}
		else
		{
			if (resp==2)
			{
				System.out.println("Introduce valor para a");
				int a = Consola.leeInt();
				System.out.println("Introduce valor para b");
				int b = Consola.leeInt();
				System.out.println("El resultado es" +  multiplicar(a,b));
			}
			else
			{
				if (resp==3)
				{
					System.out.println("Introduce valor para a");
					int a = Consola.leeInt();
					System.out.println("Introduce valor para b");
					int b = Consola.leeInt();
					System.out.println("El resultado es" +  multiplicar(a,b));
				}
				else
				{
					if (resp==4)
					{
						System.out.println("Introduce valor para a");
						int a = Consola.leeInt();
						System.out.println("Introduce valor para b");
						int b = Consola.leeInt();
						System.out.println("El resultado es" +  multiplicar(a,b));
					}
					else
					{
						if (resp==5)
						{
							System.out.println("Introduce valor para a");
							int a = Consola.leeInt();
							System.out.println("El resultado es" +  raizCuadrada(a));
						}
						else
						{
							if (resp==6)
							{
								System.out.println("Introduce valor para a");
								int a = Consola.leeInt();
								System.out.println("El resultado es" +  valorAbsoluto(a));
							}
							else
							{
								if (resp==6)
								{
									System.out.println("Introduce valor para a");
									int a = Consola.leeInt();
									System.out.println("El resultado es" +  valorAbsoluto(a));
								}
								else
								{
									if (resp==7)
									{
										System.out.println("Introduce valor para a");
										int a = Consola.leeInt();
										System.out.println("El resultado es" +  valorAbsoluto(a));
									}
									else
									{
										if (resp==8)
										{
											System.out.println("Introduce valor para a");
											int a = Consola.leeInt();
											System.out.println("El resultado es" +  (a));
										}
										
									}
								}
							}
						}
					}
				}
			}
		}
	}while(resp!=10);
	*/
}
/**
 * Metodo que eleva un n a la m
 * @author gian piero
 */
public static double Elevar(double n, double m)
{
	return Math.pow(n, m);
}


/**
 * Metodo que calcula la raiz cuadrada de n
 * @author gian piero
 */
private static double raizCuadrada(double n)
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
 */
public static double absoluto(double n)
{
	return Math.abs(n);
}
  
 /**
 * Realiza la suma entre dos números
 * @author Rodrigo
 */
public static double Sumar(double n,double m) {
	System.out.println("Yo sumo dos operadores");
	return n+m;

}

/**
 * Realiza la división entre dos números.
 * Lanza excepcion cuando el divisor es 0
 * @author Rodrigo
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
 */
public static double Logaritmo(double n,double m) {
	
	System.out.println("Yo hago el logaritmo de dos operadores");
	
	return Math.log(n) / Math.log(m);
	
}







/**
 * Metodo que calcula el binario absoluto de n
 * @author gian piero
 */
public static double binario(double n)
{
	return  Double.parseDouble(Integer.toBinaryString((int)n)) ;
}


/**
 * Metodo que calcula el factorial de n
 * @author gian piero
 */
public static double factorial(double n)
{
	int i=1;
	for (int cont=(int) n; cont>0; cont--)
	{
		i*=cont;
	}
	
	return i;
}

}