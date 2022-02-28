package agendacontactos;

public class ProbarAgenda {

	public static void main(String[] args) {

		Contacto c1, c2, c3, c4, c5, c6, c7, c8;

		c1 = new Contacto("Carlos", "Herrero", "678678678");
		c2 = new Contacto("Maria", "Perez", "914445566");
		c3 = new Contacto("Pilar", "Gomez", "979445566");
		c4 = new Contacto("Rafael", "Mora", "956333444");
		c5 = new Contacto("Beatriz", "Franco", "645888999");
		c6 = new Contacto("Antonio", "Castellanos", "988777666");
		c7 = new Contacto("Sandra", "Mora", "988989990");
		c8 = new Contacto("Carlos", "Herrero", "945789458");

		// creamos el objeto agenda
		AgendaTelefonica miAgenda = new AgendaTelefonica();

		// agregamos los contactos, en cualquier orden

		miAgenda.agregarContacto(c5);
		miAgenda.agregarContacto(c2);
		miAgenda.agregarContacto(c4);
		miAgenda.agregarContacto(c1);
		miAgenda.agregarContacto(c7);
		miAgenda.agregarContacto(c6);
		miAgenda.agregarContacto(c3);
		miAgenda.agregarContacto(c8);

//		// imprimo la agenda
miAgenda.listarAgenda();
//
//		// buscamos el tel�fono de Antonio Castellanos
//		System.out
//				.println("\n Tel�fono de Antonio Castellanos: " + miAgenda.localizarContacto("Antonio", "Castellanos"));
//
//		// buscamos el tel�fono de Beatriz P�rez
//
//		System.out.println("\n Tel�fono de Beatriz P�rez: " + miAgenda.localizarContacto("Beatriz", "Perez"));
//
//		// buscamos dos n�meros de tel�fono
//		String tel1 = "956333444";
//		String tel2 = "912223344";
//
//		System.out.println("\nEl tel�fono " + tel1 + " pertenece a " + miAgenda.localizarContacto(tel1));
//		System.out.println("\nEl tel�fono " + tel2 + " pertenece a " + miAgenda.localizarContacto(tel2));
////
		// borro un tel�fono
		System.out
				.println(miAgenda.eliminarContacto("Rafael", "Mora") ? "Contacto eliminado" : "Contacto no encontrado");
		
		System.out
		.println(miAgenda.eliminarContacto("Beatriz", "Perez") ? "Contacto eliminado" : "Contacto no encontrado");

		// veo otra vez la agenda

		miAgenda.listarAgenda();

	}

}
