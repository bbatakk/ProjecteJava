package empleados;

public class Jefatura extends Empleado implements Jefes {
	
	private double incentivo;
	private double bonus;

	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);
		
	}
	
	public String tomarDecisiones(String decision) {
		return "Un miembro de la direción ha tomado la decisión de: " + decision;
	}
	
	public double estableceBonus(double gratificacion) {
		
		double prima = 2000;
		
		bonus = Trabajadores.bonusBase + gratificacion + prima;
		
		return bonus;
				
	}
	
	public void estableceIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	public double dameSueldo() {
		
		double sueldoJefe = super.dameSueldo();
		
		return sueldoJefe + incentivo + bonus;
		
	}
	
}
