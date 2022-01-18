package empleados;

import java.util.Arrays;

public class UsoEmpleado {

	public static void main(String[] args) {
		
		Jefatura jefeRRHH = new Jefatura("Juan", 55000, 2006,9,25);
		
		jefeRRHH.estableceIncentivo(2570);
		
		Empleado[] empleado = new Empleado[6];
		
		empleado[0] = new Empleado("José", 1200, 2022, 1, 11);
		empleado[1] = new Empleado("María", 1340, 2007, 23, 12);
		empleado[2] = new Empleado("Rodolfo", 1390, 2005, 12, 03);
		empleado[3] = new Empleado("Ana");
		empleado[4] = jefeRRHH; //POLIMORFISMO 
		empleado[5] = new Jefatura("Maria", 95000, 1999,5,26);
		
		Jefatura jefeInc = (Jefatura) empleado[5]; //CASTING 
		jefeInc.estableceIncentivo(2700);
		
		Arrays.sort(empleado);
		
		System.out.println(jefeInc.tomarDecisiones("Dar más días de vacaciones a los empleados."));
		
		System.out.println(jefeInc.estableceBonus(500));
		
		System.out.println(empleado[3].dameNombre() + empleado[3].estableceBonus(200));
		
		for(Empleado i: empleado) {
			i.subeSueldo(5);
			
			System.out.println(i.dameId() + "Nombre: " + i.dameNombre() + "\n" + 
			"Sueldo: " + i.dameSueldo() + "\n" + "Fecha de contrato: " +  
			i.dameFechaContrato() + "\n");
		}
		
	}
	
}
