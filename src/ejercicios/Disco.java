package ejercicios;

import ejercicios.Utilidades.Formatos;
import ejercicios.Utilidades.Generos;

public class Disco extends Multimedia {
	
	//propiedades nuevas de la subclase
	private Generos genero;
	private int pistas;
	
	//constructor
	public  Disco (String tit, String aut, int dur, Formatos format,
			Generos gen, int pistas) {
		super(tit, aut, dur, format); 
		setGenero( gen)	;
		setPistas (pistas);
	}
	
	//métodos get y set
	public Generos getGenero() {
		return genero;
	}

	public void setGenero(Generos genero) {
		this.genero = genero;
	}

	public int getPistas() {
		return pistas;
	}

	public void setPistas(int pistas) {
		this.pistas = pistas;
	}
	
	@Override
	public String toString(){
		return super.toString() + "**"+ getGenero()+ "**" 
	+getPistas();
	}

	
	

}
