package hojasejercicios;

public class CocheCambioManual extends Coche {
	
	public CocheCambioManual(String matricula, String modelo){
		super (matricula, modelo);
	}
	
	//sólo vamos a tener un método para cambiar de marcha
	
	public void cambiaMarcha (Marchas nuevamarcha){
		
		if ( nuevamarcha == Marchas.REPOSO && this.getVelocidad()>0)
			throw new IllegalArgumentException ("No puedes cambiar a reposo "
					+ "mientras el vehículo no se detenga");
			
		super.setMarcha(nuevamarcha);
		
	}

}
