package ejercicios;

import ejercicios.Utilidades.*;

/**
 * Clase ListaMultimedia de objetos Multimedia gestionada mediante un array
 * @author DW1E
 *
 */
public class ListaMultimedia {
	
	//propiedades
	private Multimedia[] lista;
	/**
	 * Esta propiedad guarda el número de elementos ocupados en la lista/array
	 */
	private int elementos;
	
	//constructor
	public ListaMultimedia (int capacidad) {
		
	
	   this.lista = new Multimedia[capacidad];
	   this.elementos= 0;
	}
	
	
	//métodos
	/**
	 * Devuelve el número de elementos ocupados de la lista
	 * @return valor de elementos
	 */
	public int size() {
		return this.elementos;
	}
	
	
	/**
	 * Agrega un nuevo elemento en la primera posición libre de la lista
	 * @param m
	 * @return verdadero si puede agregar el elemento; false si la lista ya está llena
	 */
	public boolean agregar (Multimedia m) {
		boolean agregado=true;
		
		if (this.elementos< lista.length) {
			//lo guardamos en la primera posición libre
			lista[this.elementos] = m;
			this.elementos++;
			//la lista no está llena: no cambiamos agregado
		} else {
			// la lista está llena, no puedo agregar más elementos
			agregado=false;
		}
		return agregado;
	}
	
	
	/**
	 * Devolver el elemento que se encuentra en una posición de la lista
	 * @param posicion posición que queremos recuperar (de 0 a capacidad-1)
	 * @return el elemento almacenado esa posición, o null si la posición está vacía
	 */
	public Multimedia recuperar (int posicion) {
		if (posicion<this.elementos) {
			return lista[posicion];
		} else {
			//si "posicion" está después de "this.elementos", sabemos que esa casilla está vacía o no existe
			return null;
		}
			
	}
	
	
	public int dimePosicion(Multimedia m) {
		//devuelve la posición de la lista en la que se encuentra el objeto pasado por parámetro
		int posicion=-1;
		
		for(int i=0; i<this.elementos; ++i) {
			if(lista[i].equals(m)) {
				//al encontrar el primer elemento coincidente, abandonamos el bucle
				posicion=i;
				break;
			}
		}//fin del bucle
		return posicion;

	}

	/**
	 * M�todo main para prueba r�pida
	 */
	public static void main(String[] args) {
		
		//objetos multimedia
		
		Multimedia multi1 = new Multimedia ("Titulo1", "Autor1", 100, Formatos.MP4);
		
		Multimedia multi2 = new Multimedia ("titulo2", "AUTOR2", 100, Formatos.SWF);
		
		Multimedia multi3 = new Multimedia ("titulo3", "Autor3", 100, Formatos.WMA);
		
		Multimedia multi4 = new Multimedia ("titulo4", "Autor4", 100, Formatos.WMV);
		
		Multimedia multi5 = new Multimedia ("titulo4", "autor4", 100, Formatos.MP3);
		
		Multimedia multi6 = new Multimedia ("titulo6", "Autor6", 100, Formatos.MP4);
		
	
		
		//creo una lista con capacidad de 5 elementos
		ListaMultimedia miLista= new ListaMultimedia(5);
		
		//los agrego a la colección
		System.out.println("Elementos ocupados  " + miLista.size());
		
		miLista.agregar(multi1);
		miLista.agregar(multi2);
		miLista.agregar(multi3);
		miLista.agregar(multi4);
		
		//leo el elemento en posición 3
		System.out.println(miLista.recuperar(3));
		//leo el elemento en la posición 4
		System.out.println(miLista.recuperar(4));
		
		//buscamos el elemento multi3
		int buscado= miLista.dimePosicion(multi3);
		System.out.println("multi3 está en la posición... "+buscado);
		
		//buscamos el elemento multi6
		 buscado= miLista.dimePosicion(multi6);
		System.out.println("multi6 está en la posición... "+buscado);
		
		
//		System.out.println(miLista.agregar(multi5));
//		System.out.println(miLista.agregar(multi6));
//		
//	
//		System.out.println("Elementos ocupados  " + miLista.size());
		
		
	}

}
