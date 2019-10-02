package br.unicamp.ic.mc302.fila;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private List<String> nomes = new ArrayList<String>();
	private String user;
	private String senha;
	private List<Ingresso> ingressos = new ArrayList<Ingresso>();
	private int numIngressos;
	
	public String getNome(int i) {
		return nomes.get(i);
	}

	public void setNome(String nome, int i) {
		nomes.add(i, nome);
	}


	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public int getNumIngressos() {
		numIngressos = ingressos.size();
		return numIngressos;
	}
	
	public Ingresso getIngresso(int i){
		return this.ingressos.get(i);
	}
	
	public void setIngresso(String filme, int tipo, String nome) {
		Ingresso ing = new Ingresso();
		ing.setFilmeIngresso(filme);
		ing.setNome(nome);
		if(tipo == 1)
			ing.setTipo("meia");
		if(tipo == 2)
			ing.setTipo("inteiro");
		ingressos.add(ing);
	}

}