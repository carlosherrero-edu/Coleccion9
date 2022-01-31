package ejercicios;

import ejercicios.Utilidades.Formatos;

/**
 * Clase pedida en la Colección 9, Ejercicio 2
 * @author Carlos Herrero
 * @version 1.0
 *
 */
public class Multimedia {
	
	//propiedades de la clase
	private String titulo;
	private String autor;
	private int duracion;
	private Formatos formato;
	
	//constructor
	public Multimedia (String tit, String aut, int dur, Formatos format){
		
		setTitulo(tit);
		setAutor(aut);
		setDuracion(dur);
		setFormato(format);
	}
	
	
	// métodos get y set
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public Formatos getFormato() {
		return formato;
	}
	public void setFormato(Formatos formato) {
		this.formato = formato;
	}
	
	
	//otros métodos heredados de Object y sobreescritos
	@Override
	public String toString(){
		
		return getTitulo()+"**" +getAutor()+"**" + getDuracion()+"**" +getFormato();
	}
	
	public boolean equals (Multimedia m2){
		
	
		if (getTitulo().equals(m2.getTitulo()) && getAutor().equals(m2.getAutor())){
			return true;
		}
		return false;
		}
	}
	

