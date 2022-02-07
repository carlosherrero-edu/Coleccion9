package ejercicios;
import ejercicios.Utilidades.Marchas;

/**
 * Clase CocheCambioManual, hereda de Coche
 * @author Carlos H
 * @see Coche
 *
 */
public class CocheCambioManual extends Coche {
	
	/**
	 * Constructor único que llama al constructor de la clase padre
	 * @param matricula matrícula, cadena
	 * @param modelo modelo del vehículo, cadena
	 */
	public CocheCambioManual(String matricula, String modelo){
		super (matricula, modelo);
	}
	
	// vamos a tener un mÃ©todo para cambiar de marcha
	
	/**
	 * Método para cambiar la marcha del vehículo
	 * @param nuevamarcha constante de la enumeración Marchas, con la nueva marcha a la que queremos cambiar
	 * Genera excepción si queremos cambiar a REPOSO con una velocidad no nula
	 */
	public void cambiaMarcha (Marchas nuevamarcha){
		
		if ( nuevamarcha == Marchas.REPOSO && this.getVelocidad()>0)
			throw new IllegalArgumentException ("No puedes cambiar a reposo "
					+ "mientras el vehiculo no se detenga");
			
		super.setMarcha(nuevamarcha);
		
	}

}
