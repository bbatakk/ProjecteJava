package empleados;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Empleados[] trabajador = new Empleados[10];
		
		trabajador[0] = new Empleados("Pepito");
		trabajador[1] = new Empleados("Enrique");
		trabajador[2] = new Empleados("Carmen");
		trabajador[3] = new Empleados("Pepe");
		trabajador[4] = new Empleados("Ana");
		trabajador[5] = new Empleados("José");
		trabajador[6] = new Empleados("Angeles");
		trabajador[7] = new Empleados("Rodolfo");
		
		trabajador[1].cambiaSeccion("Departamento Jurídico");

		
		for(int i=0; i<trabajador.length; i++) {
			System.out.println(trabajador[i].dameDatos());
		}*/
		
		Empleados trabajador1 = new Empleados("Pepito");	
		Empleados trabajador2 = new Empleados("Rodolfo");
		Empleados trabajador3 = new Empleados("María");
		Empleados trabajador4 = new Empleados("Ana");
		Empleados trabajador5 = new Empleados("José");

		trabajador1.cambiaSeccion("RRHH");
		
		System.out.println(trabajador1.dameDatos() + "\n" + trabajador2.dameDatos() + 
				"\n" + trabajador3.dameDatos() + "\n" + trabajador4.dameDatos() + "\n" + 
				trabajador5.dameDatos());
		
		System.out.println(Empleados.dameIdSiguiente());
		
	}

}


class Empleados {
	
	private final String nombre;
	private String seccion;
	
	private int id;
	private static int idSiguiente=1;
	
	
	public Empleados(String nombre) {
		
		this.nombre = nombre;
		seccion="Administración";
		
		id=idSiguiente;
		idSiguiente++;
	}
	
	public void cambiaSeccion(String seccion) {
		
		this.seccion = seccion;
		
	}
	
	public String dameDatos() {
		
		return "Id: " + id + ". El nombre es: " + nombre + " y la sección es " + seccion + ".";
				
	}
	
	public static String dameIdSiguiente() {
		return "El IdSiguiente es: " + idSiguiente;
	}
	
}