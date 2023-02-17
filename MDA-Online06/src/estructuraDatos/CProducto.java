/**
 * 
 */
package estructuraDatos;

/**
 * @author Abraham Mellado Domene
 *
 */
public class CProducto {
	private String codigo; //añadimos los atributos de la clase Producto
	private String nombre;
	private String descripcion;
	private int unidades;
	private float precioCompra;
	private int identificador; //añadimos un identificador para establecer la posicion que se va generando 
	private static int contador = 1; //iniciamos un contador en 1 para que empieze desde ahi y se sume en cada agegacion de producto 

	public CProducto(String codigo, String nombre, String descripcion, int unidades, float precioCompra) { //realizamos el constructor de la clase producto
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.unidades = unidades;
		this.precioCompra = precioCompra;
		this.identificador = contador; //indicamos que la variable identificador es igual al contador
		contador++; //en cada reiteracion de contador sumamos 1
	}

	public String getCodigo() { //Generamos los getters and setters de los atributos para poder acceder a ellos puesto que son privados
		return codigo;			//Con setter modificamos las varibles desde otra clase y con getter obtenemos el contenido de las variables
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public float getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	@Override
	public String toString() { //generamos un toString para poder imprimir por pantalla los atributos o variables
		return "CProducto [identificador= " + identificador + ", codigo=" + codigo + ", nombre=" + nombre
				+ ", descripcion=" + descripcion + ", unidades=" + unidades + ", precioCompra=" + precioCompra + "]";
	}

}
