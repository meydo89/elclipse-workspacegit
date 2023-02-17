/**
 * 
 */
package utilidades;

import java.util.Scanner;

import controladores.CControlador;
import estructuraDatos.CPersona;

/**
 * @author Abraham Mellado Domene
 *
 */
public class CES {

	public static int opcionMenu() {//establecemos un menu a traves de un metodo
		Scanner sc = new Scanner(System.in);
		int opcion;
		System.out.println("MENU DE FARMACIA");
		System.out.println("----------------");
		System.out.println("PULSE 1 PARA INTRODUCIR UN NUEVO USUARIO.");
		System.out.println("PULSE 2 PARA INTRODUCIR UN NUEVO PRODUCTO.");
		System.out.println("PULSE 3 PARA AÑADIR UNA SEDE.");
		System.out.println("PULSE 4 PARA VER TODOS LOS USUARIOS.");
		System.out.println("PULSE 5 PARA VER TODOS LOS PRODUCTOS.");
		System.out.println("PULSE 6 PARA VER TODAS LAS SEDES.");
		System.out.println("PULSE 7 PARA BUSCAR PRODUCTO POR NOMBRE.");
		System.out.println("PULSE 8 PARA BUSCAR PORDUCTO POR IDENTIFICADOR.");
		System.out.println("PULSE 9 PARA CONSULTAR ESPACIO LIBRE EN PRODUCTOS.");
		System.out.println("PULSE 10 PARA MODIFICAR UN PRODUCTO POR SU IDENTIFICADOR.");
		System.out.println("PULSE 11 PARA AGREGAR UNIDADES A UN PRODUCTO.");
		System.out.println("PULSE 12 PARA DISMINUIR UNIDADES DE PRODUCTO.");
		System.out.println("PULSE 13 PARA ELIMINAR UN PRODUCTO POR SU NOMBRE.");
		System.out.println("PULSE 14 PARA ELIMINAR UN PRODUCTO POR SU IDENTIFICADOR.");
		System.out.println("PULSE 15 PARA VALIDAR NIF.");
		System.out.println("PULSE 16 PARA VALIDAR REFENCIA CATASTRAL");
		System.out.println("PULSE 17 PARA VALIDAR CODIGO DE PRODUCTO");
		System.out.println("PULSE 18 PARA SALIR.");
		opcion = sc.nextInt();//almacenamos el dato introducido en la variable opcion
		while (opcion < 1 || opcion > 18) {//indicamos que repita el bucle hasta seleccionar una opcion valida
			System.out.print("Opción incorrecta, vuelva a introducir opcion:");
			opcion = sc.nextInt();
		}
		return opcion;//retornamos la variable opcion
	}

	public static int leerEntero() {//establecemos un metodo para leer enteros e indique fallo en caso de no ser asi, volviendolo a pedir
		Scanner sc = new Scanner(System.in);
		int entrada = 0;
		boolean validar = false;
		do {
			try {
				entrada = sc.nextInt();
				validar = true;
			} catch (Exception e) {
				System.out.println("Dato erroneo,repita");
				sc.next();
			}
		} while (validar = false);
		return entrada;
	}

	public static int leerEntero(String texto) {
		int numEnt = 0;
		Scanner teclado = new Scanner(System.in);
		boolean validacion = false;
		do {
			try {
				System.out.println(texto);
				numEnt = teclado.nextInt();
				validacion = true;
			} catch (Exception e) {
				System.out.println("Valor no valido, introduzca un numero");
				teclado.nextLine();
			}
		} while (validacion == false);
		return numEnt;

	}

	public static int leerEntero(int num1, int num2) {//establecemso un metodo en el cual compararemos dos numeros
		Scanner sc = new Scanner(System.in);
		int numEnt = 0;
		boolean validar = false;
		do {
			try {
				System.out.println("Introduzca el nuevo valor:");
				num2 = sc.nextInt();
				if (num1 < num2)
					numEnt = num2;
				validar = true;

			} catch (Exception e) {
				System.out.println("El valor introdcido no puede ser menor que el actual o un caracter,repita");
				validar = false;
				sc.next();
			}

		} while (validar == false);
		return numEnt;
	}

	public static int leerEntero(int num1, int num2, String texto) {//establecemos uno igual al anterior, pero esta vez devolvera una cadena de texto
		int numEnt = 0;
		Scanner sc = new Scanner(System.in);
		boolean validar = false;
		do {
			try {
				System.out.println(texto);
				num2 = sc.nextInt();
				if (num1 < num2)
					numEnt = num2;
				sc.next();
				validar = true;

			} catch (Exception e) {
				System.out.println("El valor introdcido no puede ser menor que el actual o un caracter,repita");
				sc.next();
				validar = false;
			}
		} while (validar == false);

		return numEnt;
	}

	public static char leerCaracter(String texto) {//establecemos un metodo que lea solo un caracter
		Scanner sc = new Scanner(System.in);
		char caracter = ' ';
		boolean validar = false;
		do {
			try {
				System.out.println(texto);
				caracter = sc.next().charAt(0);
				validar = true;

			} catch (Exception e) {
				System.out.println("Datos de entrada erroneos, introduzca un caracter");
				sc.next();
			}

		} while (validar == false);

		return caracter;
	}

	public static float leeDecimal() {//establecemos un metodo que nos permita leer decimales y controle las excepciones
		float numDeci = 0;
		Scanner sc = new Scanner(System.in);
		boolean validar = false;
		do {
			try {
				numDeci = sc.nextFloat();
				validar = true;
			} catch (Exception e) {
				System.out.println("Datos de entrada erroneos,introduzca valor decimal ");
				validar = false;
				sc.next();
			}
		} while (validar == false);

		return numDeci;
	}

	public static float leeDecimal(String texto) {//mismo metodo que el anterior pero devuelve la cadena de texto introducida
		float numDeci = 0.00f;
		Scanner sc = new Scanner(System.in);
		boolean validar = false;
		do {
			try {
				System.out.println(texto);
				numDeci = sc.nextFloat();
				validar = true;
			} catch (Exception e) {
				System.out.println("Datos de entrada erroneos,introduzca valor decimal ");
				sc.next();
				validar = false;
			}
		} while (validar == false);

		return numDeci;
	}

	public static String leerTelefono(String texto) {//establecemos un metodo para leer un numero determinado de caracteres
		String num = " ";
		Scanner sc = new Scanner(System.in);
		boolean validar = false;

		do {
			System.out.println(texto);
			num = sc.nextLine();
			if (num.length() == 9) {
				validar = true;
			} else {
				System.out.println("Telefono erroneo,repita");
				validar = false;
			}
		} while (validar == false);
		return num;
	}
	
	public static String leerNif(String texto) {//realizamos el mismo metodo que el anterior pero cambiamos el nombre para que sea mas explicito
		String num = " ";
		Scanner sc = new Scanner(System.in);
		boolean validar = false;

		do {
			System.out.println(texto);
			num = sc.nextLine();
			if (num.length() == 9) {
				validar = true;
			} else {
				System.out.println("Longitud de Nif erronea");
				validar = false;
			}
		} while (validar == false);
		return num;
	}
	

	public static float leerDecimal(String texto, float numDeci) {//establecemos un metodo para leer decimales con una cadena de texto controlando las excepciones
		Scanner sc = new Scanner(System.in);
		boolean validar = false;
		do {
			try {
				System.out.println(texto);
				numDeci = sc.nextFloat();

			} catch (Exception e) {
				System.out.println("Datos Introducidos erroneos");
				sc.next();
				validar = false;
			}
		} while (validar == false);

		return numDeci;
	}

	public static void escribir(String mensaje) {//establecemos un metodo que devulva el texto recibido en la misma linea
		System.out.print(mensaje);

	}

	public static void escribirln(String texto) {//establecemos un metodo que devuelva el texto recibido en la siguiente linea
		System.out.println(texto);
	}

	public static String leerCadenas(String texto) {//realizamos un metodo que nos permita leer cadenas de caracteres con un texto indicando la entrada
		Scanner sc = new Scanner(System.in);
		String cadena = " ";
		System.out.println(texto);
		cadena = sc.nextLine();
		return cadena;

	}

}
