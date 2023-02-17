/**
 * 
 */
package estructuraDatos;

/**
 * @author Abraham Mellado
 *
 */
public class CTrabajor extends CPersona {
	
	private int codigoSede;
	private int numeroSS;
	private String tipo;
	private int identificador;
	private static int contador;
	
	
	public CTrabajor(String nif, String nombre, String apellidos, String domicilio, String telefono, int codigoSede,
			int numeroSS, String tipo) {
		super(nif, nombre, apellidos, domicilio, telefono);
		this.codigoSede = codigoSede;
		this.numeroSS = numeroSS;
		this.tipo = tipo;
		this.identificador=contador;
		contador++;
	}
	
	
	
	
	
	
	
	
	
	

}
