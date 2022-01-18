package vehículos;

public class Coche { //CLASE
	
	private int ruedas, largo, ancho, pesoPlataforma, pesoCarroceria, pesoTotal;
	private String color;
	private boolean asientosCuero, climatizador;
	
	public Coche() { //MÉTODO CONSTRUCTOR
		
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		pesoPlataforma = 500;
		pesoCarroceria = 500;
		
	}
	
	//COLOR COCHE
	public void estableceColor(String colorCoche) { //SETTER
		color = colorCoche;
	}
	
	public String dimeColor() { //GETTER
		return "El coche es de color " + color + ".";
	}
	
	//DATOS GENERALES COCHE
	public String dimeDatosGenerales() { //GETTER
		return "La plataforma del vehículo tiene " + ruedas + " ruedas"+
		". Mide " + largo/1000 + "m, con un ancho de " + ancho +
		"cm y un peso de plataforma de " + pesoPlataforma + "kg.";
	}
	
	//ASIENTOS CUERO COCHE
	public void configuraAsientos(String asientosCuero) { //SETTER
		if(asientosCuero.equalsIgnoreCase("si")) {
			this.asientosCuero = true;
		}else if (asientosCuero == "no"){
			this.asientosCuero = false;
		}
	}
	
	public String dimeAsientos() { //GETTER
		if(asientosCuero) {
			return "El coche tiene asientos de cuero.";
		}else{
			return "El coche tiene asientos de serie.";
		}
	}
	
	//CLIMATIZADOR COCHE
	public void configuraClimatizador(String climatizador) { //SETTER
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		}else{
			this.climatizador = false;
		}
	}
	
	public String dimeClimatizador() { //GETTER
		if(climatizador) {
			return "El coche incorpora climatizador.";
		}else{
			return "El coche lleva aire acondicionado.";
		}
	}
	
	//PESO TOTAL COCHE
	public void configuraPesoTotal() { //SETTER
		this.pesoTotal = pesoPlataforma + pesoCarroceria;
		
		if(asientosCuero) {
			this.pesoTotal += 50;
		}
		if(climatizador) {
			this.pesoTotal += 20;
		}
	}
	
	public String dimePesoTotal() { //GETTER
		return "El peso total del coche es de " + pesoTotal + "kg.";
	}
	
	//PRECIO COCHE
	public int precioCoche() { //GETTER
		int precioFinal = 10000;
		
		if(asientosCuero) {
			precioFinal += 2000;
		}
		if(climatizador) {
			precioFinal += 1500;
		}
		
		return precioFinal;
	}
	
}
