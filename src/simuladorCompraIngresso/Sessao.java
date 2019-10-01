package src.simuladorCompraIngresso;

public class Sessao {
	private SalaDeCinema sala;
	private int horas;
	private int minutos;
	
	private void atribuirHorario(int horas, int minutos) {
		this.horas = horas;
		this.minutos = minutos;
	}
	
	
	private void imprimirHorario() {
		System.out.println(horas + ":" + minutos);
	}
	
	private void atribuirSala(SalaDeCinema sala) {
		this.sala = sala; 
	}
	
	private SalaDeCinema getSala() {
		return this.sala;
	}
}
