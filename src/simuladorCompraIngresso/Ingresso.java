package simuladorCompraIngresso;

public class Ingresso {
<<<<<<< HEAD
	
	private Filme filme;
=======
	private Filme filme = new Filme();
>>>>>>> kina
	private String nomeIngresso;
	private String tipo;
	private double preco;
	
	//poltrona escolhe pela sessao e pela sala
	
<<<<<<< HEAD
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
=======
//	public Ingresso(String f, String nome, String tip) {
//		this.nomeIngresso = nome;
//		this.tipo = tip;	
//	}
	
	public void setFilme(String f) {
		this.filme.setFilme(f);
	}
	
	public String getFilme() {
		return this.filme.getFilme();
	}

>>>>>>> kina
	public void setNome(String nome) {
		this.nomeIngresso = nome;
	}
	public String getNome() {
		return nomeIngresso;
	}
	public void setTipo(String tip) {
		this.tipo = tip;
	}
<<<<<<< HEAD
	public String getTipo() {
		return tipo;
	}
=======
	
	public String getTipo() {
		return tipo;
	}
	
>>>>>>> kina
	public double getPreco() {
		return preco;
	}
	
<<<<<<< HEAD
	public void calculaPreco() {
		double preco = 5.0;
		if(tipo.equalsIgnoreCase("Inteira")) {
			preco = preco + 5.0;
		}
		this.preco = preco;
=======
	public double calculaPreco() {
		double preco = 5.0;
		if(tipo.equalsIgnoreCase("Inteiro")) {
			preco = preco + 5.0;
		}
		return preco;
	}
	
	public void comprarIngresso(int i) {
		filme.getSessoes().get(i).getSala().utilizarPoltrona();
>>>>>>> kina
	}
	
}
