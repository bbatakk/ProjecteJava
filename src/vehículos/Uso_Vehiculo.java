package vehículos;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche miCoche1 = new Coche();
		
		miCoche1.estableceColor("Rojo");
		
		Furgoneta miFurgoneta1 = new Furgoneta(580, 7);
		
		miFurgoneta1.estableceColor("Azul");
		miFurgoneta1.configuraAsientos("Si");
		miFurgoneta1.configuraClimatizador("Si");
		
		System.out.println(miCoche1.dimeDatosGenerales() + " " + miCoche1.dimeColor());
		
		System.out.println(miFurgoneta1.dimeDatosGenerales() + " " + miFurgoneta1.dimeDatosFurgoneta());
		
	}

}

/*

Diseño de la herencia. La regla "Es un..." (Ej: Un coche es un vehículo?)

Vehículo
	- Coche
	- Furgoneta
	- Camión
	- Moto

*/
