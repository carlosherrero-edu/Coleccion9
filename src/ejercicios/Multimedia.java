package ejercicios;

import ejercicios.Utilidades.Formatos;

/**
 * Clase pedida en la ColecciÃ³n 9, Ejercicio 2
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
	
	//constructor que inicializa y da valores a todas las propiedades
	public Multimedia (String tit, String aut, int dur, Formatos format){
		
		setTitulo(tit);
		setAutor(aut);
		setDuracion(dur);
		setFormato(format);
	}
	
	
	// mÃ©todos get y set
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
	
	
	//otros mÃ©todos heredados de Object y sobreescritos
	@Override
	public String toString(){
		
		return "\n Título: "+getTitulo()+
				"\n Autor: " +getAutor()+
				"\n Duración: " + getDuracion()+" minutos"+
				"\n Formato: " +getFormato();
	}
	
	@Override
	public boolean equals (Object m2){
		
		boolean sonIguales=false;
		
		if (m2 instanceof Multimedia) {
			//hago la conversión descendente del objeto m2 a Multimedia
			Multimedia multi2=(Multimedia)m2;
			//ahora compruebo la igualdad de los atributos pedida
			if (this.getTitulo().equalsIgnoreCase(multi2.getTitulo())) {
				if (this.getAutor().equalsIgnoreCase(multi2.getAutor())) {
					//sólo si se cumplen estas condiciones, se consideran iguales
					sonIguales=true;
				}
			}
		}
		
		return sonIguales;
	}
	

}