package agendacontactos;

import java.util.ArrayList;

/**
 * Clase para gestionar una agenda telefónica formada por objetos de la clase
 * Contacto los contactos se guardarán en una lista dinámica (ArrayList)
 * 
 * @author DW1E
 *
 */
public class AgendaTelefonica {

	private ArrayList<Contacto> listaContactos;

	/**
	 * Constructor único que inicializa la lista de contactos
	 */
	public AgendaTelefonica() {

		listaContactos = new ArrayList<>();
	}

	/**
	 * Método interno -no público- para determinar si NO existe un contacto en la
	 * agenda
	 * 
	 * @param c objeto de la clase Contacto que queremos
	 * @return verdadero NO no existe un contacto con el mismo nombre y apellidos,
	 *         falso en otro caso
	 */
	boolean noExiste(Contacto c) {
		boolean noExiste=true;
		for (Contacto a : listaContactos) {
			if (a.equals(c)) {
				//hemos encontrado el contacto: cambiamos noExiste y salimos del bucle
				noExiste=false;
				break;
			}
		}
		return noExiste;
	}

	/**
	 * Método para agregar un nuevo contacto al final de la agenda
	 * 
	 * @param c objeto de la clase Contacto
	 * @return true si no existe otro contacto "igual" (con el mismo
	 *         nombre-apellidos) y lo agrega a la agenda
	 */
	public boolean agregarContacto(Contacto c) {
		boolean agregado = false;

		if (noExiste(c)) {
			agregado = listaContactos.add(c);
		}
		return agregado;
	}

	/*
	 * Solución de Daniel public boolean agregarcontacto(Contacto e) { boolean
	 * añadido = false; boolean contador=false; for (int i = 0; i <
	 * listaContactos.size() && !contador; i++) { Contacto miContacto =
	 * listaContactos.get(i); if (e.equals(miContacto)) { contador=true; } }
	 * if(!contador) { añadido=listaContactos.add(e); }
	 * 
	 * return añadido;
	 * 
	 * }
	 */

	/**
	 * Método para agregar un nuevo contacto en una posición de la agenda
	 * 
	 * @param c        objeto de la clase Contacto que queremos agregar
	 * @param posicion entero con la posición en la agenda donde lo insertaremos
	 * @return true si el contacto no existe ya en la agenda (con ese
	 *         nombre-apellidos) y se puede insertar en la posición pedida
	 */
	public boolean agregarContacto(Contacto c, int posicion) {

		boolean agregado = false;

		try {
			if (noExiste(c)) {
				listaContactos.add(posicion, c);
				agregado = true;
			}

		} catch (IndexOutOfBoundsException e) {
			// si se produce la excepción por no existir esa posición en la lista, no hacemos nada
			;
		}
		return agregado;
	}

	/**
	 * Método que lista los contactos de la agenda, en el orden en que se agregaron
	 */

	public void listarAgenda() {
		for (Contacto ele : listaContactos) {
			System.out.println(ele);
		}
	}

	/**
	 * Método para localizar un contacto en la agenda y obtener su teléfono
	 * 
	 * @param nombre    cadena con el nombre
	 * @param apellidos cadena con los apellidos
	 * @return cadena con el teléfono, si encuentra un contacto con ese nombre
	 *         -apellidos ("No encontrado" en otro caso)
	 */
	public String localizarContacto(String nombre, String apellidos) {

		String telefono = "No encontrado";

		for (Contacto ele : listaContactos) {

			if (ele.getApellidos().equalsIgnoreCase(apellidos)) {
				if (ele.getNombre().equalsIgnoreCase(nombre)) {
					telefono = ele.getTelefono(); // recuperamos el teléfono del contacto
					break; // abandonamos el bucle
				}
			}
		} // fin del bucle

		return telefono;

	}

	/**
	 * Método para localizar un contacto en la agenda y obtener su nombre y
	 * apellidos
	 * 
	 * @param telefono cadena con el teléfono
	 * @return cadena con el nombre y apellidos, si existe un contacto con ese
	 *         teléfono ("No encontrado" en otro caso)
	 */
	public String localizarContacto(String telefono) {
		String devuelto = "No encontrado";

		boolean encontrado = false;

		int posicion = 0;
		Contacto c;
		while (posicion < listaContactos.size() && !encontrado) {
			c = listaContactos.get(posicion);
			if (c.getTelefono().equals(telefono)) {
				devuelto = c.getNombre() + " " + c.getApellidos();
				encontrado = true;
			}
			posicion++;
		}
		/*
		 * Si se plantea con un bucle for-each, el código es más ágil for (Contacto c :
		 * listaContactos) { if (c.getTelefono().equals(telefono)) { devuelto =
		 * c.getNombre()+ " "+c.getApellidos(); break; //abandonamos la búsqueda }
		 * 
		 * }
		 * 
		 */

		return devuelto;
	}

	/**
	 * Método para localizar un contacto en la agenda y eliminarlo de la lista
	 * 
	 * @param nombre    cadena con el nombre
	 * @param apellidos cadena con los apellidos
	 * @return verdadero si se localizó y eliminó un contacto con ese
	 *         nombre-apellidos; falso en caso contrario
	 */
	public boolean eliminarContacto(String nombre, String apellidos) {

		boolean encontrado = false;

		for (Contacto element : listaContactos) {
			if (element.getApellidos().equalsIgnoreCase(apellidos)) {
				if (element.getNombre().equalsIgnoreCase(nombre)) {
					encontrado = listaContactos.remove(element); // eliminamos el nodo con remove
					break; // abandonamos el bucle
				}
			}
		}

		return encontrado;
	}

}
