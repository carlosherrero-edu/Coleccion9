package ejercicios;

import java.awt.Color;

public class Vehiculo {
	
	//propiedades
	private int numRuedas;
	private int cilindrada;
	private double potencia;
	private Color color;
	
	//constructores de la clase
	
	/**
	 * Constructor por defecto de la clase. No inicializa ninguna propiedad
	 */
	Vehiculo(){
		
	}
	
	/**
	 * Constructor  que inicializa todas las propiedades, excepto el color
	 * @param ruedas número de ruedas, mayor de 0
	 * @param cilindrada cilindrada en cc., mayor de 0
	 * @param pot potencia en CV., mayor de 0
	 * @throws IllegalArgumentException excepción si se trata de asignar a alguna propiedad un valor no válido
	 */
	public Vehiculo(int ruedas, int cilindrada, double pot) throws IllegalArgumentException{
		
			this.setNumRuedas(ruedas);
			this.setCilindrada(cilindrada);
			this.setPotencia(pot);
	
	}
	
	/**
	 * Constructor que inicializa todas las propiedades, incluyendo el color
	 * @param ruedas número de ruedas, mayor de 0
	 * @param cilindrada cilindrada en cc., mayor de 0
	 * @param pot potencia en CV., mayor de 0
	 * @param col color del vehículo, como constante de la clase java.awt.Color
	 * @throws IllegalArgumentException excepción si se trata de asignar a alguna propiedad un valor no válido
	 */
	public Vehiculo(int ruedas, int cilindrada, double pot, Color col) throws IllegalArgumentException{
		
		this(ruedas, cilindrada, pot);
		this.setColor(col);
		
	
	}
	
	//métodos get y set, con las validaciones pedidas en el enunciado
	
	//getters y setters para la propiedad numRuedas
	
	public int getNumRuedas() {
		return numRuedas;
	}
	
	public void setNumRuedas(int numRuedas) {
		if (numRuedas<=0){
			throw new IllegalArgumentException ("El nÃºmero de ruedas debe ser mayor de cero");
		}	
		this.numRuedas = numRuedas;
	}
	
	//getters y setters para la propiedad cilindrada
	public int getCilindrada() {
		return cilindrada;
	}
	
	public void setCilindrada(int cilindrada) {
		if (cilindrada<=0){
			throw new IllegalArgumentException ("La cilindrada debe ser mayor de cero");
		}	
		this.cilindrada = cilindrada;
	}
	
	//getters y setters para la propiedad potencia
	public double getPotencia() {
		return potencia;
	}
	
	public void setPotencia(double potencia) {
		if (potencia<=0){
			throw new IllegalArgumentException ("La potencia debe ser mayor de cero");
		}
		this.potencia = potencia;
	}
	
	//getters y setters para la propiedad color
	
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
		
	}
	
	
	

}
