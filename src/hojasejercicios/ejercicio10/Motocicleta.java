package hojasejercicios.ejercicio10;

import java.awt.Color;

public class Motocicleta extends Vehiculo {
	//constante con el número de rueds
	static final int RUEDAS=2;
	
	//propiedad de Motocicleta
	private int numeroPlazas;
	

	//constructires
	
	 public Motocicleta (int cilindrada, int potencia, int plazas) {
		 super(RUEDAS,cilindrada, potencia);
		
		 setNumeroPlazas(plazas);
		
		 
	 }
	 
	 public Motocicleta (int cilindrada, int potencia, Color color, int plazas) {
		 super(RUEDAS,cilindrada, potencia, color);
		 
			 setNumeroPlazas(plazas);
		 
	 }

	 
	 //métodos getXxX y setXxX
	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(int numeroPlazas) {
		if (numeroPlazas<=0){
			throw new IllegalArgumentException ("El número de plazas debe ser mayor de cero");
		}
		this.numeroPlazas = numeroPlazas;
	}
	
	@Override
	public double calcularImpuesto() {
		
		double impuesto =getCilindrada() /30.0 + getPotencia()*30.0;
		return impuesto;
		
	}
	
	
	

}
