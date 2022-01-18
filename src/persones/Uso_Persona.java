package persones;

public class Uso_Persona {

	public static void main(String[] args) {
		
		Persona[] lasPersonas = new Persona[2]; 
		
		lasPersonas[0] = new Empleado("Luis Conde", 50000, 2009,02,25);
		lasPersonas[1] = new Alumno("Manel Serrat", "Física");
		
		for(Persona i: lasPersonas) {
			System.out.println(i.dameNombre() + ", " + i.dameDescripcion());
		}
		
	}
	
}
