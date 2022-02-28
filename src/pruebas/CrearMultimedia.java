package pruebas;

import ejercicios.Multimedia;
import ejercicios.Utilidades.*;

public class CrearMultimedia {

	public static void main(String[] args) {
		Multimedia multi1 = new Multimedia ("Titulo1", "Autor1", 100, Formatos.MP4);
		
		Multimedia multi2 = new Multimedia ("titulo1", "AUTOR1", 100, Formatos.MP4);
		
		Multimedia multi3 = new Multimedia ("titulo1", "Autor2", 100, Formatos.MP4);
		
		System.out.println(multi1.toString());
		
		System.out.println(multi1.getClass().toString());
		
		
		System.out.println( multi1.equals(multi2) ? "Son iguales" : "Son diferentes" );
		
		System.out.println( multi1.equals(multi3) ? "Son iguales" : "Son diferentes" );
		
		

	}

}
