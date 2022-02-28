package ejercicios;

import java.awt.Color;

public class Motocicleta extends Vehiculo {
	
	static final int NUM_RUEDAS=2; 
	
	int numeroPlazas;
	
	//constructores
	public Motocicleta( int cilindrada, int potencia, int numeroPlazas) {
		super(NUM_RUEDAS, cilindrada, potencia);
	
		setNumeroPlazas(numeroPlazas);

	}

	public Motocicleta( int cilindrada, int potencia, Color color) {
		super(NUM_RUEDAS, cilindrada, potencia, color);
		setNumeroPlazas(numeroPlazas);

	}

	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(int numeroPlazas) {
		if (numeroPlazas >=1 ) {
			this.numeroPlazas = numeroPlazas;
			
		} else {
			throw new IllegalArgumentException("el numero de plazas debe ser al menos de 1");
		}
		
		
	}
	


}
