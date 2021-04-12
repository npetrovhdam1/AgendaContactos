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
		// Creamos nuevo mapa para albergar resultados
				Map<Relacion, Set<String>> personalesRelacionados = new HashMap<Relacion, Set<String>>();
				// recorremos los valores del enumerado relacion
				for (Relacion relacion : Relacion.values()) {
					// creamos nueva entrada para el mapa de resultados
					Entry<Relacion, Set<String>> entrada = Map.entry(relacion, new HashSet<String>());
					// recorremos las entradas de la agenda
					for (Map.Entry<Character, Set<Contacto>> entradaAgenda : agenda.entrySet()) {
						// recorremos los contactos de la entrada
						for (Contacto contacto : entradaAgenda.getValue()) {
							// preguntamos si el contacto es de tipo personal
							if (contacto.getClass() == Personal.class) {
								// convertimos el contact en contacot personal
								Personal contactoPersonal = (Personal) contacto;
								// preguntamos si la relacion del contacto personal es la relacion actual
								if (contactoPersonal.getRelacion() == relacion) {
									// obtenemos nombre y apellidos el contacto
									String nombreApellidos = contactoPersonal.getNombre() + " , "
											+ contactoPersonal.getApellidos();
									// añadimos los nombre y apellidos a la coleccion de la entrada nueva
									entrada.getValue().add(nombreApellidos);
								}
							}
						}

					}
				}

				return personalesRelacionados;
			}

	}

	public List<Personal> personalesOrdenadosPorFechaNacimiento(char letra) {

		return null;

	}

}
