package hojasejercicios;

import java.awt.Color;

public class Camion extends Vehiculo {
	
	//propiedad exclusiva de Camion
	private int numEjes;
	
	//constructores
	public Camion (int ruedas, int cilindrada, double pot, int ejes) {
		super(ruedas, cilindrada, pot);
		this.setNumEjes(ejes);	
		
	}
	
	public Camion (int ruedas, int cilindrada, double pot, Color col, int ejes) {
		super(ruedas, cilindrada, pot,col);
		this.setNumEjes(ejes);	
			
		
	}
	
	//métodos getXxX y setXxX

	public int getNumEjes() {
		return numEjes;
	}

	public void setNumEjes(int numEjes) {
		if (numEjes<=1){
			throw new IllegalArgumentException ("El número de ejes debe ser al menos 2");
		}
		this.numEjes = numEjes;
	}
	
	

}
