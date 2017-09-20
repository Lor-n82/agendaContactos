

public class contacto {
	private String nombre;
	private String apellido;
	private String dni;
	private String telefono;
	
	public contacto(String n, String a, String d, String t) {
		setNombre(n);
		setApellido(a);
		setDni(d);
		setTelefono(t);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(!nombre.isEmpty())
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		if(!apellido.isEmpty())
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		if(telefono.length()>0)
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Nombre: "+getNombre()+" Apellido: "+getApellido()+" DNI: "+dni+" Telefono: "+telefono;
	}
	
	
	}

