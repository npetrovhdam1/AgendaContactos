import java.util.Random;

public class Profesional extends Contacto {
	private String empresa;

	public Profesional(String nombre, String apellidos, String telefono, String email, String empresa) {
		super(nombre, apellidos, telefono, email);
		this.empresa = capitalizeString(empresa);
	}
