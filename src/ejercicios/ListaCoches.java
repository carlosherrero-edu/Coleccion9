package ejercicios;

import java.util.ArrayList;

public class ListaCoches {
	
	//propiedad. Un arraylist con coches
	private ArrayList<Coche> mi_lista;
	
	//constructor por defecto
	public ListaCoches(){
		mi_lista = new ArrayList<Coche>();	
	}

	
	/** 
	 * Método para buscar en la lista un coche que con una matrícula dada
	 * @param matricula , cadena con la matrícula que buscamos
	 * @return posición en el arraylist donde se encuentra el coche con esa matrícula
	 * Si no la encuentra, devolverá como posición el valor size()
	 */
	public int buscarCoche (String matricula){
		
		int posicion=0;
		boolean encontrado=false;
		while (posicion < mi_lista.size() && !encontrado){
			
			if (mi_lista.get(posicion).getMatricula() == matricula)
				encontrado = true;
			else
				posicion++;
			
		}//fin del while 
		return posicion;
	}
	
	public void AgregarCoche (Coche miCoche){
		//comprobamos que no existe ese coche en la lista
		if (buscarCoche(miCoche.getMatricula())< mi_lista.size()){
			//en este caso existe un coche con esa matrícula, no se agregará
			System.out.println("Ya existe otro coche con la matrícula  "+ miCoche.getMatricula());
			return;
		} 
		mi_lista.add(miCoche);
			
	}
	
	public void eliminarCoche (String matricula){
		//comprobamos si existe ese coche en la lista
		if ( buscarCoche(matricula)< mi_lista.size()){
			mi_lista.remove(buscarCoche(matricula));
			System.out.println("Se ha eliminado el coche con matrícula  "+matricula);
		}else 
			System.out.println("No existe ningún coche  con la matrícula  "+ matricula);
			
	}
	
	public void devolverInfo (String matricula){
		//comprobamos si existe ese coche en la lista
				if ( buscarCoche(matricula)< mi_lista.size()){
					Coche buscado = mi_lista.get(buscarCoche(matricula));
					System.out.println("Modelo del coche  "+ buscado.getModelo());
					System.out.println("Tipo de coche  "+ 
							((buscado instanceof CocheCambioManual)? "coche de cambio manual":
								"coche de cambio automático"));
				}else 
					System.out.println("No existe ningún coche  con la matrícula  "+ matricula);
				
	
	}
	
	public void devolverEstado (String matricula){
		//comprobamos si existe ese coche en la lista
				if ( buscarCoche(matricula)< mi_lista.size()){
					System.out.println( mi_lista.get(buscarCoche(matricula)).dimeEstado());
				}else 
					System.out.println("No existe ningún coche  con la matrícula  "+ matricula);
				
	
	}
}
