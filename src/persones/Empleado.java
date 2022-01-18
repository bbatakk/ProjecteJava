package persones;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado extends Persona {
	
	private double sueldo;
	private Date altaContrato;
	
	private int id;
	private static int idSiguiente=1;
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {

		super(nom);
		
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato = calendario.getTime();
		
		id = idSiguiente;
		idSiguiente++;
		
	}
	
	public String dameDescripcion() { //GETTER ABSTRACT DESCRIPCION PERSONA
		return "Este empleado tiene un id= " + id + " con un sueldo= " + sueldo + ".";
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
