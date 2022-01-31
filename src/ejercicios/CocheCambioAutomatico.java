package ejercicios;

public class CocheCambioAutomatico extends Coche {
	
	public CocheCambioAutomatico(String matricula, String modelo){
		super (matricula, modelo);
	}
	
	void cambiarMarchaAuto (){
		
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
	
	//sobreescribimos ahora los métodos acelerar y frenar
	
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
