package hojasejercicios;

public class CocheCambioManual extends Coche {
	
	public CocheCambioManual() {
		
	}

	public CocheCambioManual(String matricula, String modelo) {
		super(matricula, modelo);
		
	}
	
	
	public void cambiarMarcha(Marcha nuevaMarcha) throws IllegalArgumentException {
		if( nuevaMarcha == Marcha.REPOSO && this.getVelocidad()>0) {
			throw new IllegalArgumentException("No se puede cambiar a reposo con velocidad positiva");
		}
		
		setMarcha(nuevaMarcha);
		
	}


}
