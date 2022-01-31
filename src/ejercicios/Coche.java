package ejercicios;

public class Coche {
	
	public enum Marchas { PRIMERA, SEGUNDA, TERCERA, CUARTA, QUINTA, SEXTA, REPOSO};
	
	//propiedades de la clase
	private String matricula;
	private String modelo;
	private double velocidad;
	private Marchas marcha;
	
	//Cconstructores
	
	

	public Coche (String matricula, String modelo){
		this.matricula = matricula;
		this.modelo = modelo;
		this.marcha = Marchas.REPOSO;
		this.velocidad = 0;
		
	}
	
	//sólo vamos a definir los métodos getXxX, junto con el método setVelocidad y setMArcha
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
	
	public void acelerar (double incremento){
		if (incremento<0)
			throw new IllegalArgumentException("El incremento debe ser positivo");
		
		setVelocidad (this.velocidad + incremento);
	}
	
	public void frenar (double decremento){
		if (decremento<0)
			throw new IllegalArgumentException("El decremento debe ser positivo");
		
		if (decremento >= this.velocidad){  //en este caso, detenemos el coche
			detener();
		}  else 
			setVelocidad (this.velocidad - decremento);
		
		
	}
	
	public void detener (){
		
		setVelocidad (0);
		this.marcha = Marchas.REPOSO;
		
	}
	
	public String dimeEstado(){
		
		return "Velocidad en km/h  :" + this.getVelocidad() + " Marcha :" +this.getMarcha();
	}
	

	 

}
