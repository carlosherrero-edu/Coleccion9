package agendacontactos;

public class Contacto {

	protected String nombre;
	protected String apellidos;
	protected String telefono;

	/**
	 * Constructor único de la clase
	 * @param nombre cadena no vacía
	 * @param apellidos cadena no vacía
	 * @param telefono cadena no vacía
	 */
	public Contacto(String nombre, String apellidos, String telefono) {

		if (nombre.length() < 1 || apellidos.length() < 1 || telefono.length() < 1) {

			// falta algún campo obligatorio
			throw new IllegalArgumentException("Falta algún campo obligatorio");
		}

		setNombre(nombre);
		setApellidos(apellidos);
		setTelefono(telefono);

	}

	// métodos get públicos
	public String getNombre() {
		return this.nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public String getTelefono() {
		return this.telefono;
	}

	// métodos set privados
	private void setNombre(String unNombre) {
		this.nombre = unNombre;
	}

	private void setApellidos(String unApe) {

		this.apellidos = unApe;
	}

	private void setTelefono(String unTfno) {

		this.telefono = unTfno;
	}

	@Override
	public String toString() {
		String cadena = "Nombre: " + this.nombre + "  Apellidos: " + this.apellidos + "  Telefono: " + this.telefono;
		return cadena;

	}

	/**
	 *Método equals sobreescrito de Object
	 *Considera 2 objetos iguales si el nombre y apellidos coinciden, salvo diferencias mayúsculas/minúsculas
	 */
	@Override
	public boolean equals(Object otro) {

		boolean sonIguales = false;

		// primero se comprueba si ese objeto pertenece a la clase Contacto, con
		// instanceof,
		// que es un operador logico
		if (otro instanceof Contacto) {
			Contacto otroContact = (Contacto) otro;
			// comparacion de propiedades de autor y titulo
			// se usa getX().equalsIgnoreCase porque se comparan strings
			if (getApellidos().equalsIgnoreCase(otroContact.getApellidos())) {
				if (getNombre().equalsIgnoreCase(otroContact.getNombre())) {
					sonIguales = true;
				}
			}
		}
		return sonIguales;
	}

}
