package simuladorCompraIngresso;

public class Ingresso {
	
	private Filme filme;
	private String nomeIngresso;
	private String tipo;
	
	//poltrona escolhe pela sessao e pela sala
	
	public Ingresso(Filme f, String nome, String tip) {
		super();
		this.setFilme(f);
		this.nomeIngresso = nome;
		this.tipo = tip;
		
		
	}
	
	public void setFilme(Filme f) {
		this.filme = f;
	}
	public Filme getFilme() {
		return filme;
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
	
	public double calculaPreco() {
		double preco = 5.0;
		if(tipo.equalsIgnoreCase("Inteiro")) {
			preco = preco + 5.0;
		}
		return preco;
	}
	
}
