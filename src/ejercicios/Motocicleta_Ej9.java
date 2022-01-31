package ejercicios;

public class Motocicleta_Ej9 extends Vehiculo_Ej9 {
	
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
	
	//método que implementa el método abstracto del padre. NO se sobreescribe

		public double calcularImpuesto(){
			return this.getCilindrada()/30.0 + this.getPotencia()*30;
			
		}
	
	

}
