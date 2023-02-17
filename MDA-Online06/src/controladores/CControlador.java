/**
 * 
 */
package controladores;

import estructuraDatos.CPersona;
import estructuraDatos.CProducto;
import estructuraDatos.CSede;

/**
 * @author Abraham Mellado Domene
 *
 */
public class CControlador {
	private static CProducto[] productos; //decalaramos como atributos los arrays productos personas y sedes
	private static CPersona[] personas;
	private static CSede[] sedes;
	private int numProductos = 0; //establecemos como atributo la inicializacion del array
	private int numPersonas;
	private int numSedes;
	private int tamProducto = 100; //establecemos como atributos el tamaño de los array
	private int tamPersona = 100;
	private int tamSede = 10;
	
	
	public CControlador() { //Inicializamos los arrays a traves del contructor de controlador
		productos = new CProducto[tamProducto];
		numProductos=0;						   //inicializamos todos los arrays en cero
		personas = new CPersona[tamPersona];
		numPersonas = 0;
		sedes = new CSede[tamSede];
		numSedes = 0;
	}

	public  void agregarProducto(CProducto nuevo) {//metodo por el cual agregamos un nuevo producto  con los parametros del constructor Producto
		if (numProductos < productos.length) {//indicamos que si numeros de productos es inferior al total de array reciva el nuevo producto por herencia
			productos[numProductos] = nuevo; //Si la condicion anterior se cumple, nuevo se asigna a una nueva posicion en el array
			numProductos++;//indicamos que cada vez se ejecute cuente una posicion mas
			
		} else {
			System.err.println("Inventario lleno, no se pueden introducir mas productos.");//en caso de estar lleno el array indicamos al usuario que no se pueden añadir mas
		}
	}

	public void agregarPersona(CPersona nueva) {//metodo por el cual se agrega una persona a traves de su contructor

		if (numPersonas < personas.length) { //indicamos que si numpersonas es menor al tamaño del array añada la recibida
			personas[numPersonas] = nueva; //introducimos nueva en la posicion del array
			numPersonas++;//sumamos una iteracion a numpersonas(determina la pos en el array) cada vez que llamemos al metodo
		} else {
			System.err.println("Alcanzo el maximo de usuarios,no se pueden introducir mas.");//
		}
	}

	public void agregarSede(CSede nueva) { //metodo por el cual añadimos una nueva sede
		if (numSedes < sedes.length) { //establecemos que si el array es mayor a la posicion de las sedes prodeca a añadir
			sedes[numSedes] = nueva;//añadimos nueva el la posicion del array
			numSedes++;//añadimos 1 en cada llamada al metodo 
		} else
			System.err.println("No se pueden añadir mas sedes.");//en caso de no ser mayor el tamaño del array mostramos el mensaje anterior
	}

	public static boolean obtenerTodosProductos() {//metodo por el cual se muestra la lista de productos
		int i;
		for (i = 0; i < productos.length; i++) {//recoremos el array desde 0 hasta el tamaño total
			if (productos[i] != null) {//si las posiciones en el array son diferentes a null
				System.out.println(productos[i]);//las imprimimos por pantalla
			}
		}
		return true;
	}

	public static boolean obtenerListaPersonas() {//realizamos lo mismo que el metodo de mostrar productos pero con personas
		int i;
		for (i = 0; i < personas.length; i++) {
			if (personas[i] != null) {
				System.out.println(personas[i]);
			}
		}
		return true;
	}

	public static boolean obtenerListaSede() {//realizamos lo mismo que el metodo de obtener productos pera para sedes
		int i;
		for (i = 0; i < sedes.length; i++) {
			if (sedes[i] != null) {
				System.out.println(sedes[i]);
				

			}
		}
		return true;
	}

	public  String obtenerProducto(String nombreProduc) {//establecemos un método para buscar los productos por nombre
		int pos = -1;
		for (int i = 0; i < numProductos && pos == -1; i++) {  //recorremos el array
			if (productos[i].getNombre().equals(nombreProduc)) {//establecemos que si el nombre recibido es igual al nombre del array la posicion es igual a la posicion i
				pos = i;
			}
		}
		if (pos == -1) {//si la pos es -1, estando fuera del array mandamos un mensaje de que no se encontro el producto
			return "El producto no se encuentra en el inventario.";
		} else {
			return "El producto se encuentra en la posición: " + pos;//En caso de ser encontrada devuelve la pos mas un mensaje por pantalla
		}

	}

	public int obtenerProducto(int posicion) {//establecemos un metodo para buscar un producto por la posicion recibida
		int pos = -1;//inicializamos pos en -1 estando fuera del array
		for (int i = 0; i < numProductos && pos == -1; i++) {//recorremos el array
			if (productos[i].getIdentificador() == (posicion)) { //indicamos que si posicion dada es igual que el identificador pase a i
				pos = i;
			}
		}
		return pos;//retornamos la posicion

	}

	public boolean consultarEspacio() {// establecemos un metodo booleano para consultar el espacio
		return numProductos < tamProducto;//indicamos que si el tamaño del array es mayor a el numero de productos mande true
	}

	public boolean modificarProducto(String nombreProduc,String nuevoNombreProduc,String nuevaDescripcion,float nuevoPrecio){
		int pos = -1; //inicializamos pos en -1
		for (int i = 0; i < numProductos && pos == -1; i++) { //recorremos el array 
			if (productos[i].getNombre().equals(nombreProduc)) { //establecemos que si el nombre del array es igual al nombre del producto posicion sera igual a i que recorre el bucle
				pos = i;
			}
		}
		if (pos == -1) {//si no se encuentra la poscion en el array devuelve el siguiente mensaje
			System.out.println("El producto no se ha podido modificar");
			
			return false;
		} else {
			productos[pos].setNombre(nuevoNombreProduc); //pasamos la posicion al array y modicicamos con setNombre 
			productos[pos].setDescripcion(nuevaDescripcion);//repetimos las operaciones igual al nombre
			productos[pos].setPrecioCompra(nuevoPrecio);
			System.out.println("El producto se ha modicado correctamente"); // mandamos un mensaje al usuario al termianar las modificaciones
			
				return true;
		}
	}
	public boolean agregarUnidadesProducto(String nombreProduc,int nuevaUnidad) { //establecemos un metodo para agregar unidades al producto
		int pos = -1;//inicializamos en -1
		for (int i = 0; i < numProductos && pos == -1; i++) { //recorremos el array
			if (productos[i].getNombre().equals(nombreProduc)) { //buscamos el podructo por nombre y le asignamos i(posicion en la cual se encuentra el nombre) a pos
				pos = i;
			}
		}
		if (pos == -1) {//si no se encuentra la posicon en el array mostramos el siguiente mensaje
			System.out.println("el producto no se ha podido encontrar");
			
			return false;
		}else if (productos[pos].getUnidades() < nuevaUnidad) {//establecemos que si la nueva unidad recibida es mayor a la existente la almacene en el array
			productos[pos].setUnidades(nuevaUnidad);
			return true;
		}else
			System.out.println("No se pueden disminuir las unidades del producto o introducir las mismas");//en caso contrario de que sea menor mostramos un mensaje estableciendo que no se pueden disminuir
		return false;
	}
	public boolean quitarUnidadesProducto(String nombreProduc,int nuevaUnidad) {//establecemos un metodo para quitar unidades a un producto
		int pos = -1;
		for (int i = 0; i < numProductos && pos == -1; i++) {//recoremos el array
			if (productos[i].getNombre().equals(nombreProduc)) {//establemos que si se encuentra el nombre al recorrer el array guarde la posicion recorrida en i
				pos = i;
			}
		}
		if (pos == -1) {//en caso de ser menos 1 mandamos un mensaje que no se puede encontrar 
			System.out.println("el producto no se ha podido encontrar");
			
			return false; //en caso de entrar la posicion pasara a al array y la obtenedremos para verificar si es menor a la actual
		}else if (productos[pos].getUnidades() > nuevaUnidad) {
			productos[pos].setUnidades(nuevaUnidad);//en caso de ser menor la mandaremos la nueva unididad
			return true;
		}else
			System.out.println("No se pueden aumentar las unidades del producto o introducir las mismas");//en caso de ser mayor indicaremos que no se puede añadir mas
		return false;
	}
	public boolean eliminarProducto(String nombreProduc) {//establecemos un metodo por el cual se recibe el nombre del producto
	    int pos = -1;
	    for (int i = 0; i < numProductos && pos == -1; i++) {//recorremos el array
	        if (productos[i].getNombre().equals(nombreProduc)) {//buscamos el nombre igual en el array para obtener su posicion
	            pos = i;
	        }
	    }
	    if (pos == -1) {//en caso de no ser obtenido mandamos un mensaje de no encontrado
	        System.out.println("el producto no se ha podido encontrar");
	        return false;
	    }
	    CProducto[] nuevoArray = new CProducto[productos.length - 1]; // en caso de ser encontrado creamos un nuevo array menos una posicion
	    int j = 0;
	    for (int i = 0; i < productos.length; i++) { //recorremos nuestro array
	        if (i != pos) {
	            nuevoArray[j] = productos[i]; //establecemos que el nuevo array en igual al array productos
	            j++;
	        }
	    }
	    productos = nuevoArray;//establecemos que productos ahora es igual que el array
	    numProductos--;//retrocedemos posicion
	    return true;
	}
	public boolean eliminarProducto(int idenficador) {//establecemos el mismo metodo que el anterior pero buscando por identificador
	    int pos = -1;
	    for (int i = 0; i < numProductos && pos == -1; i++) {
	        if (productos[i].getIdentificador()==(idenficador)) {
	            pos = i;
	        }
	    }
	    if (pos == -1) {
	        System.out.println("el producto no se ha podido encontrar");
	        return false;
	    }
	    CProducto[] nuevoArray = new CProducto[productos.length - 1];
	    int j = 0;
	    for (int i = 0; i < productos.length; i++) {
	        if (i != pos) {
	            nuevoArray[j] = productos[i];
	            j++;
	        }
	    }
	    
	    
	    productos = nuevoArray;
	    numProductos--;
	    return true;
}
	private int buscarProductos(String nombreProduc) {//establecemos el mismo metodo de busqueda pero privado
		int pos = -1;
		for (int i = 0; i < numProductos && pos == -1; i++) {
			if (productos[i].getNombre()==(nombreProduc)) {
				pos = i;
			}
		}
		if (pos == -1) {
			System.out.println("El producto no se encuentra en el inventario.");
			
		} else {
			System.out.println("El producto se encuentra en la posición: " + pos);
		}
		return pos;
		
		
	}
	private int primeraPosicionVacia() {//establecemos un metodo para ver la primera posicion vacia del array
		int i;
		int pos = -1;
		for(i=0; i < numProductos && pos == -1; i++);//recorremos nuestro array productos
		if(productos[i] == null); //establecemos que al encontrar una posicion null o vacia esta pasará a través de i a ser la posicion en el array
		return pos=i;
		
	}

	@Override //generamos un toString para ver los atributos de clase
	public String toString() {
		return "CControlador [numProductos=" + numProductos + ", numPersonas=" + numPersonas + ", numSedes=" + numSedes
				+ ", tamProducto=" + tamProducto + ", tamPersona=" + tamPersona + ", tamSede=" + tamSede + "]";
	}
	
	
}
		
	





