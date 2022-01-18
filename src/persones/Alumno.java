package persones;

public class Alumno extends Persona {
	
	private String carrera;

	public Alumno(String nom, String carrera) {
		super(nom);
		this.carrera = carrera;
	}
	
	public String dameDescripcion() {
		return "Este alumno esta estudiando la carrera de " + carrera + ".";
	}
	
}
