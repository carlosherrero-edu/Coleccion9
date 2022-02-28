package ejercicios;

import java.awt.Color;

/**
 * Clase Camion que hereda de la clase Vehiculo
 * @author Carlos H.
 * @see Vehiculo
 */
public class Camion extends Vehiculo {
	
	//propiedad privada de la clase
	private int numEjes;
	
	
	//constructores que sobreescriben los constructores de la clase padre
	public Camion (int ruedas, int cilindrada, int pot, int ejes) throws IllegalArgumentException{
		
		super(ruedas, cilindrada, pot);
		setNumEjes(ejes);	
	}
	
	public Camion (int ruedas, int cilindrada, int pot, Color col, int ejes) throws IllegalArgumentException{
		super(ruedas, cilindrada, pot,col);
		setNumEjes(ejes);	
		
	}

	//getters y setters de la propiedad numEjes
	public int getNumEjes() {
		return numEjes;
	}

	public void setNumEjes(int numEjes) {
		if (numEjes<2){
			throw new IllegalArgumentException ("El número de ejes debe ser al menos de 2");
		}
		this.numEjes = numEjes;
	}
	
	

}
