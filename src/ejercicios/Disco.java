package ejercicios;

import ejercicios.Utilidades.Formatos;
import ejercicios.Utilidades.Generos;

/**
 * @author Alumno
 *
 */
public class Disco extends Multimedia {
	
	//propiedades nuevas de la subclase
	private Generos genero;
	private int pistas;
	
	//constructor
	/**
	 * @param tit
	 * @param aut
	 * @param dur
	 * @param format
	 * @param gen
	 * @param pistas
	 */
	public  Disco (String tit, String aut, int dur, Formatos format,
			Generos gen, int pistas) throws IllegalArgumentException {
		super(tit, aut, dur, format); 
		setGenero( gen)	;
		setPistas (pistas);
	}
	
	//m√©todos get y set
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
		if (pistas<1) {
			throw new IllegalArgumentException("Al menos debe haber 1 pista");
		}
		this.pistas = pistas;
	}
	
	@Override
	public String toString(){
		return super.toString() + 
		"\n GÈnero musical: "+getGenero();
	}

	
	

}
