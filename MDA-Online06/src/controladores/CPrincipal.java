/**
 * 
 */
package controladores;

import utilidades.*;

import estructuraDatos.*;
import java.util.Scanner;

/**
 * @author Abraham Mellado Domene
 *
 */
public class CPrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String nif = "", nombre = "", apellidos = "", domicilioUsu = "", telefonoUsu = "";
		String codigoProduc = "", nombreProduc = "", descripcion = "";//declaramos las variables de la clase principal que pasaran por herencia a los metodos
		String codSede = "", domicilioSede = "", telefonoSede = "", localidadSede = "", refCatastral = "";
		String nuevonombreProduc = "", nuevaDescripcion = "";
		float nuevoPrecio = 0;
		int unidadesProduc = 0, metrosCuadradosSede = 0, posProduc;
		float precioCompra = 0.0f;
		int menuPrinc = 0, opcion = 0, menuComprobador = 0;
		int pos, identificador = 0;
		Scanner sc = new Scanner(System.in);
		CControlador controlador = new CControlador();//instanciamos la clase controlador con nombre de variable de objeto controlador
		controlador.agregarProducto(new CProducto("001", "aspirina", "pastilla", 30, 2.20f));
		controlador.agregarProducto(new CProducto("002", "frenadol", "diluido", 50, 3.50f));
		controlador.agregarProducto(new CProducto("003", "omeprazol", "capsula", 45, 1.50f));
		controlador.agregarProducto(new CProducto("004", "ibuprofeno", "pastilla", 55, 3.33f));
		controlador.agregarProducto(new CProducto("005", "paracetamol", "pastilla", 2, 2.99f));
		//parametrizamos los contructores de productos para tener unos añadidos de ejemplo
		do {//iniciamos un bucle do-while
			try {

				menuPrinc = CES.opcionMenu();//indicamos la variable opcion es igual al metodo opcionMenu

				switch (menuPrinc) {//pasamos el retorno del metodo al switch
				case 1:
					nif = CES.leerNif("Introduce Nif:");//procedemos a pedir al usuario los parametros del constructor 
					CComprobarDatos.comprobarNif(nif);
					nombre = CES.leerCadenas("Introduce nombre:");
					apellidos = CES.leerCadenas("Introduce apellidos:");
					domicilioUsu = CES.leerCadenas("Introduce domicilio:");
					telefonoUsu = CES.leerTelefono("Introduce telefono:");
					controlador.agregarPersona(new CPersona(nif, nombre, apellidos, domicilioUsu, telefonoUsu));//instanciamos el contructor con los parametros anteroires
					break;
				case 2://realizamos las mismas operaciones para el segundo caso pero con productos
					codigoProduc = CES.leerCadenas("Introduce codigo de producto:");
					CComprobarDatos.comprobarCodigoProducto(codigoProduc);
					nombreProduc = CES.leerCadenas("Introduce el nombre del prodcuto");
					descripcion = CES.leerCadenas("Introduce la descripcion del producto");
					unidadesProduc = CES.leerEntero("Introduce las unidades del producto(numero)");
					precioCompra = CES.leeDecimal("Introduce el precio del producto(con decimales)");

					controlador.agregarProducto(
							new CProducto(codigoProduc, nombreProduc, descripcion, unidadesProduc, precioCompra));
					break;
				case 3://para metrzamos el contructor sede con pidiendo los datos por pantalla
					codSede = CES.leerCadenas("Introduce el codigo de la sede");
					domicilioSede = CES.leerCadenas("Introduce un domicilio de la sede");
					telefonoSede = CES.leerTelefono("Introduce el telefono de la sede:");
					localidadSede = CES.leerCadenas("Introduce la localidad de la seda");
					metrosCuadradosSede = CES.leerEntero("Introduce los metros cuadrados de la sede");
					refCatastral = CES.leerCadenas("introduce la referencia catrastral");
					CComprobarDatos.comprobarRefCatastral(refCatastral);
					controlador.agregarSede(new CSede(codSede, domicilioSede, telefonoSede, localidadSede,
							metrosCuadradosSede, refCatastral));

					break;
				case 4:
					CControlador.obtenerListaPersonas();//llamamos al metodo obtenerListaPersonas
					break;
				case 5:
					CControlador.obtenerTodosProductos();//llamamos al metodo obtenerTodosProductos
					break;
				case 6:
					CControlador.obtenerListaSede();//llamamos al método obtenerListaSede
					break;
				case 7:
					nombreProduc = CES.leerCadenas("Introduce el nombre del producto:");//introducimos el nombre del producto  y se lo asignamos a la variable
					System.out.println(controlador.obtenerProducto(nombreProduc));//Imprimimos el metodo
					break;
				case 8:
					posProduc = CES.leerEntero("Introduce el identificador del producto");//pedimos el identificador al usuario y lo asignamos al producto
					pos = controlador.obtenerProducto(posProduc);//indiciamos que la variable pos es igual al metodo 
					if (pos == -1) {
						System.out.println("Producto no encontrado");
					} else {
						System.out.println("Producto encontrado");
					}
					break;
				case 9:
					if (controlador.consultarEspacio()) {//En caso de devolver true en metodo, mandamos el siguiente mensaje al usuario
						System.out.println("Queda espacio");
					}
					break;
				case 10:
					nombreProduc = CES.leerCadenas("Introduce el nombre del producto que desea modificar:");//pedimos al usuario los datos a modificar
					nuevonombreProduc = CES.leerCadenas("Introduce el nuevo nombre del producto:");
					nuevaDescripcion = CES.leerCadenas("Introduce la nueva descripción del producto:");
					nuevoPrecio = CES.leeDecimal("Introduce el nuevo precio:");
					controlador.modificarProducto(nombreProduc, nuevonombreProduc, nuevaDescripcion, nuevoPrecio);//llamamos al metodo con los parametros anteriores
					break;

				case 11:
					nombreProduc = CES.leerCadenas("Introduce el nombre del producto:");//pedimos el nombre del producto
					unidadesProduc = CES.leerEntero("Introduce las nuevas unidades del producto");//introducimos las nuevas unidades
					controlador.agregarUnidadesProducto(nombreProduc, unidadesProduc);//pasamos al metodo los parametros anteriores
					break;
				case 12:
					nombreProduc = CES.leerCadenas("Introduce el nombre del producto:");//pedimos al usuario el nombre del producto
					unidadesProduc = CES.leerEntero("Introduce las nuevas unidades del producto");//introdcimos las nuevas unidades 
					controlador.quitarUnidadesProducto(nombreProduc, unidadesProduc);//parametrizamos el metodo con los datos anteriores
					break;
				case 13:
					nombreProduc = CES.leerCadenas("Introduce el nombre del producto que desa eliminar:");//pedimos el nombre del producto al usuario
					controlador.eliminarProducto(nombreProduc);//pasamos al metodo el nombre del producto
					break;
				case 14:
					identificador = CES.leerEntero("Introduzca el identificador del producto que desea eliminar");//pedimos el identificador del producto
					controlador.eliminarProducto(identificador);//pasamos el identificador al metodo
					break;

				case 15:
					nif = CES.leerCadenas("Introcue el nif para validar:");//pedimos el nif y lo asignamos a la variable
					CComprobarDatos.comprobarNif(nif);//llamamos al metodo que nos permite realizar la comprobacion
					break;

				case 16:
					refCatastral = CES //pedimos la refCatrastral al usuario
							.leerCadenas("Introdudce la referencia catastral para validar(considere los espacios):");
					CComprobarDatos.comprobarRefCatastral(refCatastral);//pasamos la variable al metodo
					break;
				case 17:
					codigoProduc = CES.leerCadenas("Introduce el codigo del producto sin espacios:");//pedimos al usuario el codigo y lo asignamos a la variable
					CComprobarDatos.comprobarCodigoProducto(codigoProduc);//pasamos al metodo la variable
					break;
				}

			} catch (Exception e) {//controlamos las excepciones y en caso de introducir caracteres mandamos el siguiente mensaje
				System.out.println("Introduce solo valores numericos...");
			}

		} while (menuPrinc != 18);//establecemso la salida del bucle 
		System.out.println("Saliendo....");//lanzamos un mensaje al salir del programa
	}

}
