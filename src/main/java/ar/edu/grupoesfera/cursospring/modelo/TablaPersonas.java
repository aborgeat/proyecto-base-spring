package ar.edu.grupoesfera.cursospring.modelo;



import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TablaPersonas {

	private static TablaPersonas instance = new TablaPersonas();
	private List<Persona> personas = new LinkedList<Persona>();

	private TablaPersonas() {
	}

	public static TablaPersonas getInstance() {
		return instance;
	}

	public Boolean crearPersona(Persona persona) {
		return this.personas.add(persona);
	}

	public List<Persona> listarTodas() {
		return this.personas;
	}

	public Persona buscarPersona(String apellido) {

		System.out.println("apellido en buscar " + apellido);
		// return false;
		// else {
		// int index=personas.indexOf(persona);
		// persona.setEdad(edad);
		// personas.set(index, persona);
		// return true;
		// }
		for (Iterator<Persona> it = personas.iterator(); it.hasNext();) {
			Persona each = it.next();

			System.out.println("entro a buscarpersonas");
			System.out.println(each.getNombre() + " " + " "
					+ each.getApellido() + " " + " " + each.getEdad());

			if (each.getApellido().equals(apellido)) {
				System.out.println("entro a if ");
				System.out.println(each.getNombre() + " " + " "
						+ each.getApellido() + " " + " " + each.getEdad());
				return each;

			}

		}
		return null;
	}

	public void modificarPersona(Persona personaModificar) {

		// personas.remove(personaBuscar);
		// System.out.println("la persona a borrar es "
		// +personaBuscar.getApellido());
		// int index = personas.indexOf(personaBuscar);
		// System.out.println("el numero es "+ index);
		// personas.remove(index);

		System.out.println("la persona a agregar es "
				+ personaModificar.getApellido());

		for (Iterator<Persona> it = personas.iterator(); it.hasNext();) {
			Persona each = it.next();

			System.out.println("entro a buscarpersonas");
			System.out.println(each.getNombre() + " " + " "
					+ each.getApellido() + " " + " " + each.getEdad());

			if (each.getApellido().equals(personaModificar.getApellido())) {
				System.out.println("entro a if ");
				System.out.println(each.getNombre() + " " + " "
						+ each.getApellido() + " " + " " + each.getEdad());

				each.setEdad(personaModificar.getEdad());
				each.setEmail(personaModificar.getEmail());
				each.setNombre(personaModificar.getNombre());

				// return each;

			}

		}
	}


	public void borrarPersona(String apellido) {
		for (Iterator<Persona> it = personas.iterator(); it.hasNext();) {
			Persona each = it.next();

			if (each.getApellido().equals(apellido)) {
				personas.remove(apellido);
				// return each;	
				}

}
}
}
