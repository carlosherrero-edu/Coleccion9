package ejercicios;

import java.awt.Color;

public class Vehiculo {

	protected int numRuedas;
	protected int cilindrada;
	protected int potencia;
	protected Color color;

	public Vehiculo(int numRuedas, int cilindrada, int potencia) {
	    
	        // aqui estmos llamando al los setters que ya tienen las validaciones;  si no lo
	        // hiciesemos de esta forma, tendrimos que volver a escribir la validacion
	        setNumRuedas(numRuedas);
	        setCilindrada(cilindrada);
	        setPotencia(potencia);

	    }

	public Vehiculo(int numRuedas, int cilindrada, int potencia, Color color) {
	        this(numRuedas, cilindrada, potencia);
	        setColor(color);

	        /*
	         * setNumRuedas(numRuedas); setCilindrada(cilindrada); setPotencia(potencia);
	         */
	        
	    }

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		// validacion
		if (numRuedas < 1) {
			throw new IllegalArgumentException("El numero de ruedas debe ser mayor de 0");
		}
			
		this.numRuedas = numRuedas;
		
		
		
		// este seria otro metodo, si el numRuedas es mayor de 0, tendremos un if y el
		// else
		/*
		 * if (numRuedas > 0) { this.numRuedas = numRuedas; } else { throw new
		 * IllegalArgumentException("El numero de ruedas"); }
		 */
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		if (cilindrada < 1) {
			throw new IllegalArgumentException("La cilindrada debe ser mayor de 0");
		}
		this.cilindrada = cilindrada;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		if (potencia < 1) {
			throw new IllegalArgumentException("La potencia debe ser mayor de 0");
		}
		this.potencia = potencia;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	// @Overrite
	public String toString() {
		return getNumRuedas() + "-" + getCilindrada() + "-" + getPotencia() + "-" + getColor();
	}

}
