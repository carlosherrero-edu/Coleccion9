package pruebas;

import java.awt.Color;

import ejercicios.Vehiculo;

public class ProbarVehiculo {

	public static void main(String[] args) {
		Vehiculo vehi1, vehi2, vehi3, vehi4;
		try {
			//estos deben generar excepciones
			//vehi1= new Vehiculo(0,1000, 300);
			//vehi2= new Vehiculo(4,0, 300);
			vehi3= new Vehiculo(4,1000, 0);
			
			//este no
			vehi4= new Vehiculo(4,1000, 300);
			//le asigno un color
			vehi4.setColor(Color.CYAN);
			System.out.println("Propiedades de mi vehículo");
			System.out.println("\t *Número de ruedas: "+vehi4.getNumRuedas());
			System.out.println("\t *Potencia: "+vehi4.getPotencia());
			System.out.println("\t *Cilindrarda: "+vehi4.getCilindrada());
			System.out.println("\t *Color: "+vehi4.getColor());
			
			
			
			
			
		}catch (RuntimeException e) {
			System.out.println("No fue posible crear el objeto por el siguiente error:\n"
					+ e.getMessage());
			
		}

	}

}
