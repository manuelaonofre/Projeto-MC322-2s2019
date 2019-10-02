package br.unicamp.ic.mc302.fila;

public class Ingresso {
	
	private Filme filme = new Filme();
	private Sessao sessao = new Sessao();
	
	private String nomeIngresso;
	private String tipo;
	private double preco;
	
	//poltrona escolhe pela sessao e pela sala
	

	public void setSessao(int horas, int min, String sala) {
		sessao.atribuirHorario(horas, min);
		sessao.atribuirSala(sala);
	}
	
	public void setFilmeIngresso(String f) {
		this.filme.setFilme(f);
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
		preco = calculaPreco();
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
