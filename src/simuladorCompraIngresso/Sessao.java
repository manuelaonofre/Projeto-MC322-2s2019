
	package simuladorCompraIngresso;
	
	public class Sessao {
		private SalaDeCinema sala;
		private int horas;
		private int minutos;
		
		public void atribuirHorario(int horas, int minutos) {
			this.horas = horas;
			this.minutos = minutos;
		}
		
		public void imprimirHorario() {
			System.out.println(horas + ":" + minutos);
		}
		
		public void atribuirSala(SalaDeCinema sala) {
			this.sala = sala; 
		}
		
		public SalaDeCinema getSala() {
			return this.sala;
		}
		
	}