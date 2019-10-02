package simuladorCompraIngresso;

public class Ingresso {
	
	private Filme filme = new Filme();

	private String nomeIngresso;
	private String tipo;
	private double preco;
	
	//poltrona escolhe pela sessao e pela sala
	
//	public Ingresso(String f, String nome, String tip) {
//		this.nomeIngresso = nome;
//		this.tipo = tip;	
//	}
	
	public void setFilmeIngresso(String f) {
		this.filme.setFilme(f);
	}
	
	public String getFilme() {
		return this.filme.getFilme();
	}

	public void setNome(String nome) {
		this.nomeIngresso = nome;
	}
	public String getNome() {
		return nomeIngresso;
	}
	public void setTipo(String tip) {
		this.tipo = tip;
	}

	
	public String getTipo() {
		return tipo;
	}
	
	public double getPreco() {
		return preco;
	}

	public Filme getFilme() {
		return filme;
	}

	public double calculaPreco() {
		double preco = 5.0;
		if(tipo.equalsIgnoreCase("Inteiro")) {
			preco = preco + 5.0;
		}
		return preco;
	}
	
	public void comprarIngresso(int i) {
		filme.getSessoes().get(i).getSala().utilizarPoltrona();
	}
	
}
