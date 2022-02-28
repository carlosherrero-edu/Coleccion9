package pruebas;
import ejercicios.Utilidades.*;

import ejercicios.Disco;
import ejercicios.ListaMultimedia;
import ejercicios.Multimedia;
import ejercicios.Pelicula;

public class PruebaEjercicio8 {

	public static void main(String[] args) {
	
		ListaMultimedia miLista = new ListaMultimedia(8);
		
		//agregamos varios objetos a la lista
		miLista.agregar(new Pelicula("Mi nombre es Joe", "Ken Loach", 128, Formatos.MP4,
				"Peter Mullan",""));
		
		miLista.agregar(new Pelicula("La pesca del salmón en Yemen", " Lasse Hallström", 154, 
				Formatos.MP4,"Ewan McGregor","Emily Blunt"));
		
		miLista.agregar(new Pelicula("Tres colores: Rojo", " Krzysztof Kieślowski", 175, 
				Formatos.AVI,"","Irene Jacob"));
		
		miLista.agregar(new Pelicula("La Strada", " Federico Fellini", 98, 
				Formatos.AVI,"Anthony Queen","Giulleta Massina"));
		
		miLista.agregar(new Disco("With the Beatles", " The Beatles", 32, 
				Formatos.MP3,Generos.POP,8));
		
		miLista.agregar(new Disco("Forty Licks", " Rolling Stones", 66, 
				Formatos.WAV,Generos.ROCK,20));
		
		miLista.agregar(new Disco("Forty Licks", " Rolling Stones", 66, 
				Formatos.WAV,Generos.ROCK,20));
		
		miLista.agregar(new Disco("End of the Century", " Ramones", 42, 
				Formatos.WAV,Generos.ROCK,12));
		
		//listamos todos los objetos de la lista
		
		int duracion=0 , discosRock=0, sinActriz=0;
		Multimedia item;
		
		for (int i=0; i<miLista.size(); i++){
			
			item = miLista.recuperar(i);
			//en duraci�n guardamos la duraci�n total en minutos de todos los elementos de la lista
			duracion += item.getMinutos();
			
			//para las pel�culas, guardamos en "sinActriz" cu�ntas pel�culas no tienen actriz principal
			if (item instanceof Pelicula && 
					((Pelicula)item).getActrizPrincipal().length()==0){
				sinActriz ++;
			}
			//para los Discos, guardamos en la variable discosRock cu�ntos son del g�nero Rock
			if (item instanceof Disco && 
					((Disco)item).getGenero()==Generos.ROCK){
				discosRock ++;
			}
			System.out.println(item instanceof Pelicula ? "Pelicula": "Disco");
			System.out.println("Autor/director  :"+ item.getAutor());
			System.out.println("Titulo  :"+ item.getTitulo());
			System.out.println(" Formato : "+ item.getFormato());
			System.out.println("---------------------------------------------------");
		} //fin del recorrido de la lista
		System.out.println("Duracion total en minutos : "+ duracion);
		System.out.println( "Peliculas sin actriz  :" + sinActriz);
		System.out.println( "Discos de rock :" + discosRock);
			
			
		}
		

	}


