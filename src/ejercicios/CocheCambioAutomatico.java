package ejercicios;
import ejercicios.Utilidades.Marchas;

/**
 * Clase CocheCambioAutomatico, hereda de Coche
 * @author Carlos H
 * @see Coche
 *
 */
public class CocheCambioAutomatico extends Coche {
	
	/**
	 * Constructor único, que invoca al constructor del padre
	 * @param matricula matrícula del vehículo
	 * @param modelo modelo/marca correspondiente
	 */
	public CocheCambioAutomatico(String matricula, String modelo){
		super (matricula, modelo);
	}
	
	
	/**
	 * Método para cambiar automáticamente la marcha del vehículo al acelerarlo o frenarlo
	 * Lo hacemos privado ya que sólo lo llamaremos desde los métodos acelerar y frenar
	 */
	private void cambiarMarchaAuto (){
		
		double velo = getVelocidad();
		
		if (velo>0 && velo <15)
			super.setMarcha(Marchas.PRIMERA);
		else if (velo<30)
			super.setMarcha(Marchas.SEGUNDA);
		else if (velo<45)
			super.setMarcha(Marchas.TERCERA);
		else if (velo<70)
			super.setMarcha(Marchas.CUARTA);
		else if (velo<120)
			super.setMarcha(Marchas.QUINTA);
		else 
			super.setMarcha(Marchas.SEXTA);
	}
	
	//sobreescribimos ahora los mÃ©todos acelerar y frenar
	
	@Override
	public void acelerar(double incremento){
		super.acelerar(incremento);
		//con el nuevo valor de la velocidad, cambiamos de marcha
		cambiarMarchaAuto();		
	}

	@Override
	public void frenar (double decremento){
		super.frenar(decremento);
		//con el nuevo valor de la velocidad, cambiamos de marcha
		cambiarMarchaAuto();		
	}
}
