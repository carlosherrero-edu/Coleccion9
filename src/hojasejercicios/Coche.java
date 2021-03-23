package hojasejercicios;

enum Marcha{
	PRIMERA,SEGUNDA,TERCERA,CUARTA,QUINTA,SEXTA,REPOSO
};


public class Coche {
	
	
	private String matricula;
	private String modelo;
	private double velocidad;
	private Marcha marcha;
	
	
	public Coche() {
	}
	
	public Coche(String matricula, String modelo) {
		setMatricula(matricula);
		setModelo(modelo);
		setVelocidad(0);
		setMarcha(Marcha.REPOSO);
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
		if (this.velocidad<=0) {
			this.velocidad=0;
			setMarcha(Marcha.REPOSO);
		}
	}

	public Marcha getMarcha() {
		return marcha;
	}

	public void setMarcha(Marcha marcha) {
		this.marcha = marcha;
	}
	
	public void acelerar(double incremento) {
		setVelocidad(getVelocidad()+incremento);
	}
	
	public void frenar(double decremento) {
		setVelocidad(getVelocidad()-decremento);
		
	}
	
	public void detener() {
		setVelocidad(0);
		setMarcha(Marcha.REPOSO);
	}
	
	public String dimeEstado() {
		return "El choche se encuantra a una velocidad de "+getVelocidad()+"km/h y su marcha es "+getMarcha();
	}

}
