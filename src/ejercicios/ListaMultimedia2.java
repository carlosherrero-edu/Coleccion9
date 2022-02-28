package ejercicios;

import java.util.ArrayList;

import ejercicios.Utilidades.*;

/**
 * Clase ListaMultimedia de objetos Multimedia gestionada mediante un ArrayList
 * @author DW1E
 *
 */
public class ListaMultimedia2 {
	
	//propiedad de tipo ArrayList para guardar la lista de elementos
	private ArrayList<Multimedia> lista;
	
	
	//constructor que instancia el arraylist
	public ListaMultimedia2 () {
		lista= new ArrayList<Multimedia>();
		
	}
	
	
	//m茅todos
	/**
	 * Averiguar el n鷐ero de elementos de la lista
	 * @return n鷐ero de nodos de la lista
	 */
	public int size() {
		return lista.size();
	}
	
	
	/**
	 * Agregar un nuevo elemento Multimedia al final de la lista
	 * @param m objeto Multimedia a agregar
	 * @return  booleano con el resultado de la operaci髇
	 */
	public boolean agregar (Multimedia m) {
		return lista.add(m);
	}
	
	/**
	 * Recuperar el elemento guardado en una posici髇 de la lista
	 * @param posicion entero con la posici髇 de la que recuperar el elemento
	 * @return  objeto Multimedia guardado en esa posici髇, o null si la posici髇 no existe
	 */
	public Multimedia recuperar (int posicion) {
		try {
			return lista.get(posicion);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
		
	}
	
	/**
	 * Buscar un objeto multimedia en la lista
	 * @param m objeto multimedia a recuperar
	 * @return posici髇 de la lista donde se encuentra, -1 si no se encuentra
	 */
	public int dimePosicion(Multimedia m) {
		return lista.indexOf(m);
	}
	
	/**
	 * M閠odo main para prueba r醦ida
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
				ListaMultimedia2 miLista= new ListaMultimedia2();
				
				//los agrego a la colecci贸n
				System.out.println("Elementos ocupados  " + miLista.size());
				
				miLista.agregar(multi1);
				miLista.agregar(multi2);
				miLista.agregar(multi3);
				miLista.agregar(multi4);
				
				//leo el elemento en posici贸n 3
				System.out.println(miLista.recuperar(3));
				//leo el elemento en la posici贸n 4
				System.out.println(miLista.recuperar(4));
				
				//buscamos el elemento multi3
				int buscado= miLista.dimePosicion(multi3);
				System.out.println("multi3 est谩 en la posici贸n... "+buscado);
				
				//buscamos el elemento multi6
				 buscado= miLista.dimePosicion(multi6);
				System.out.println("multi6 est谩 en la posici贸n... "+buscado);
				
				
				System.out.println(miLista.agregar(multi5));
				System.out.println(miLista.agregar(multi6));
//				
	
		System.out.println("Elementos ocupados  " + miLista.size());
				
		
	}

}
