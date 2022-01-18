package empleados;

import java.util.*;

public class Empleado implements Comparable, Trabajadores {

	public int compareTo(Object miObjeto) {
		Empleado otroEmpleado=(Empleado) miObjeto;
		if(this.sueldo<otroEmpleado.sueldo) {
			return -1;
		}
		
		if(this.sueldo>otroEmpleado.sueldo) {
			return 1;
		}
		
		return 0;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	private int id;
	private static int idSiguiente=1;
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		 
		nombre = nom;
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato = calendario.getTime();
		
		id = idSiguiente;
		idSiguiente++;
		
	}
	
	public double estableceBonus(double gratificacion) {
		return Trabajadores.bonusBase+gratificacion;
	}
	
	public Empleado(String nom) {
		this(nom, 1000, 2000,01,01);
	}
	
	public String dameNombre() { //GETTER NOMBRE
		return nombre;
	}
	
	public double dameSueldo() { //GETTER SUELDO
		return sueldo;
	}
	
	public Date dameFechaContrato() { //GETTER FECHA CONTRATO
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) { //SETTER AUMENTO
		
		double aumento = sueldo * porcentaje / 100;
		
		sueldo += aumento;
		
	}
	
	public String dameId() { //GETTER ID
		return "Id: " + id + ". ";
	}
	
}
