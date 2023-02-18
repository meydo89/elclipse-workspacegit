/**
 * 
 */
package estructuraDatos;

/**
 * @author Abraham Mellado
 *
 */
public final class CCliente extends CPersona {
	
	private String nuemeroCuenta;
	private String localidad;
	private int identificador;
	private static int contador;
	
	
	public CCliente(String nif, String nombre, String apellidos, String domicilio, String telefono,
			String nuemeroCuenta, String localidad) {
		super(nif, nombre, apellidos, domicilio, telefono);
		this.nuemeroCuenta = nuemeroCuenta;
		this.localidad = localidad;
	}


	public String getNuemeroCuenta() {
		return nuemeroCuenta;
	}


	public void setNuemeroCuenta(String nuemeroCuenta) {
		this.nuemeroCuenta = nuemeroCuenta;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	@Override
	public String toString() {
		return "CCliente [nuemeroCuenta=" + nuemeroCuenta + ", localidad=" + localidad + "]";
	}
	
	
	
	

}
