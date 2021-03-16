package hojasejercicios;

import java.awt.Color;

public class Camion extends Vehiculo {
	
	private int numEjes;
	
	
	public Camion (int ruedas, int cilindrada, double pot, int ejes){
		
		super(ruedas, cilindrada, pot);
		this.setNumEjes(ejes);	
	}
	
	public Camion (int ruedas, int cilindrada, double pot, Color col, int ejes){
		super(ruedas, cilindrada, pot,col);
		this.setNumEjes(ejes);	
		
	}

	public int getNumEjes() {
		return numEjes;
	}

	public void setNumEjes(int numEjes) {
		if (numEjes<=1){
			throw new IllegalArgumentException ("El número de ejes debe ser mayor de 2");
		}
		this.numEjes = numEjes;
	}
	
	@Override
	public void setNumRuedas(int numRuedas) {
		if (numRuedas<=5){
			throw new IllegalArgumentException ("El número de ruedas de un camión debe ser mayor de 5");
		}	
		setNumRuedas(numRuedas);
	}

}
