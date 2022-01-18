package persones;

public abstract class Persona {
	
	private String nombre;
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public String dameNombre() {		
		return nombre;
	}
	
	public abstract String dameDescripcion();

}
