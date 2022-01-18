package vehículos;

public class Furgoneta extends Coche { //EXTENDS = HEREDAR CLASE COCHE

	private int capacidadCarga, plazasExtra;
	
	public Furgoneta(int capacidadCarga, int plazasExtra) {
		
		super(); //LLAMAR AL CONSTRUCTOR DE LA CLASE PADRE
		
		this.capacidadCarga = capacidadCarga;
		this.plazasExtra = plazasExtra;
		
	}
	
	public String dimeDatosFurgoneta() {
		return "La capacidad de carga es: " + capacidadCarga + ". Y las plazas son: " + plazasExtra + ".";
	}

}
