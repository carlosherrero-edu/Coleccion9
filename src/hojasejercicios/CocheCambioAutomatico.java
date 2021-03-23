package hojasejercicios;

public class CocheCambioAutomatico extends Coche {

	public CocheCambioAutomatico() {

	}

	public CocheCambioAutomatico(String matricula, String modelo) {
		super(matricula, modelo);

	}

	@Override
	public void acelerar(double incremento) {
		super.acelerar(incremento);
		cambiarMarcha();
	}

	@Override
	public void frenar(double decremento) {
		super.frenar(decremento);
		cambiarMarcha();

	}

	void cambiarMarcha() {

		if (getVelocidad() == 0)
			setMarcha(Marcha.REPOSO);
		else if (getVelocidad() < 15)
			setMarcha(Marcha.PRIMERA);
		else if (getVelocidad() < 30)
			setMarcha(Marcha.SEGUNDA);
		else if (getVelocidad() < 45)
			setMarcha(Marcha.TERCERA);
		else if (getVelocidad() < 70)
			setMarcha(Marcha.CUARTA);
		else if (getVelocidad() < 120)
			setMarcha(Marcha.QUINTA);
		else
			setMarcha(Marcha.SEXTA);

	}

}
