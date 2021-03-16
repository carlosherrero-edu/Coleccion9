package hojasejercicios;

import java.awt.Color;

public abstract class Vehiculo_Ej9 {
	
	//propiedades
	private int numRuedas;
	private int cilindrada;
	private double potencia;
	private Color color;
	
	//constructores
	
	Vehiculo_Ej9(){
		
	}
	
	public Vehiculo_Ej9(int ruedas, int cilindrada, double pot){
		
			this.setNumRuedas(ruedas);
			this.setCilindrada(cilindrada);
			this.setPotencia(pot);
	
	}
	
	public Vehiculo_Ej9(int ruedas, int cilindrada, double pot, Color col){
		
		this(ruedas, cilindrada, pot);
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
	
	//método abstracto que desarrollará cada subclase
	public abstract double calcularImpuesto();
	
	
	

}
