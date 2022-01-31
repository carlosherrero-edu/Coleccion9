package ejercicios;

import java.awt.Color;

public class Camion_Ej9 extends Vehiculo_Ej9 {
	
	private int numEjes;
	
	
	public Camion_Ej9 (int ruedas, int cilindrada, double pot, int ejes){
		
		super(ruedas, cilindrada, pot);
		this.setNumEjes(ejes);	
	}
	
	public Camion_Ej9 (int ruedas, int cilindrada, double pot, Color col, int ejes){
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
	
	
	//método que implementa el método abstracto del padre. NO se sobreescribe

	public double calcularImpuesto(){
		return this.getCilindrada()/30.0 + this.getPotencia()*20 + 
				this.getNumRuedas()*20 + this.getNumEjes()*50;
		
	}

}