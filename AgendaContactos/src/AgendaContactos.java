import java.util.List;
import java.util.Map;
import java.util.Set;

public class AgendaContactos {
	private Map<Character, Set<Contacto>> agenda;

	public AgendaContactos() {

	}

	public void añadirContacto() {

	}

	public void contactosEnLetra() {

	}

	public void totalContactos() {

	}

	@Override
	public String toString() {

		return null;
	}

	public List<Contacto> buscarContactos(String texto) {
		List<Contacto> contactosEncontrados = new ArrayList<Contacto>();
		for (Map.Entry<Character, Set<Contacto>> entradaAgenda : agenda.entrySet()) {
			for (Contacto contacto : entradaAgenda.getValue()) {
				if (contacto.getNombre().contains(texto) || contacto.getApellidos().contains(texto)) {
					contactosEncontrados.add(contacto);
				}
			}
		}

		return contactosEncontrados;
	}

	}

	public List<Personal> personalesEnLetra(char letra) {
		List<Personal> personalesEncontrados = new ArrayList<Personal>();
		for (Map.Entry<Character, Set<Contacto>> entradaAgenda : agenda.entrySet()) {
			if (entradaAgenda.getKey() == letra) {
				for (Contacto contacto : entradaAgenda.getValue()) {
					if (contacto.getClass() == Personal.class) {
						if (contacto.getPrimeraLetra() == letra) {
							personalesEncontrados.add((Personal) contacto);
						}
					}
				}
			}

		}

		return personalesEncontrados;
	}


	}

	public List<Personal> felicitar() {
		List<Personal> personalesAFelicitar = new ArrayList<Personal>();
		for (Map.Entry<Character, Set<Contacto>> entradaAgenda : agenda.entrySet()) {
			for (Contacto contacto : entradaAgenda.getValue()) {
				if (contacto.getClass() == Personal.class) {
					if (((Personal) contacto).esCumpleaños()) {
						personalesAFelicitar.add((Personal) contacto);
					}
				}
			}

		}
		return personalesAFelicitar;
	}


	}

	public void personalesPorRelacion() {

	}

	public List<Personal> personalesOrdenadosPorFechaNacimiento(char letra) {

		return null;

	}

}
