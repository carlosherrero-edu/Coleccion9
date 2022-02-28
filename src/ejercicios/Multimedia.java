package ejercicios;

import ejercicios.Utilidades.Formatos;

public class Multimedia {
	
	

	// EJERCICIO 02
	/**
	 * Escribir una clase Multimedia para gestionar información de objetos
	 * multimedia con sonido y/o vídeo (clips de audio, vídeo, películas,…). Está
	 * clase vendrá dotada de las siguientes propiedades: TITULO AUTOR MINUTOS
	 * FORMATO
	 */
	// declaracion de atributos de la clase
	private String titulo;
	private String autor;
	private int minutos;
	private Formatos miFormato;

	public Multimedia(String titulo, String autor, int minutos, Formatos tuFormato) {
		this.titulo = titulo;
		this.autor = autor;
		this.minutos = minutos;
		this.miFormato = tuFormato;
	}

	// getters

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getMinutos() {
		return minutos;
	}

	public Formatos getFormato() {
		return miFormato;
	}

	// setter
	public void setTitulo(String tuTitulo) {
		this.titulo = tuTitulo;
	}

	public void setAutor(String tuAutor) {
		this.autor = tuAutor;
	}

	public void setMinutos(int tusMinutos) {
		this.minutos = tusMinutos;
	}

	public void setFormato(Formatos tuFormato) {
		this.miFormato = tuFormato;
	}

	// metodos
	@Override
	public String toString() {

		return String.format("Título: %50s \n Autor: %50s\n Duración en minutos: %3d \t Formato: %s",
				getTitulo(),  getAutor(),  getMinutos(), getFormato().toString() );


	}

	@Override
	public boolean equals(Object multi) {
		
		boolean sonIguales=false;
		
		if (multi instanceof Multimedia) {
			
			
			
			Multimedia otroMulti=(Multimedia)multi;
			
			if (getTitulo().equalsIgnoreCase(otroMulti.getTitulo())){
				if (getAutor().equalsIgnoreCase(otroMulti.getAutor())){
					//los dos objetos de la clase Multimedia se consideran iguales
					sonIguales=true;
				}
				
			}
			
		}
		
		
		return sonIguales;
	}

}