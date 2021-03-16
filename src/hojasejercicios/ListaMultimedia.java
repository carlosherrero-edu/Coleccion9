package hojasejercicios;

/**
 * Clase para resolver el Ejercicio 7 de la colección 9: crear una lista multimedia
 * @author Carlos Herrero
 *
 */
public class ListaMultimedia {
	
	//propiedades de la clase
	private Multimedia[] miLista;
	private int num_ele;
	
	//constructor de la lista. Inicialmente el número de elementos es 0
	public ListaMultimedia (int tamanio){
		
		this.miLista = new Multimedia[tamanio];
		this.num_ele = 0;
	}
	
	/** Método para agregar un nuevo elemento al final del array
	 * Si el array no está lleno, lo agrega en la posición indicada por num_ele
	 * @param m : Elemento multimedia a agregar
	 * @return: false si la lista está llena y no puede agregarlo; true en otro caso
	 */
	public boolean agregar (Multimedia m){
		
		boolean hayEspacio= false;
		if (num_ele < this.miLista.length){
		
			//la lista no está llena y podemos insertar otro elemento
			hayEspacio = true;
			this.miLista[num_ele] = m;
			this.num_ele++;
		} 
		return hayEspacio;
	}
	
	
	/**
	 * Método para devolver el elemento que está guardado en posición
	 * @param posicion: posición del array cuyo elemento quiere devolverse
	 * @return : elemento Multimedia guardado en posicion
	 */
	public Multimedia recuperar (int posicion){
		if (posicion < this.miLista.length)
				return this.miLista[posicion];	
		
		return null;
		
		}
	
	/**
	 * Método para devolver el número de elementos ocupados en  la lista
	 * @return: número de elementos ocupados
	 */
	public int size(){
		return this.num_ele;
	}
	
	/**
	 * Método que indica la posición de la lista donde está guardado un elemento m
	 * @param m : Elemento multimedia que se desea localizar
	 * @return: posición de la lista donde se encuentra; -1 si no se encuentra
	 */
	public int dimePosicion(Multimedia m){
		
		int posicion= 0;
		
		while ( posicion< this.miLista.length &&  !miLista[posicion].equals(m))
			posicion++;
		
		/* la salida del bucle anterior puede ocurrir por dos motivos:
		 * 1. HEmos encontrado el elemento en una posición anterior al final de la lista
		 * 2. Hemos llegado al final de la lista sin haber encontrado el elemento
		 */
		if (posicion < this.miLista.length)
			return posicion;
		
		return -1;
	}
	

	
	

}
