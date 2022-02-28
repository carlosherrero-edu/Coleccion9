package ejercicios;
import ejercicios.Utilidades.Marchas;

/**
 * Clase Coche  de la que heredaremos posteriormente
 * @author Carlos H

 */
public class Coche {
	
	
	//propiedades de la clase
	private String matricula;
	private String modelo;
	private double velocidad;
	private Marchas marcha;
	
	/**
	 * Constructor único que inicializa todas las propiedades
	 * La marcha se inicializa a REPOSO y la velocidad a 0
	 * @param matricula matrícula, cadena
	 * @param modelo modelo de vehículo, cadena
	 */
	public Coche (String matricula, String modelo){
		this.matricula = matricula;
		this.modelo = modelo;
		this.marcha = Marchas.REPOSO;
		this.velocidad = 0;
		
	}
	
	//solo vamos a definir los mÃ©todos getXxX, junto con el mÃ©todo setVelocidad y setMArcha
	public String getMatricula() {
		return matricula;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public double getVelocidad() {
		return velocidad;
	}
	
	public void setVelocidad(double velocidad) {
		if (velocidad<0)
			throw new IllegalArgumentException("La velocidad no puede ser negativa");
		this.velocidad = velocidad;
	}
	
	public Marchas getMarcha() {
		return marcha;
	}
	
	public void setMarcha(Marchas marcha) {
		this.marcha = marcha;
	}
	
	/**
	 * Método para aumentar la velocidad del coche
	 * @param incremento  valor en que se incrementa la velocidad, debe ser positivo
	 */
	public void acelerar (double incremento){
		if (incremento<=0)
			throw new IllegalArgumentException("El incremento de velocidad debe ser positivo");
		
		setVelocidad (this.velocidad + incremento);
	}
	
	/**
	 * Método para reducir la velocidad del coche
	 * @param decremento valor en que disminuye la velocidad, debe ser positivo
	 * Si decremento es igual o superior a la velocidad actual, llamamos al método detener()
	 */
	public void frenar (double decremento){
		if (decremento<=0)
			throw new IllegalArgumentException("El decremento debe ser positivo");
		
		if (decremento >= this.velocidad){  //en este caso, detenemos el coche
			detener();
		}  else 
			setVelocidad (this.velocidad - decremento);
		
		
	}
	
	/**
	 * Método para detener el vehículo, estableciendo su velocidad a 0 y la marcha a REPOSO
	 */
	public void detener (){
		
		setVelocidad (0);
		this.marcha = Marchas.REPOSO;
		
	}
	
	public String dimeEstado(){
		
		return "Velocidad en km/h  :" + this.getVelocidad() + " Marcha :" +this.getMarcha();
	}
	

	 

}
