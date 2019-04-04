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

}
private static int Sumar() {
	System.out.println("Yo sumo dos operadores");
	return 0;

}

/**
 * Metodo que recibe 2 valores y realiza el producto de estos mismos
 * @param a valor que recibe el parametro
 * @param b valor que recibe el parametro
 * @return devuelve el resultado de multiplicar los valores
 * @author gian piero
 */
private static double multiplicar(int a, int b)
{
	return a*b;
}

/**
 * Metodo que recibe un numero y calcula su raiz cuadrada o saca un mensaje de error en caso
 * de no poder hacerlo
 * 
 * @param valor que recibe el parametro
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
 * Metodo que recibe un numero y devuelve el valor absoluto de este
 * @param valor que recibe el parametro
 * @return devuelve el resultado de calcular el valor absoluto
 */
private static int valorAbsoluto(int a)
{
	return Math.abs(a);
}

}
