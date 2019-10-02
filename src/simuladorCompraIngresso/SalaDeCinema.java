package simuladorCompraIngresso;

public class SalaDeCinema {
	private int capacidadeMax = 3;
	private int poltronasDisponiveis = 3;
	
	public int getPoltronasDisponiveis() {
		return this.poltronasDisponiveis;
	}
	
	public void utilizarPoltrona() {
		poltronasDisponiveis--;
	}
	
	public int getPoltronasTotais() {
		return this.capacidadeMax;
	}
	
}
