/**
 * 
 */
package estructuraDatos;

/**
 * @author Abraham Mellado Domene
 *
 */
public class CSede { // Colocamos los atributos de la clase Sede
	private String codigo;
	private String domicilio; 
	private String telefono;
	private String localidad;
	private int metrosCuadrados;
	private String refCatastral;
	private int identificador; //añadimos un identificador para establecer la posicion que se va generando  
	private static int contador = 1;//iniciamos un contador en 1 para que empieze desde ahi y se sume en cada agegacion de producto
	
	
	public CSede(String codigo, String domicilio, String telefono, String localidad, int metrosCuadrados,//generamos el constructor de la clase sede
			String refCatastral) {
		super();
		this.codigo = codigo;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.localidad = localidad;
		this.metrosCuadrados = metrosCuadrados;
		this.refCatastral = refCatastral;
		this.identificador=contador; //Indicamos identificador es igual a contador para que este se sume en cada reiteracion
		contador++; //sumamos uno en cada reiteracion
	}
	public String getCodigo() { //generamos los getter and setter para poder acceder a los atributos desde otras clases
		return codigo;
	}
	public void setCodigo(String codigo) { //Con setter modificamos las variables y con getter las obtenemos
		this.codigo = codigo;
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
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}
	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
	public String getRefCatastral() {
		return refCatastral;
	}
	public void setRefCatastral(String refCatastral) {
		this.refCatastral = refCatastral;
	}
	@Override
	public String toString() { //Realizamos el metodo toString para imprimir el contenido de las variables
		return "CSede [identificador= " + identificador + ", codigo=" + codigo + ", domicilio=" + domicilio
				+ ", telefono=" + telefono + ", localidad=" + localidad + ", metrosCuadrados=" + metrosCuadrados
				+ ", refCatastral=" + refCatastral + "]";
	}
	
	
	

	

	}
	

