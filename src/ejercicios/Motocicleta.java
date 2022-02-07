package ejercicios;

import java.awt.Color;

/**
 * Clase Motocicleta que hereda de la clase Vehiculo
 * @author Carlos H.
 * @see Vehiculo
 *
 */
public class Motocicleta extends Vehiculo {
	
	

	//constante con el n�mero de ruedas
	static final int RUEDAS_MOTO = 2;
	
	//propiedad de la clase
	
	private int numeroPlazas;
	
	//constructores
	
	public Motocicleta(int ruedas, int cilindrada, double pot, int plazas) throws IllegalArgumentException {
		super(RUEDAS_MOTO, cilindrada, pot);
		setNumeroPlazas(plazas);
	
	}
	
	public Motocicleta(int ruedas, int cilindrada, double pot, Color col, int plazas) throws IllegalArgumentException {
		super(RUEDAS_MOTO, cilindrada, pot, col);
		setNumeroPlazas(plazas);
		
	}

	
	//m�todos get y set para la propiedad numPlazas
	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	

	public void setNumeroPlazas(int numeroPlazas) {
		if (numeroPlazas<=0){
			throw new IllegalArgumentException ("El número de plazas debe ser mayor de cero");
		}
		this.numeroPlazas = numeroPlazas;
	}
	
	
	
	

}
