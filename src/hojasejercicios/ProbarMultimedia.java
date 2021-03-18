package hojasejercicios;

public class ProbarMultimedia {
	
	public static void main(String[] args) {
		Pelicula peli =new Pelicula ("Fama","no lo sé", 100,Formato.mp4, "Juan", "María" );
		
		Disco disco =new Disco ("Fama","no lo sé", 100,Formato.mp4, Generos.ROCK, 20);
		
		System.out.println(peli.toString());
		
		System.out.println(disco.toString());
		
		System.out.println(peli.equals(disco) ? "Iguales": "Distintos");
		
	}
	
	

}
