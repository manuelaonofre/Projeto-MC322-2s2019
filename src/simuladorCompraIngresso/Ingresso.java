package simuladorCompraIngresso;

public class Ingresso {
	
	private Filme filme;
	private String nomeIngresso;
	private Sessão sessao;
	private String tipo;
	
	//poltrona escolhe pela sessao e pela sala
	
	public Ingresso(Filme f, String nome, Sessão s, String tip) {
		super();
		this.setFilme(f);
		this.nomeIngresso = nome;
		this.setSessao(s);
		this.tipo = tip;
		
		
	}
	
	public void setFilme(Filme f) {
		this.filme = f;
	}
	public Filme getFilme() {
		return filme;
	}
	
	public void setSessao(Sessão s) {
		this.sessao = s;
	}
	public Sessão getSessao() {
		return sessao;
	}

}
