/**
 * 
 */
package estructuraDatos;

/**
 * @author Abraham Mellado Domene
 *
 */

public class CPersona {
	private String nif; //Declaramos los atributos de la clase
	private String nombre;
	private String apellidos;
	private String domicilio;
	private String telefono;
	private int identificador;//añadimos un identificador para ver la posicion de cada persona añadida
	private static int contador=1; //inicializamos el contador en 1

	
	public CPersona(String nif, String nombre, String apellidos, String domicilio, String telefono) {//generamos el constructor de la clase personas
		this.identificador=contador; //establecemos que identificador es igual al contador
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.domicilio = domicilio;
		this.telefono = telefono;
		contador++; //sumamos 1 en cada iteraccion del contador
	}

	public String getNif() { //realizamos los getters and setters de los atributos o variables
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() { //generamos un toString de los atributos o variables
		return "Lista Usuarios [identificador "+identificador + "nif= " + nif + ", nombre= " + nombre + ", apellidos= " + apellidos + ", domicilio= " + domicilio
				+ ", telefono= " + telefono +"]";
	}
	 

	
	
	
}
