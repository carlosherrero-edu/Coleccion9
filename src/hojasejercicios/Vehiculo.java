package hojasejercicios;

import java.awt.Color;

public class Vehiculo {
	
	//propiedades
	private int numRuedas;
	private int cilindrada;
	private double potencia;
	private Color color;
	
	//constructores
	
	
	
	public Vehiculo(int ruedas, int cilindrada, double pot) throws IllegalArgumentException {
		
		try {	
				this.setNumRuedas(ruedas);
				this.setCilindrada(cilindrada);
				this.setPotencia(pot);
		} catch (IllegalArgumentException e) {
			throw e;
		}
	
	}
	
	public Vehiculo(int ruedas, int cilindrada, double pot, Color col){
		//reutilizo¡amos el primer constructor
		this(ruedas, cilindrada, pot);  //estoy llamando a Vehiculo(ruedas, cilindrada, pot)
		this.setColor(col);
		
	}
	
	public int getNumRuedas() {
		return numRuedas;
	}
	
	public void setNumRuedas(int numRuedas) {
		if (numRuedas<=0){
			throw new IllegalArgumentException ("El número de ruedas debe ser mayor de cero");
		}	
		this.numRuedas = numRuedas;
	}
	
	
	public int getCilindrada() {
		return cilindrada;
	}
	
	public void setCilindrada(int cilindrada) {
		if (cilindrada<=0){
			throw new IllegalArgumentException ("La cilindrada debe ser mayor de cero");
		}	
		this.cilindrada = cilindrada;
	}
	
	public double getPotencia() {
		return potencia;
	}
	
	public void setPotencia(double potencia) {
		if (potencia<=0){
			throw new IllegalArgumentException ("La potencia debe ser mayor de cero");
		}
		this.potencia = potencia;
	}
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
		
	}
	
	
	

}
