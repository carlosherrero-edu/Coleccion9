package ejercicios;

public class Motocicleta extends Vehiculo {
	
	private int numeroPlazas;

	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(int numeroPlazas) {
		if (numeroPlazas<=0){
			throw new IllegalArgumentException ("El número de plazas debe ser mayor de cero");
		}
		this.numeroPlazas = numeroPlazas;
	}
	
	@Override
	public void setNumRuedas(int numRuedas) {
		super.setNumRuedas(2);
	}
	
	

}
