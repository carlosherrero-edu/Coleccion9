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
	 * Constructor �nico que llama al constructor de la clase padre
	 * @param matricula matr�cula, cadena
	 * @param modelo modelo del veh�culo, cadena
	 */
	public CocheCambioManual(String matricula, String modelo){
		super (matricula, modelo);
	}
	
	// vamos a tener un método para cambiar de marcha
	
	/**
	 * M�todo para cambiar la marcha del veh�culo
	 * @param nuevamarcha constante de la enumeraci�n Marchas, con la nueva marcha a la que queremos cambiar
	 * Genera excepci�n si queremos cambiar a REPOSO con una velocidad no nula
	 */
	public void cambiaMarcha (Marchas nuevamarcha){
		
		if ( nuevamarcha == Marchas.REPOSO && this.getVelocidad()>0)
			throw new IllegalArgumentException ("No puedes cambiar a reposo "
					+ "mientras el vehiculo no se detenga");
			
		super.setMarcha(nuevamarcha);
		
	}

}
